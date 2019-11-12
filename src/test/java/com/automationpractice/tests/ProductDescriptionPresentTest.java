package com.automationpractice.tests;

import org.junit.Test;

public class ProductDescriptionPresentTest extends BaseTest {

    @Test
    public void productDescriptionPresentTest() {
        user.atMainPage.clickOnProduct();
        user.atProductPage.productDescriptionPresent();
    }
}
