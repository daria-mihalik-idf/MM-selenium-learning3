import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.tools.ant.taskdefs.condition.Condition;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class JBahaveStepDefs {

    @Given("User is on Google page")
    public void givenUserIsOnGooglePage() {
        Configuration.browser = "Chrome";
        Configuration.baseUrl = "https://www.google.by/";
        Configuration.timeout = 10000;
        open(Configuration.baseUrl);
    }

    @When("User enters '$searchText' in search field")
    public void whenUserEntersInSearchField(@Named("searchText") String searchText) {
        $(By.id("lst-ib")).sendKeys(searchText);
    }

    @When("User click Search button")
    public void whenUserClickSearchButton() {
        $(By.id("lst-ib")).submit();
    }

    @Then("User clicks '$link' link")
    public void thenUserClicksLink(@Named("link") String linkText) throws InterruptedException {
        ElementsCollection links = $$(By.className("r"));
        SelenideElement ourLink = links.find(Condition.hasText(link));
        ourLink.click();

        Thread.sleep(3000);
    }
}
