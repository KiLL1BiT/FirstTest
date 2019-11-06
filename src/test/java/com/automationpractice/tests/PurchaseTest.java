package com.automationpractice.tests;

import org.junit.Test;

public class PurchaseTest extends BaseTest {
    @Test
    public void PurchaseTest() {
        user.atMainPage.clickOnProduct();
        user.atProductPage.AddToCart();
        user.atProductPage.goToCartAfterAddingProduct();
        user.atLoginPage.loginEmailAddressInput(); // Create new page
        user.atLoginPage.loginPasswordInput();
        user.atLoginPage.loginSubmit();
        user.atAddressPage.submitAddress();
        user.atShippingPage.agreeTermsOfService();
        user.atShippingPage.submitShipping();
        user.atPaymentPage.setPayByCheckConfirmation();
        user.atPaymentPage.orderConfirmation();
    }

}
