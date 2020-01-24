package com.automationpractice.tests.UITests;

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
        user.atRegistrationPage.inputZip();
        user.atRegistrationPage.inputPhone();
        user.atRegistrationPage.submitRegistration();
        user.atAccountPage.checkRegistrationAndLoginSuccessful();
    }

}
