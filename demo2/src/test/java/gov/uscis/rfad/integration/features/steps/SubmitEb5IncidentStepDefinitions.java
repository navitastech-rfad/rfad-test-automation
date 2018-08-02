package gov.uscis.rfad.integration.features.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uscis.rfad.integration.features.steps.serenity.SubmitEb5IncidentSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by tnguyen on 8/1/18.
 */

public class SubmitEb5IncidentStepDefinitions extends ScenarioSteps {

    @Steps
    SubmitEb5IncidentSteps submitEb5IncidentSteps;

}
