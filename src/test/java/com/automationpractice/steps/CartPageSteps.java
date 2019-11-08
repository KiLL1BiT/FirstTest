package com.automationpractice.steps;

import com.automationpractice.pages.CartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CartPageSteps extends ScenarioSteps {

    CartPage onPage;

    @Step
    public void checkProductInCart() {
        onPage.checkProductInCart();
    }
    @Step
    public void submitCartSummary() {
        onPage.submitCartSummary();
    }
}
