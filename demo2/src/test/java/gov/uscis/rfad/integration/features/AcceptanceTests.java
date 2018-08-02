package gov.uscis.rfad.integration.features;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

/**
 * Created by tnguyen on 8/1/18.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = { "pretty" }
)
public class AcceptanceTests {
}
