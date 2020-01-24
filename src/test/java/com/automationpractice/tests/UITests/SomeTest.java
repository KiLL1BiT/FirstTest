package com.automationpractice.tests.UITests;


import org.junit.Test;

public class SomeTest extends BaseTest {

    @Test
    public void siteVerification() {
        user.atMainPage.verifyTitle();
    }

}
