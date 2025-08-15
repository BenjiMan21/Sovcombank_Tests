package com.nikiforov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class VacanciesByCityPage {
    private final SelenideElement vacanciesList = $(".vacancies__container");

    public VacanciesByCityPage checkVacancies(String value) {
        vacanciesList.shouldHave(text(value));
        return this;
    }
}
