package com.automationpractice.tests;

import com.automationpractice.steps.LoginPageSteps;
import com.automationpractice.steps.MainPageSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class User extends ScenarioSteps {

    @Steps
    public MainPageSteps atMainPage;

    @Steps
    public LoginPageSteps atLoginPage;
}
