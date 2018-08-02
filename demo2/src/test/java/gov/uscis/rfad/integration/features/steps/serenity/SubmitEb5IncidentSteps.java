package gov.uscis.rfad.integration.features.steps.serenity;

import gov.uscis.rfad.integration.pages.SubmitEb5IncidentPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by tnguyen on 8/1/18.
 */

public class SubmitEb5IncidentSteps extends ScenarioSteps {

    SubmitEb5IncidentPage submitEb5IncidentPage;

    @Step
    public void openPage() {
        submitEb5IncidentPage.open();
    }

}
