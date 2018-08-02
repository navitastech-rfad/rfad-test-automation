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

    @Given("^I am on the Submit New page$")
    public void i_am_on_the_submit_new_page() throws Throwable {
        throw new PendingException();
    }

    @When("^I entered (.*), (.*), (.*), (.*) and (.*)$")
    public void i_entered_and(String firstname, String lastname, String email, String phonenumber, String descriptions) throws Throwable {
        throw new PendingException();
    }

    @Then("^I am able to submit the scam$")
    public void i_am_able_to_submit_the_scam() throws Throwable {
        throw new PendingException();
    }
}
