package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserStackDriver;
import drivers.EmulationDriver;
import drivers.RealDeviceDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    public static String deviceHost = System.getProperty("deviceHost");

    @BeforeAll
    static void beforeAll() {
        switch (deviceHost) {
            case "browserstack":
                Configuration.browser = BrowserStackDriver.class.getName();
                break;
            case "emulation":
                Configuration.browser = EmulationDriver.class.getName();
                break;
            case "real":
                Configuration.browser = RealDeviceDriver.class.getName();
                break;
            default:
                throw new IllegalStateException(
                        "Системное свойство 'deviceHost' не задано или некорректно. Запускайте тесты через " +
                                "'./gradlew browserstack_test/local_test/real_test' " +
                                "(либо передайте -DdeviceHost=browserstack/emulation/real вручную)."
                );
        }

        Configuration.browserSize = null;
        Configuration.pageLoadTimeout = -1;
        Configuration.screenshots = false;
        Configuration.timeout = 30000;
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void tearDown() {
        switch (deviceHost) {
            case "browserstack":
                String sessionId = Selenide.sessionId().toString();
                Attach.pageSource();
                Attach.addVideo(sessionId);
                break;
            case "emulation":
            case "real":
                Attach.screenshotAs("Last screenshot");
                Attach.pageSource();
        }
        closeWebDriver();
    }
}