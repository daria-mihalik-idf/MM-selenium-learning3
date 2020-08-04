package performance;

import core.PerformanceBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerformanceTest  extends PerformanceBaseTest {

    @Test
    public void performanceTest() throws InterruptedException {
        startHarRecording();
        driver.get("https://moneyman.com.mx/");
        WebElement text = driver.findElement(By.tagName("h1"));
        assertEquals(text.getText(), "Préstamos en línea");
        finishHarRecording();
    }
}
