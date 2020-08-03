package performance;

import core.PerformanceTestBase;
import org.testng.annotations.Test;

public class PerformanceTest  extends PerformanceTestBase {

    @Test
    public void performanceTest() {
        startHarRecording();
        driver.get("https://moneyman.ru/");
        finishHarRecording();

    }
}
