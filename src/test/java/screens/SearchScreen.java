package screens;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import helpers.Gestures;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static data.TestData.PLACEHOLDER;
import static data.TestData.TITLE_SET;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchScreen {
    Gestures gestures = new Gestures();
    private final SelenideElement searchInput = $(accessibilityId("Search Wikipedia")),
            searchInputOnMenu = $(accessibilityId("Search")),
            keyInput = $(id("org.wikipedia.alpha:id/search_src_text")),
            searchResultTitle = $(byXpath("(//android.widget.TextView[@text=\"Appium\"])[1]")),
            searchCloseBtn = $(id("org.wikipedia.alpha:id/search_close_btn")),
            modalWindowFasterSearchCloseButton = $(byXpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.Button")),
            searchSrcText = $(id("org.wikipedia.alpha:id/search_src_text")),
            resultModalWindow = $(accessibilityId("Close"));

    private final ElementsCollection searchResults =
            $$(byXpath("//*[@resource-id='org.wikipedia.alpha:id/fragment_search_results']//android.widget.TextView")),
            firstSearchResult = $$(byClassName("android.view.View"));

    @Step("Скрыть стартовый экран")
    public SearchScreen skipStartScreen() {
        back();
        return this;
    }

    @Step("Кликнуть вне всплывающего окна настройки тулбара для закрытия")
    public SearchScreen skipModalWindowToolbarSettings() {
        Gestures.tap(500,500);
        return this;
    }

    @Step("Закрыть модальное окно")
    public SearchScreen skipModalWindowOnResultScreen() {
        resultModalWindow.click();
        return this;
    }

    @Step("Закрыть модальное окно")
    public SearchScreen skipModalWindow() {
        modalWindowFasterSearchCloseButton.click();
        return this;
    }


    @Step("Перейти на страницу поиска")
    public SearchScreen tabSearchInputOnMenu() {
        searchInputOnMenu.click();
        return this;
    }

    @Step("Нажать на строку поиска")
    public SearchScreen searchInput() {
        searchInput.click();
        return this;
    }

    @Step("Ввести в строку поиска \"{value}\"")
    public SearchScreen setKeyInput(String value) {
        keyInput.sendKeys(value);
        return this;
    }

    @Step("Убедиться, что отображаются результаты поиска")
    public void verifySearchResultsAreDisplayed(String value) {
        searchResults.filterBy(text(value)).shouldHave(sizeGreaterThan(0));

    }

    @Step("Нажать на первый результат поиска в списке")
    public SearchScreen tapFirstSearchResult() {
        firstSearchResult.first().click();
        return this;
    }

    @Step("Проверить, что заголовок экрана соответствует поисковому результату")
    public void verifyTitleSearchResult(String value) {
        searchResultTitle.shouldHave(text(value));
    }

    @Step("Нажать на крестик в строке поиска")
    public SearchScreen tapSearchCloseBtn() {
        searchCloseBtn.click();
        return this;
    }

    @Step("Проверить, что в строке поиска отображается плейсхолдер")
    public void verifySearchSrcText() {
        searchSrcText.shouldHave(text(PLACEHOLDER));
    }
}