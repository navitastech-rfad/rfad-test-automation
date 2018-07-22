package gov.uscis.rfad.automation.test.features.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uscis.rfad.automation.test.features.steps.serenity.CaseSteps;
import net.thucydides.core.annotations.Steps;

public class CaseStepDefinitions {

    @Steps
    CaseSteps caseSteps;

    @Given("^List Cases page has list of cases$")
    public void list_Cases_page_has_list_of_cases() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I select a \"([^\"]*)\" on the page$")
    public void i_select_a_on_the_page(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I can obtain the case details showing \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_can_obtain_the_case_details_showing_and(String arg1, String arg2, String arg3, String arg4, String arg5) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I have login as a User$")
    public void i_have_login_as_a_User() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I am on the List Cases Screen$")
    public void i_am_on_the_List_Cases_Screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I can obtain a list of cases assigned to me$")
    public void i_can_obtain_a_list_of_cases_assigned_to_me(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^That I have login as an Admin$")
    public void that_I_have_login_as_an_Admin() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I can obtain a list of cases with the assigned user$")
    public void i_can_obtain_a_list_of_cases_with_the_assigned_user(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^That I have successfully login$")
    public void that_I_have_successfully_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^No list cases found$")
    public void no_list_cases_found() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Screen would display empty list$")
    public void screen_would_display_empty_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
