package com.automationpractice.tests;

import org.junit.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void AddToCartTest() {
//        user.atMainPage.loginClick();
//        user.atLoginPage.loginAsUser();
//        user.atAccountPage.goToHomePage();
        user.atMainPage.clickOnProduct();
        user.atProductPage.AddToCart();
        user.atProductPage.goToCartAfterAddingProduct();
    }

}
