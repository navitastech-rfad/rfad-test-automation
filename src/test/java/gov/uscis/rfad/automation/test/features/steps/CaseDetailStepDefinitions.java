package gov.uscis.rfad.automation.test.features.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uscis.rfad.automation.test.features.steps.serenity.CaseDetailSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class CaseDetailStepDefinitions extends ScenarioSteps {

    @Steps
    CaseDetailSteps caseDetailSteps;

    @Given("^List Cases page has list of cases$")
    public void list_cases_page_has_list_of_cases() throws Throwable {
        caseDetailSteps.openPage();
    }

    @When("^I select a (.*) on the page$")
    public void i_select_a_on_the_page(String casenumber) throws Throwable {
        throw new PendingException();
    }

    @Then("^I can obtain the case details showing (.*), (.*), (.*), (.*) and (.*)$")
    public void i_can_obtain_the_case_details_showing_and(String casenumber, String benefitapplied, String firstname, String lastname, String address) throws Throwable {
        throw new PendingException();
    }
}
