package com.automationpractice.steps;

import com.automationpractice.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchPageSteps extends ScenarioSteps {

    SearchPage onPage;

    @Step
    public void searchResultVerification() {
        onPage.searchResultVerification();
    }

}
