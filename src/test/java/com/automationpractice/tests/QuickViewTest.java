package com.automationpractice.tests;

import org.junit.Test;

public class QuickViewTest extends BaseTest {

    @Test
    public void quickView() {
        user.atMainPage.quickView();
        user.atMainPage.quickViewWindowVisible();
    }
}
