package screens;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static data.TestData.TITLE_SET;
import static io.appium.java_client.AppiumBy.*;

public class SettingsScreen {

    private final SelenideElement settings = $(id("org.wikipedia.alpha:id/explore_overflow_settings")),
            moreButton = $(accessibilityId("More")),
            settingMenu = $(id("org.wikipedia.alpha:id/main_drawer_settings_container")),
            screenSetting = $(androidUIAutomator("new UiSelector().text(\"Settings\")")),
            settingTitle = $(byXpath("//android.view.ViewGroup[@resource-id=\"org.wikipedia.alpha:id/toolbar\"]//android.widget.TextView[@text=\"Settings\"]"));

    @Step("Нажать на Settings в открывшемся меню")
    public SettingsScreen tapSettings() {
        settings.click();
        return this;
    }

    @Step("Проверить, что открывается экран Setting")
    public SettingsScreen checkScreenSetting() {
        screenSetting.shouldHave(Condition.text(TITLE_SET));
        return this;
    }

    @Step("Проверить заголовок на странице настроек")
    public SettingsScreen checkTitleSettings() {
        settingTitle.shouldHave(Condition.text(TITLE_SET));
        return this;
    }

    @Step("Нажатие на кнопку больше")
    public SettingsScreen clickButtonMore() {
        moreButton.click();
        return this;
    }

    @Step("Нажать на Settings в меню")
    public SettingsScreen clickSettings() {
        settingMenu.click();
        return this;
    }
}