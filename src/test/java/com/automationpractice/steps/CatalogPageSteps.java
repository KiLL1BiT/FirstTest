package com.automationpractice.steps;

import com.automationpractice.pages.CatalogPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CatalogPageSteps extends ScenarioSteps {

    CatalogPage onPage;

    @Step
    public void product1Focus() {
        onPage.product1Focus();
    }

    @Step
    public void addToCompareProduct1() {
        onPage.addToCompareProduct1();
    }

    @Step
    public void product2Focus() {
        onPage.product2Focus();
    }

    @Step
    public void addToCompareProduct2() {
        onPage.addToCompareProduct2();
    }

    @Step
    public void submitCompare() {
        onPage.submitCompare();
    }

    @Step
    public void selectStateDropdown() {
        onPage.selectStateDropdown();
    }
}
