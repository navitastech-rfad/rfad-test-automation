package gov.uscis.rfad.automation.test.pages;

import net.serenitybdd.core.pages.PageObject;

/**
 * Created by tnguyen on 7/23/18.
 */
public class LoginPage extends PageObject {

    public void navigateTo(String url) {
        getDriver().get(url);
    }
}
