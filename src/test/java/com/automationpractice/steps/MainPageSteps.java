package com.automationpractice.steps;

import com.automationpractice.pages.MainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class MainPageSteps extends ScenarioSteps {

    MainPage onPage;

    @Step
    public void loginClick() {
        onPage.loginClick();
    }
    @Step
    public void verifyTitle() {
        onPage.verifyTitle();
    }

    @Step
    public void clickOnProduct() {onPage.clickOnProduct();}

    @Step
    public void goToContactUs() {
        onPage.goToContactUs();
    }

    @Step
    public void quickView() { onPage.quickView();}

    @Step
    public void quickViewWindowVisible() {onPage.quickViewWindowVisible();}

    @Step
    public void searchProduct() { onPage.searchProduct();}
}
