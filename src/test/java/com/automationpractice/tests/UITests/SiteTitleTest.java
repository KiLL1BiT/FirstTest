package com.automationpractice.tests.UITests;


import org.junit.Test;

public class SiteTitleTest extends BaseTest {

    @Test
    public void siteVerification() {
        user.atMainPage.verifyTitle();
    }

}
