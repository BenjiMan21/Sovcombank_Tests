package com.nikiforov.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BeginCareerPage {
    private final SelenideElement traineeButton = $(".btn--thirdly");
    private final SelenideElement cityInput = $(".ui-selector");
    private final SelenideElement companySelector = $("#company");
    private final SelenideElement arrowCompanySelector = $(".input__arrow");
    private final SelenideElement jobCheck = $(".teams__cards");
    private final ElementsCollection citySelect = $$(".multiselect__element");
    private final ElementsCollection companySelect = $$(".input__dropdown-item");
    private final ElementsCollection okButton = $$("button");


    public  BeginCareerPage clickTraineeButton() {
        traineeButton.click();
        return this;
    }

    public BeginCareerPage setCity(String value) {
        cityInput.click();
        citySelect.find(text(value)).click();
        return this;
    }

    public BeginCareerPage setCompany(String value) {
        companySelector.click();
        companySelect.find(text(value)).click();
        arrowCompanySelector.click();
        return this;
    }
    public BeginCareerPage clickOk() {
        okButton.findBy(text(" Ок ")).click();
        return this;
    }

    public BeginCareerPage jobCheck(String value) {
        jobCheck.shouldHave(text(value));
        return  this;
    }
}
