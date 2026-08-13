package helpers;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;

import java.util.Map;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Gestures {

    @Step("Тапнуть по координатам ({x}, {y})")
    public static void tap(int x, int y) {
        ((JavascriptExecutor) getWebDriver()).executeScript("mobile: clickGesture", Map.of(
                "x", x,
                "y", y
        ));
    }

    @Step("Тапнуть за рамками элемента (выше на {offsetPx}px)")
    public static void tapAboveElement(SelenideElement element, int offsetPx) {
        Rectangle rect = element.getRect();
        tap(rect.getX() + rect.getWidth() / 2, rect.getY() - offsetPx);
    }
}