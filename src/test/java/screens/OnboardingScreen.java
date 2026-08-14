package screens;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class OnboardingScreen {
   SelenideElement nextButtonFirstOnboardingScreen = $(byXpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View")),
           nextButtonSecondOnboardingScreen = $(byXpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]")),
           nextButtonThirdOnboardingScreen = $(byXpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]")),
           nextButtonFourthOnboardingScreen = $(byXpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]")),
           nextButtonFifthOnboardingScreen = $(byXpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]")),
           nextButtonSixthOnboardingScreen = $(byXpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]")),
           titleFirstScreenOnboarding = $(byXpath("//android.widget.TextView[@text=\"All the world's knowledge\"]")),
           titleSecondScreenOnboarding = $(byXpath("//android.widget.TextView[@text=\"Data & Privacy\"]")),
           titleThirdScreenOnboarding = $(byXpath("//android.widget.TextView[@text=\"Read in more than 300 languages\"]")),
           titleFourthScreenOnboarding = $(byXpath("//android.widget.TextView[@text=\"Follow your curiosity\"]")),
           titleFifthScreenOnboarding = $(byXpath("//android.widget.TextView[@text=\"What are you interested in?\"]")),
           titleSixthScreenOnboarding = $(byXpath("//android.widget.TextView[@text=\"What would you like to see first?\"]")),

           continueButton = $(byXpath("//android.widget.Button[@resource-id=\"org.wikipedia.alpha:id/fragment_onboarding_forward_button\"]"));

   @Step("Нажать на кнопку Continue")
   public OnboardingScreen pressContinue() {
       continueButton.click();
       return this;
   }

   @Step("Нажать кнопку далее на первом экране")
   public OnboardingScreen pressNextButtonFirstScreen() {
       nextButtonFirstOnboardingScreen.click();
       return this;
   }

    @Step("Нажать кнопку далее на втором экране")
    public OnboardingScreen pressNextButtonSecondScreen() {
        nextButtonSecondOnboardingScreen.click();
        return this;
    }

    @Step("Нажать кнопку далее на третьем экране")
    public OnboardingScreen pressNextButtonThirdScreen() {
        nextButtonThirdOnboardingScreen.click();
        return this;
    }

    @Step("Нажать кнопку далее на четвертом экране")
    public OnboardingScreen pressNextButtonFourthScreen() {
        nextButtonFourthOnboardingScreen.click();
        return this;
    }

    @Step("Нажать кнопку далее на пятом экране")
    public OnboardingScreen pressNextButtonFifthScreen() {
        nextButtonFifthOnboardingScreen.click();
        return this;
    }

    @Step("Нажать кнопку далее на шестом экране")
    public OnboardingScreen pressNextButtonSixthScreen() {
        nextButtonSixthOnboardingScreen.click();
        return this;
    }

    @Step("Проверка текста на первом экране онбординга")
    public OnboardingScreen validateFirstScreen()
    {
        titleFirstScreenOnboarding.shouldHave(Condition.text("All the world's knowledge"));
        return this;
    }

    @Step("Проверка текста на втором экране онбординга")
    public OnboardingScreen validateSecondScreen()
    {
        titleSecondScreenOnboarding.shouldHave(Condition.text("Data & Privacy"));
        return this;
    }

    @Step("Проверка текста на третьем экране онбординга")
    public OnboardingScreen validateThirdScreen()
    {
        titleThirdScreenOnboarding.shouldHave(Condition.text("Read in more than 300 languages"));
        return this;
    }

    @Step("Проверка текста на четвертом экране онбординга")
    public OnboardingScreen validateFourthScreen()
    {
        titleFourthScreenOnboarding.shouldHave(Condition.text("Follow your curiosity"));
        return this;
    }

    @Step("Проверка текста на пятом экране онбординга")
    public OnboardingScreen validateFifthScreen()
    {
        titleFifthScreenOnboarding.shouldHave(Condition.text("What are you interested in?"));
        return this;
    }

    @Step("Проверка текста на шестом экране онбординга")
    public OnboardingScreen validateSixthScreen()
    {
        titleSixthScreenOnboarding.shouldHave(Condition.text("What would you like to see first?"));
        return this;
    }
}
