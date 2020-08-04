import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SearchTest {

    @Test
    public void searchTest() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        String searchText = "Selenide";

        open("https://www.google.by/");
        $(By.name("q")).sendKeys(searchText);
        $("h3.r a").shouldHave(Condition.text(searchText));
        $(byText("Some button"));
    }
}
