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
    public void setFirstName() {
        onPage.setFirstName();
    }

    @Step
    public void setLastName() {
        onPage.setLastName();
    }

    @Step
    public void setPassword() {
        onPage.setPassword();
    }

    @Step
    public void setAddress() {
        onPage.setAddress();
    }

    @Step
    public void setCity() {
        onPage.setCity();
    }

    @Step
    public void selectStateDropdown() {
        onPage.selectStateDropdown();
    }
}

