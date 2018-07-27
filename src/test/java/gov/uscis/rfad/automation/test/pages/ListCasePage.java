package gov.uscis.rfad.automation.test.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by tnguyen on 7/26/18.
 */

@DefaultUrl("http://localhost:4200/caselist")
public class ListCasePage extends PageObject {

    public void navigateTo(String url) {
        getDriver().get(url);
    }

    public void displayListCases() {

    }
}
