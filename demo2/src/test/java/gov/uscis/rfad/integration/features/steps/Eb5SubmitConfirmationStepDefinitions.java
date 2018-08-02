package gov.uscis.rfad.integration.features.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uscis.rfad.integration.features.steps.serenity.Eb5SubmitConfirmationSteps;
import net.thucydides.core.annotations.Steps;

/**
 * Created by tnguyen on 7/23/18.
 */

public class Eb5SubmitConfirmationStepDefinitions {

    @Steps
    Eb5SubmitConfirmationSteps listCaseSteps;

    @Given("^That I have entered my EB5 scam incident$")
    public void that_i_have_entered_my_eb5_scam_incident() throws Throwable {
        throw new PendingException();
    }

    @When("^I click Send$")
    public void i_click_send() throws Throwable {
        throw new PendingException();
    }

    @Then("^I can see a message notifying me that my submission was successful$")
    public void i_can_see_a_message_notifying_me_that_my_submission_was_successful() throws Throwable {
        throw new PendingException();
    }

}
