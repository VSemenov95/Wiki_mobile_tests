package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserStackDriver;
import drivers.LocalDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    public static String tag = System.getProperty("tag");

    @BeforeAll
    static void beforeAll() {
        switch (tag) {
            case "browserstack":
                Configuration.browser = BrowserStackDriver.class.getName();
                break;
            case "local":
                Configuration.browser = LocalDriver.class.getName();
                break;
            default:
            throw new IllegalStateException(
                    "Системное свойство 'tag' не задано. Запускайте тесты через " +
                            "'./gradlew browserstack_test/local_test'" +
                            "(либо передайте -Dtag=browserstack/local вручную)."
            );
        }

        if (tag.equals("browserstack")) {
            Configuration.browser = BrowserStackDriver.class.getName();
        } else {
            throw new IllegalStateException("Неизвестный tag: '" + tag + "'. Ожидается 'browserstack' или 'local'.");
        }
        Configuration.browserSize = null;
        Configuration.timeout = 30000;
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void tearDown() {
        switch (tag) {
            case "browserstack":
                String sessionId = Selenide.sessionId().toString();

                Attach.pageSource();
                Attach.addVideo(sessionId);
                break;
            case "local":
                Attach.screenshotAs("Last screenshot");
                Attach.pageSource();
        }
        closeWebDriver();
    }
}