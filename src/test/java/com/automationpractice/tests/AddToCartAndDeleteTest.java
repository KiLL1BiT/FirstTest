package com.automationpractice.tests;

import org.junit.Test;

public class AddToCartAndDeleteTest extends BaseTest {

    @Test
    public void addToCartAndDeleteTest() {
        user.atMainPage.clickOnProduct();
        user.atProductPage.AddToCart();
        user.atProductPage.goToCartAfterAddingProduct();
        user.atCartPage.checkProductInCart();
        user.atCartPage.deleteProductFromCart();
        user.atCartPage.checkProductNotInCart();
    }

}
