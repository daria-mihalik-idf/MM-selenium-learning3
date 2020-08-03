package saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SauceTest {
    public static final String USERNAME = "dashiki";
    public static final String ACCESS_KEY = "568957d5-t589-26a7-980d-5fert665c5s1";
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";


    @Test
    public void sauceTest() throws InterruptedException {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", Platform.WINDOWS);
        caps.setCapability("version", "43.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("https://www.google.by/");

        WebElement searchField = driver.findElement(By.name("q"));

        searchField.sendKeys("Sauce Labs");
        searchField.submit();

        Thread.sleep(2000);

        driver.quit();
    }
}
