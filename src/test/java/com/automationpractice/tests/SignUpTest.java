package com.automationpractice.tests;

import org.junit.Test;

public class SignUpTest extends BaseTest {

    @Test
    public void signUpTest() {
        user.atMainPage.loginClick();
        user.atLoginPage.emailPlaceholderInput();
    }

}
