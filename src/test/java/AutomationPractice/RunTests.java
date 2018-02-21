package AutomationPractice;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/AutomationPractice/Features",tags={"@validLogin"},format={"html:target/site/cucumber-pretty"})
public class RunTests {
}
