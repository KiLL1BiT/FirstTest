package com.automationpractice.steps;

import com.automationpractice.pages.RegistrationPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class RegistrationPageSteps extends ScenarioSteps {

    RegistrationPage onPage;

    @Step
    public void setGender() {
        onPage.setGender();
    }

    @Step
    public void inputFirstName() {
        onPage.inputFirstName();
    }

    @Step
    public void inputLastName() {
        onPage.inputLastName();
    }

    @Step
    public void inputPassword() {
        onPage.inputPassword();
    }

    @Step
    public void inputAddress() {
        onPage.inputAddress();
    }

    @Step
    public void inputCity() {
        onPage.inputCity();
    }

    @Step
    public void selectStateDropdown() {
        onPage.selectStateDropdown();
    }

    @Step
    public void inputZip() { onPage.inputZip(); }

    @Step
    public void inputPhone() { onPage.inputPhone(); }

    @Step
    public void submitRegistration() {
        onPage.submitRegistration();
    }

    @Step
    public void signUp() {
        onPage.setGender();
        onPage.inputFirstName();
        onPage.inputLastName();
        onPage.inputPassword();
        onPage.inputAddress();
        onPage.inputCity();
        onPage.selectStateDropdown();
        onPage.inputZip();
        onPage.inputPhone();
        onPage.submitRegistration();
    }
}

