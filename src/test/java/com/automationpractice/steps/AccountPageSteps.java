package com.automationpractice.steps;

import com.automationpractice.pages.AccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AccountPageSteps extends ScenarioSteps {
    AccountPage onPage;

    @Step
    public void checkRegistrationAndLoginSuccessful(){
    onPage.checkRegistrationAndLoginSuccessful();
    }

    @Step
    public void goToHomePage() {
        onPage.goToHomePage();
    }
}
