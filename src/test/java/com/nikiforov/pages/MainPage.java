package com.nikiforov.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement cityInput = $(".ui-selector");
    private final SelenideElement jobInput = $(".ui-input");
    private final SelenideElement findButton = $(".intro__block-btn");
    private final SelenideElement vacanciesButton = $(".desktop-navbar__link");
    private final ElementsCollection citySelect = $$(".multiselect__element");


    public MainPage openPage() {
        open("https://people.sovcombank.ru");
        return this;
    }

    public MainPage setCity(String value) {
        cityInput.click();
        citySelect.find(text(value)).click();
        return this;
    }

    public MainPage setJob(String value) {
        jobInput.setValue(value);
        return this;
    }

    public MainPage clickFindButton() {
        findButton.click();
        return this;
    }

    public MainPage clickBeginCareerButton() {
        vacanciesButton.click();
        return this;
    }
}
