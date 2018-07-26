package gov.uscis.rfad.automation.test.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by tnguyen on 7/23/18.
 */

@DefaultUrl("http://localhost:4200/login")
public class LoginPage extends PageObject {

    public void navigateTo(String url) {
        getDriver().get(url);
    }
}
