package gov.uscis.rfad.integration.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by tnguyen on 8/1/18.
 */

@DefaultUrl("http://www.google.com")
public class Eb5SubmitConfirmationPage extends PageObject {

    public void navigateTo(String url) {
        getDriver().get(url);
    }

}
