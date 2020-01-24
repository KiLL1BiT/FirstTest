package com.automationpractice.tests.UITests;

import org.junit.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void logoutTest() {
        user.atMainPage.loginClick();
        user.atLoginPage.loginAsUser();
        user.atAccountPage.signOut();
        user.atLoginPage.checkLoginButtonVisible();

    }
}
