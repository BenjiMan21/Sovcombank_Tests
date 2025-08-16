package com.nikiforov.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
@BeforeAll
    static void beforeAll() {
    Configuration.browser = "chrome";
//    Configuration.browserVersion = "128.0";
    Configuration.browserSize = "1920x1080";
    Configuration.pageLoadStrategy = "eager";
//    Configuration.timeout = 6000;
//    Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
//    options.addArguments("--no-sandbox");
//    options.addArguments("--disable-dev-shm-usage");
//    options.addArguments("--disable-gpu");
//    options.addArguments("--disable-extensions");
    Configuration.browserCapabilities = options;
    }
}
