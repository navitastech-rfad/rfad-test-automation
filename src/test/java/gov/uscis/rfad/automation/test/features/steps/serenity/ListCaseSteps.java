package gov.uscis.rfad.automation.test.features.steps.serenity;

import gov.uscis.rfad.automation.test.pages.ListCasePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

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
