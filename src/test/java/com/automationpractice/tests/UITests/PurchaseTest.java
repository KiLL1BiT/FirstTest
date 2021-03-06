package com.automationpractice.tests.UITests;

import org.junit.Test;

public class PurchaseTest extends BaseTest {
    @Test
    public void purchaseTest() {
        user.atMainPage.clickOnProduct();
        user.atProductPage.addToCart();
        user.atProductPage.goToCartAfterAddingProduct();
        user.atCartPage.submitCartSummary();
        user.atLoginPage.loginEmailAddressInput();
        user.atLoginPage.loginPasswordInput();
        user.atLoginPage.loginSubmit();
        user.atAddressPage.submitAddress();
        user.atShippingPage.agreeTermsOfService();
        user.atShippingPage.submitShipping();
        user.atPaymentPage.setPayByCheckConfirmation();
        user.atPaymentPage.orderConfirmation();
        user.atPaymentPage.orderCompleteTextCompare();
    }
}

