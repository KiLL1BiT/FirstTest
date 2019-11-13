package com.automationpractice.tests;

import org.junit.Test;

public class CompareProductsTest extends BaseTest {

    @Test
    public void compareProductsTest() {
        user.atMainPage.goToCatalog();
        user.atCatalogPage.product1Focus();
        user.atCatalogPage.addToCompareProduct1();
        user.atCatalogPage.product2Focus();
        user.atCatalogPage.addToCompareProduct2();
        user.atCatalogPage.submitCompare();
        user.atComparisonPage.comparisonBlock1Visible();
        user.atComparisonPage.comparisonBlock2Visible();
    }
}
