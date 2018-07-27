package gov.uscis.rfad.automation.test.features.steps.serenity;

import gov.uscis.rfad.automation.test.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;

    @Step
    public void opensHomePage() {
        loginPage.open();
    }

    @Step
    public void login(String userName, String password) {
        loginPage.login(userName, password);
    }

    @Step
    public void goToLandingPage(String url) {
        //loginPage.navigateTo(url);
    }

    @Step
    public void displayMessage(String messsage) {
        loginPage.displayMessage(messsage);
    }

}
