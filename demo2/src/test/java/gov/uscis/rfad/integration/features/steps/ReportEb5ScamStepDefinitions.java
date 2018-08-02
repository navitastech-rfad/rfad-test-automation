package gov.uscis.rfad.integration.features.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uscis.rfad.integration.features.steps.serenity.ReportEb5ScamSteps;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

/**
 * Created by tnguyen on 8/1/18.
 */

public class ReportEb5ScamStepDefinitions {

    @Steps
    ReportEb5ScamSteps reportEb5ScamSteps;

    @Given("^I am on the USCIS EB5 scam$")
    public void i_am_on_the_uscis_eb5_scam() throws Throwable {
        throw new PendingException();
    }

    @When("^I click on Submit New button$")
    public void i_click_on_submit_new_button() throws Throwable {
        throw new PendingException();
    }

    @Then("^I will be redirect to submit a scam$")
    public void i_will_be_redirect_to_submit_a_scam() throws Throwable {
        throw new PendingException();
    }
}
