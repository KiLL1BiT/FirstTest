package com.automationpractice.tests.UITests;

import org.junit.Test;

public class SortingTest extends BaseTest {

    @Test
    public void sortingTest() {
        user.atMainPage.goToCatalog();
        user.atCatalogPage.selectStateDropdown();
    }
}

