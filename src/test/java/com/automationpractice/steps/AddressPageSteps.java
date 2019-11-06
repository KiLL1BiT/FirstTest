package com.automationpractice.steps;

import com.automationpractice.pages.AddressPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AddressPageSteps extends ScenarioSteps {

    AddressPage onPage;

    @Step
    public void submitAddress() {
        onPage.submitAddress();
    }
}
