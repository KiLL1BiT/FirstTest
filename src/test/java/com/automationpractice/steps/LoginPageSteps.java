package com.automationpractice.steps;

import com.automationpractice.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginPageSteps extends ScenarioSteps {

    LoginPage onPage;

      @Step
    public void emailPlaceholderInput() {
        onPage.emailAddressInput();
    }
}
