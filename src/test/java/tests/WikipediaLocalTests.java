package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.MainScreen;
import screens.OnboardingScreen;
import screens.SearchScreen;
import screens.SettingsScreen;
import static data.TestData.SEARCH_QUERY;


public class WikipediaLocalTests extends TestBase {
    SearchScreen searchScreen = new SearchScreen();
    SettingsScreen settingsScreen = new SettingsScreen();
    MainScreen mainScreen = new MainScreen();
    OnboardingScreen onboardingScreen = new OnboardingScreen();


    @Tag("local")
    @DisplayName("Поиск по валидному запросу и отображение списка результатов")
    @Test
    void successfulSearchLocal() {
        searchScreen.skipStartScreen()
                .tabSearchInputOnMenu()
                .skipModalWindow()
                .searchInput()
                .setKeyInput(SEARCH_QUERY)
                .verifySearchResultsAreDisplayed(SEARCH_QUERY);
    }


    @Tag("local")
    @DisplayName("Удаление запроса в строке поиска")
    @Test
    void deletingQuerySearchLocal() {
        searchScreen.skipStartScreen()
                .tabSearchInputOnMenu()
                .skipModalWindow()
                .searchInput()
                .setKeyInput(SEARCH_QUERY)
                .tapSearchCloseBtn()
                .verifySearchSrcText();
    }


    @Tag("local")
    @DisplayName("Переход в настройки Wiki")
    @Test
    void goToSettingsScreenLocal() {
        searchScreen.skipStartScreen();
        settingsScreen
                .clickButtonMore()
                .clickSettings()
                .checkTitleSettings();

    }

    @Tag("local")
    @DisplayName("Переход на экран результата")
    @Test
    void successfulGoToResultScreenLocal() {
        searchScreen.skipStartScreen()
                .tabSearchInputOnMenu()
                .skipModalWindow()
                .searchInput()
                .setKeyInput(SEARCH_QUERY)
                .tapFirstSearchResult()
                .skipModalWindowOnResultScreen()
                .skipModalWindowToolbarSettings()
                .verifyTitleSearchResult(SEARCH_QUERY);
    }

    @Tag("local")
    @DisplayName("Проверка экранов onboarding screen")
    @Test
    void validateOnboardingScreen() {
        onboardingScreen.validateFirstScreen()
                .pressNextButtonFirstScreen()
                .validateSecondScreen()
                .pressNextButtonSecondScreen()
                .validateThirdScreen()
                .pressNextButtonThirdScreen()
                .validateFourthScreen()
                .pressNextButtonFourthScreen()
                .validateFifthScreen()
                .pressNextButtonFifthScreen()
                .validateSixthScreen()
                .pressNextButtonSixthScreen();

    }
}
