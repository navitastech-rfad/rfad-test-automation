package gov.uscis.rfad.integration.features.steps.serenity;

import gov.uscis.rfad.integration.pages.ListCasePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by tnguyen on 7/23/18.
 */

public class ListCaseSteps extends ScenarioSteps {

    ListCasePage listCasePage;

    @Step
    public void openPage() {
        listCasePage.open();
    }

    @Step
    public void displayListCases() {
        listCasePage.displayListCases();
    }
}
