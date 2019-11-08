package com.automationpractice.tests;

import org.junit.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void LogoutTest() {
        user.atMainPage.loginClick();
        user.atLoginPage.loginAsUser();
        user.atAccountPage.signOut();
        user.atLoginPage.checkLoginButtonVisible();

    }
}
