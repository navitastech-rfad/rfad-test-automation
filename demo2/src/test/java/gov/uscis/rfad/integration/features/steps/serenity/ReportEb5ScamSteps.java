package gov.uscis.rfad.integration.features.steps.serenity;

import gov.uscis.rfad.integration.pages.ReportEb5ScamPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 * Created by tnguyen on 8/1/18.
 */

public class ReportEb5ScamSteps extends ScenarioSteps {

    ReportEb5ScamPage reportEb5ScamPage;

    @Step
    public void opensHomePage() {
        reportEb5ScamPage.open();
    }

    @Step
    public void displayMessage(String messsage) {
        reportEb5ScamPage.displayMessage(messsage);
    }

}
