package gov.uscis.rfad.automation.test.features.steps.serenity;

import gov.uscis.rfad.automation.test.pages.CaseDetailPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by tnguyen on 7/23/18.
 */

public class CaseDetailSteps extends ScenarioSteps {

    CaseDetailPage caseDetailPage;

    @Step
    public void openPage() {
        caseDetailPage.open();
    }

    @Step
    public void displayDetails() {
    }
}
