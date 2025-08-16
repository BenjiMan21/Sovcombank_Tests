package com.nikiforov.tests;

import com.nikiforov.extensions.LoggingExtension;
import com.nikiforov.pages.BeginCareerPage;
import com.nikiforov.pages.MainPage;
import com.nikiforov.pages.VacanciesByCityPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Тесты для Совкомбанка")
@ExtendWith(LoggingExtension.class)
public class FindVacancyTests extends TestBase {

    MainPage mainPage = new MainPage();
    VacanciesByCityPage vacanciesPage = new VacanciesByCityPage();
    BeginCareerPage beginCareerPage = new BeginCareerPage();

    @ParameterizedTest
    @CsvSource({"Казань, Java", "Новосибирск, PHP"})
    void succesfullFindVacancyTest(String cityName, String jobName) {
        mainPage.openPage()
                .setCity(cityName)
                .setJob(jobName)
                .clickFindButton();
        vacanciesPage.checkVacancies(jobName);
    }

    @ParameterizedTest
    @CsvSource({"Казань, Совкомбанк Технологии, Младший аналитик", "Томск, Совкомбанк, Специалист"})
    void succesfullFindVacancyBeginCareerTest(String cityName, String companyName, String jobName) {
        mainPage.openPage()
                .clickBeginCareerButton();
        beginCareerPage.clickTraineeButton()
                .setCity(cityName)
                .setCompany(companyName)
                .clickOk()
                .jobCheck(jobName);
    }
}