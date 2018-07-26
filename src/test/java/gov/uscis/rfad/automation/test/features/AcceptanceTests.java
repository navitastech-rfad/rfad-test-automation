package gov.uscis.rfad.automation.test.features;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

/**
 * Created by tnguyen on 7/19/18.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login",
        plugin = { "pretty" }
        //,tags = {"@story_1"}
)
public class AcceptanceTests {
}
