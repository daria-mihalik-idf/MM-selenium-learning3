package stepdefs;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features = {"src/main/resources"},
        format = {"prety", "html:target/reports/cucumber/html", "json;target/cucumber.json",
                "" + "usage:target/usage.jsonx", "junit:target/junit.xml"}, tags = {"@done}"})

public class MainTest {
}
