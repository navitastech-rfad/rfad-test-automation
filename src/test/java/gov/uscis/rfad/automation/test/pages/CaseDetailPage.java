package gov.uscis.rfad.automation.test.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com")
public class CaseDetailPage extends PageObject {

    public void navigateTo(String url) {
        getDriver().get(url);
    }

}
