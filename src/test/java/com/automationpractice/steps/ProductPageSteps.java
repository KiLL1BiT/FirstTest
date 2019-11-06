package com.automationpractice.steps;

import com.automationpractice.pages.ProductPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ProductPageSteps extends ScenarioSteps {
    ProductPage onPage;

    @Step
    public void AddToCart() {
        onPage.AddToCart();}

    public void goToCartAfterAddingProduct() {
        onPage.goToCartAfterAddingProduct();
    }
}
