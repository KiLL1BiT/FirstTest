package com.automationpractice.tests.UITests;

import org.junit.Test;

public class QuickViewTest extends BaseTest {

    @Test
    public void quickView() {
        user.atMainPage.quickView();
        user.atMainPage.quickViewWindowVisible();
    }
}
