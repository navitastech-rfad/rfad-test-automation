package gov.uscis.rfad.automation.test.features.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uscis.rfad.automation.test.features.steps.serenity.ListCaseSteps;
import net.thucydides.core.annotations.Steps;

public class ListCaseStepDefinitions {

    @Steps
    ListCaseSteps listCaseSteps;

    @Given("^I have login as a User$")
    public void i_have_login_as_a_user() throws Throwable {
        throw new PendingException();
    }

    @Given("^I have login as an Admin$")
    public void i_have_login_as_an_admin() throws Throwable {
        throw new PendingException();
    }

    @Given("^I have successfully login$")
    public void i_have_successfully_login() throws Throwable {
        throw new PendingException();
    }

    @When("^I am on the List Cases page$")
    public void i_am_on_the_list_cases_page() throws Throwable {
        throw new PendingException();
    }

    @When("^No list cases found$")
    public void no_list_cases_found() throws Throwable {
        throw new PendingException();
    }

    @Then("^I can obtain a list of cases assigned to me$")
    public void i_can_obtain_a_list_of_cases_assigned_to_me() throws Throwable {
        throw new PendingException();
    }

    @Then("^I can obtain a list of cases with assigned users$")
    public void i_can_obtain_a_list_of_cases_with_assigned_users() throws Throwable {
        throw new PendingException();
    }

    @Then("^Screen would display empty list$")
    public void screen_would_display_empty_list() throws Throwable {
        throw new PendingException();
    }

}
