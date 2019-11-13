package com.automationpractice.tests;

import org.junit.Test;

public class SearchTest extends BaseTest {

    @Test
    public void searchTest() {
        user.atMainPage.searchProduct();
        user.atSearchPage.searchResultVerification();


    }
}
