package gov.uscis.rfad.integration.features.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uscis.rfad.integration.features.steps.serenity.LoginSteps;
import net.thucydides.core.annotations.Steps;

/**
 * Created by tnguyen on 8/7/18.
 */

public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("^I am on signin page$")
    public void i_am_on_signin_page() {
        loginSteps.opensHomePage();
    }

    @When("^I entered (.*) and (.*) to login$")
    public void i_entered_and_to_login(String username, String password) {
        loginSteps.login(username, password);
    }

    @Then("^I can obtain access to a Reports of Fraud (.*)$")
    public void i_can_obtain_access_to_a_landing(String page) {
        loginSteps.goToLandingPage(page);
    }

    //    @Then("^I will obtain error (.*) display$")
//    public void i_will_obtain_error_display(String message) {
//        loginSteps.displayMessage(message);
//    }

}
