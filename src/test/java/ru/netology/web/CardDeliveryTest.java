package ru.netology.web;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

class CardDeliveryTest {
    @Test
    void shouldTestAllFieldsCorrectly() {
        open("http://localhost:9999");

        $("[data-test-id=city] input").setValue("Москва");
        $("[data-test-id=date] input").setValue("02.11.2019");
        $("[data-test-id=name] input").setValue("Иван Петров");
        $("[data-test-id=phone] input").setValue("+79270000000");
        $("[data-test-id=agreement]").click();
        $(".button").click();

        $(withText("Успешно!")).waitUntil(visible, 15000);

    }
}
