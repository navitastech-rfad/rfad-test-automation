package gov.uscis.rfad.integration.features.steps.serenity;

import gov.uscis.rfad.integration.pages.Eb5SubmitConfirmationPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by tnguyen on 7/23/18.
 */

public class Eb5SubmitConfirmationSteps extends ScenarioSteps {

    Eb5SubmitConfirmationPage eb5SubmitConfirmationPage;

    @Step
    public void openPage() {
        eb5SubmitConfirmationPage.open();
    }

    @Step
    public void displayDetails() {
    }
}
