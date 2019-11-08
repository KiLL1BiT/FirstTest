package com.automationpractice.tests;

import org.junit.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void AddToCartTest() {
        user.atMainPage.clickOnProduct();
        user.atProductPage.AddToCart();
        user.atProductPage.goToCartAfterAddingProduct();
        user.atCartPage.checkProductInCart();
    }

}
