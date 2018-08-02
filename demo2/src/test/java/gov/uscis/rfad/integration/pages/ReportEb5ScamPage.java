package gov.uscis.rfad.integration.pages;

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

@DefaultUrl("http://www.google.com/")
public class ReportEb5ScamPage extends PageObject {

    public void navigateTo(String url) {
        getDriver().get(url);
    }

    public void displayMessage(String message) {
    }
}
