package com.automationpractice.tests;

import org.junit.Test;

public class SignUpTest extends BaseTest {

    @Test
    public void signUpTest() throws InterruptedException {
        user.atMainPage.loginClick();
        user.atLoginPage.emailPlaceholderInput();
        user.atRegistrationPage.setGender();
        user.atRegistrationPage.setFirstName();
        user.atRegistrationPage.setLastName();
        user.atRegistrationPage.setPassword();
        user.atRegistrationPage.setAddress();
        user.atRegistrationPage.setCity();
        user.atRegistrationPage.selectStateDropdown();
        Thread.sleep(7000);

    }

}
