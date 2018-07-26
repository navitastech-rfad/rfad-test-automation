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
        System.out.println("UserName: " + userName);
        System.out.println("Password: " + password);

        WebElement usernameField = getDriver().findElement(By.id("username"));
        usernameField.sendKeys(userName);
        WebElement passField = getDriver().findElement(By.id("password-sign-in"));
        passField.sendKeys(password);

    }

    @Step
    public void selectLogin() {
        WebElement passField = getDriver().findElement(By.id("password-sign-in"));
        passField.sendKeys(Keys.ENTER);
        System.out.println("Tests");
    }

    @Step
    public void loginUrl(String url) {
        loginPage.navigateTo(url);
    }
}
