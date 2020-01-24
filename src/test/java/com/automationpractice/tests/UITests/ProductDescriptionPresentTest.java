package com.automationpractice.tests.UITests;

import org.junit.Test;

public class ProductDescriptionPresentTest extends BaseTest {

    @Test
    public void productDescriptionPresentTest() {
        user.atMainPage.clickOnProduct();
        user.atProductPage.productDescriptionPresent();
    }
}
