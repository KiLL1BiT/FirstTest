package com.automationpractice.steps;

        import com.automationpractice.pages.ProductPage;
        import net.thucydides.core.annotations.Step;
        import net.thucydides.core.steps.ScenarioSteps;

public class ProductPageSteps extends ScenarioSteps {
    ProductPage onPage;

    @Step
    public void addToCart() {
        onPage.addToCart();
    }

    public void goToCartAfterAddingProduct() {
        onPage.goToCartAfterAddingProduct();
    }

    public void addToWishList() {
        onPage.addToWishList();
    }

    public void goToAccountPage() {
        onPage.goToAccountPage();
    }

    public void productDescriptionPresent() {
        onPage.productDescriptionPresent();
    }
}
