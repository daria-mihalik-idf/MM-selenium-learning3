package stepdefs;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

public class MainHooks {

    @BeforeMethod
    public void prepare() {
        Configuration.browser = "Chrome";
        Configuration.baseUrl = "https://www.google.by/";
        Configuration.timeout = 10000;
    }
}
