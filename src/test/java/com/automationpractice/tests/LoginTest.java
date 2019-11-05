package com.automationpractice.tests;

import org.junit.Test;

public class LoginTest extends BaseTest {


    @Test
    public void loginTest() {
        user.atMainPage.loginClick();
    }
}