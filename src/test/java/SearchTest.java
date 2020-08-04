import base.TestBase;
import org.hamcrest.Description;
import org.junit.Test;
import pages.GoogleSearchPage;
import pages.GoogleSearchResultsPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

@Features("Google Search feature")
public class SearchTest extends TestBase {

    @Title("Google basic search test")
    @Description("This test searchis for something on Google")
    @Stories("Success story")
    @Test
    public void SearchTest() {
        String searchText = "Selenide";

        GoogleSearchPage.search(searchText);
        GoogleSearchResultsPage.verifySearchResult(searchText);
    }

    @Title("Failing Google search Test")
    @ru.yandex.qatools.allure.annotations.Description("This is a test that fails on purpose")
    @Stories("Success false")
    @Test
    public void failingTest() {
        GoogleSearchPage.causeFailure();

    }

    @Title("Broken Google search test")
    @ru.yandex.qatools.allure.annotations.Description("This is a test that searches for nonsence element")
    @Test
    public void brokenTest() {
        GoogleSearchPage.causeBrokenTest();
    }

    @Title("Pending Google search Test")
    @ru.yandex.qatools.allure.annotations.Description("This is a test that's currently in development")
    @Test(enabled = false)
    @Stories("Success false")
    public void pendingTest() {
        //TODO: implement some need google search checks
    }

}
