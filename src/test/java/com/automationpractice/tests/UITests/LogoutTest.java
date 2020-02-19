package com.automationpractice.tests.UITests;

import org.junit.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void logoutTest() {
        user.atMainPage.apiLoginAndGetMainPage();
        user.atAccountPage.signOut();
        user.atLoginPage.checkLoginButtonVisible();

    }
}
