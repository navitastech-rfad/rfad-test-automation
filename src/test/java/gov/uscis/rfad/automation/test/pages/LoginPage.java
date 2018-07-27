package gov.uscis.rfad.automation.test.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 * Created by tnguyen on 7/23/18.
 */

@DefaultUrl("http://localhost:4200/login")
public class LoginPage extends PageObject {

    public void navigateTo(String url) {
        getDriver().get(url);
    }

    public void login(String userName, String password) {
        System.out.println("UserName: " + userName);
        System.out.println("Password: " + password);

        if (StringUtils.isNotEmpty(userName)) {
            WebElement usernameField = getDriver().findElement(By.id("username"));
            usernameField.sendKeys(userName);
        }

        WebElement passField = getDriver().findElement(By.id("password-sign-in"));
        if (StringUtils.isNotEmpty((password))) {
            passField.sendKeys(password);
        }

        passField.sendKeys(Keys.ENTER);
    }

    public void redirectToLandingPage() {
        System.out.println("***** TODO: REDIRECT TO LANDING PAGE");
    }
    public void displayMessage(String message) {
        WebElement passField = getDriver().findElement(By.className("help-block"));
        System.out.println("displayMessage: " + passField.getText());
        Assert.assertEquals(passField.getText(), message);
    }
}
