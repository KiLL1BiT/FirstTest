package com.automationpractice.steps;

import com.automationpractice.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginPageSteps extends ScenarioSteps {

    LoginPage onPage;

    @Step
    public void emailPlaceholderInput() {
        onPage.emailAddressInput();
        onPage.emailSubmit();
    }

    @Step
    public void loginEmailAddressInput() {
        onPage.loginEmailAddressInput();
    }

    @Step
    public void loginPasswordInput() {
        onPage.loginPasswordInput();
    }

    @Step
    public void loginSubmit() {
        onPage.loginSubmit();
    }

    @Step
    public void loginAsUser() {
        onPage.loginEmailAddressInput();
        onPage.loginPasswordInput();
        onPage.loginSubmit();
    }

    @Step
    public void checkLoginButtonVisible() {
        onPage.checkLoginButtonVisible();
    }
}
