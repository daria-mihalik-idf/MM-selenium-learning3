package core;

import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.ProxyServer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class PerformanceBaseTest {

    protected WebDriver driver;
    private ProxyServer proxy;
    private Har har;
    private String testName;

    @BeforeMethod
    protected void setup(Method method) throws Exception {
        testName = method.getName();
        proxy = new ProxyServer(444);
        proxy.start();

        proxy.setRequestTimeout(6000);
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(CapabilityType.PROXY, proxy.seleniumProxy());

        driver = new ChromeDriver(caps);
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    protected void teardown() throws Exception {
        proxy.stop();
        driver.quit();
    }

    protected void startHarRecording() {
        proxy.newHar("performanceTest");
    }

    protected void finishHarRecording() {
        har = proxy.getHar();
    }

    protected void savehar() throws IOException {
        har.writeTo(new File("C:\\" + testName + ".har"));
    }
}
