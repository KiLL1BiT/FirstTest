package com.automationpractice.tests;

import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        user.atMainPage.loginClick();
        user.atLoginPage.loginEmailAddressInput();
        user.atLoginPage.loginPasswordInput();
        user.atLoginPage.loginSubmit();
        user.atAccountPage.checkRegistrationAndLoginSuccessful();
    }
}