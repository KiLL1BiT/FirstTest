package com.automationpractice.tests;

import org.junit.Test;

public class SignUpTest extends BaseTest {

    @Test
    public void signUpTest() {
        user.atMainPage.loginClick();
        user.atLoginPage.emailPlaceholderInput();
        user.atRegistrationPage.setGender();
        user.atRegistrationPage.inputFirstName();
        user.atRegistrationPage.inputLastName();
        user.atRegistrationPage.inputPassword();
        user.atRegistrationPage.inputAddress();
        user.atRegistrationPage.inputCity();
        user.atRegistrationPage.selectStateDropdown();

    }

}
