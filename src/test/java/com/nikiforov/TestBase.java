package com.nikiforov;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
@BeforeAll
    static void beforeAll() {
    Configuration.browser = "chrome";
    Configuration.browserSize = "1920x1080";
    Configuration.timeout = 6000;

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    Configuration.browserCapabilities = options;
    }
}
