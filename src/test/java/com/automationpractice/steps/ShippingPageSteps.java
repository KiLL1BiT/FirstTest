package com.automationpractice.steps;

import com.automationpractice.pages.ShippingPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ShippingPageSteps extends ScenarioSteps {

    ShippingPage onPage;

    @Step
    public void agreeTermsOfService() {
        onPage.agreeTermsOfService();
    }

    @Step
    public void submitShipping() {
        onPage.submitShipping();
    }
}
