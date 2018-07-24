package gov.uscis.rfad.automation.test.features.steps.serenity;

import gov.uscis.rfad.automation.test.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;

    @Step
    public void opensHomePage() {

    }

    @Step
    public void login(String userName, String password) {

    }

    @Step
    public void loginUrl(String url) {
        loginPage.navigateTo(url);
    }
}
