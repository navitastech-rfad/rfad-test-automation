package gov.uscis.rfad.automation.test.features.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uscis.rfad.automation.test.features.steps.serenity.ListCaseSteps;
import net.thucydides.core.annotations.Steps;

/**
 * Created by tnguyen on 7/23/18.
 */

public class ListCaseStepDefinitions {

    @Steps
    ListCaseSteps listCaseSteps;

    @Given("^I have login as a User$")
    public void i_have_login_as_a_user() {
        System.out.println("Login as User");
    }

    @Given("^I have login as an Admin$")
    public void i_have_login_as_an_admin() {
        System.out.println("Login as Admin");
    }

    @When("^System redirect me to landing page$")
    public void system_redirect_me_to_landing_page() {
        listCaseSteps.openPage();
        throw new PendingException();
    }

    @Then("^I can obtain a list cases assigned to me$")
    public void i_can_obtain_a_list_cases_assigned_to_me() throws Throwable {
        throw new PendingException();
    }

    @Then("^I can obtain a list cases with assigned users$")
    public void i_can_obtain_a_list_cases_with_assigned_users() throws Throwable {
        throw new PendingException();
    }

    @Then("^Screen would display empty list$")
    public void screen_would_display_empty_list() throws Throwable {
        throw new PendingException();
    }

    @And("^I do not have list cases assigned to me$")
    public void i_do_not_have_list_cases_assigned_to_me() throws Throwable {
        throw new PendingException();
    }

}
