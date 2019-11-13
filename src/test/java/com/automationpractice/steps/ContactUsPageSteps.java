package com.automationpractice.steps;

import com.automationpractice.pages.ContactUsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ContactUsPageSteps extends ScenarioSteps {
    ContactUsPage onPage;

    @Step
    public void setSubject() {
        onPage.setSubject();
    }

    @Step
    public void emailInput() {
        onPage.emailInput();
    }

    @Step
    public void orderReferenceInput() {
        onPage.OrderReferenceInput();
    }

    @Step
    public void messageInput() {
        onPage.messageInput();
    }


    @Step
    public void contactUsCompleteTextCompare() {
        onPage.ContactUsCompleteTextCompare();
    }

    @Step
    public void uploadFile() {
        onPage.uploadFile();
    }

    @Step
    public void submitMessage() {
        onPage.submitMessage();
    }
}
