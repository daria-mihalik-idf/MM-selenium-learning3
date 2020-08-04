package pages;

import com.codeborne.selenide.Condition;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchResultsPage {

    @Step("Verify that the search result contains {0}")
    public static void verifySearchResult(String searchText) {
        $("h3.r a").shouldHave(Condition.text(searchText));
    }
}
