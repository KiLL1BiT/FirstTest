package com.automationpractice.steps;

import com.automationpractice.pages.PaymentPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class PaymentPageSteps extends ScenarioSteps {
    PaymentPage onPage;

    @Step
    public void setPayByCheckConfirmation() {
        onPage.setPayByCheckConfirmation();
    }
    @Step
    public void orderConfirmation() {
        onPage.orderConfirmation();
    }

}
