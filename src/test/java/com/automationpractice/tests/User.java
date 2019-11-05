package com.automationpractice.tests;

import com.automationpractice.steps.CartPageSteps;
import com.automationpractice.steps.LoginPageSteps;
import com.automationpractice.steps.MainPageSteps;
import com.automationpractice.steps.RegistrationPageSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class User extends ScenarioSteps {

    @Steps
    public MainPageSteps atMainPage;

    @Steps
    public LoginPageSteps atLoginPage;

    @Steps
    public RegistrationPageSteps atRegistrationPage;

    @Steps
    public CartPageSteps atCartPage;
}
