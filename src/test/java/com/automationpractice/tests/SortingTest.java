package com.automationpractice.tests;

import org.junit.Test;

public class SortingTest extends BaseTest {

    @Test
    public void sortingTest() {
        user.atMainPage.goToCatalog();
        user.atCatalogPage.selectStateDropdown();
    }
}

