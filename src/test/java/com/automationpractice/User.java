package com.automationpractice;

import com.automationpractice.steps.MainPageSteps;
import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Steps;

public class User extends ScenarioActor {

    @Steps
    public MainPageSteps atMainPage;
}
