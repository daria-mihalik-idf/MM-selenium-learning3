package base;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        open("https://www.google.by/");
    }
}
