package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class AppTests extends TestBase {
    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Test title of habr")
    void generatedTest() {
        step("Open website", () -> {
            open("https://habr.com/ru/");
        });

        step("Check Articles", () -> {
            $(".tabs-menu__item-text ").shouldHave(text("Статьи"));
        });
        step("Check All streams", () -> {
            $(".page-header").shouldHave(text("Все потоки"));
        });

    }
}