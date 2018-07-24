package gov.uscis.rfad.automation.test.features.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uscis.rfad.automation.test.features.steps.serenity.LoginSteps;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("^I have entered “User” and “testUser\" on login page$")
    public void i_have_entered_User_and_testUser_on_login_page() {
        //loginSteps.open();
        //loginSteps.login(url, userName, password);
        throw new PendingException();
    }


    @When("^I select Login$")
    public void i_select_Login() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I can obtain access to a landing page with display “Welcome User”$")
    public void i_can_obtain_access_to_a_landing_page_with_display_Welcome_User() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I have entered “Admin” and “testAdmin” on login page$")
    public void i_have_entered_Admin_and_testAdmin_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I can obtain access to a landing page with display “Welcome Admin”$")
    public void i_can_obtain_access_to_a_landing_page_with_display_Welcome_Admin() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I have entered “” and “tester\"$")
    public void i_have_entered_and_tester() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I would see error “Username is required” on login page$")
    public void i_would_see_error_Username_is_required_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I have entered “User” and “”$")
    public void i_have_entered_User_and() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I would see error “Password is required” on login page$")
    public void i_would_see_error_Password_is_required_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I have entered “User” and “xxxxx”$")
    public void i_have_entered_User_and_xxxxx() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I would see error “Invalid password” on login page$")
    public void i_would_see_error_Invalid_password_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
