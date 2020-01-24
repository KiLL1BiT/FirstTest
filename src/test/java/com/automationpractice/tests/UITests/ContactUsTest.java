package com.automationpractice.tests.UITests;

import org.junit.Test;

public class ContactUsTest extends BaseTest {

    @Test
    public void contactUsTest() {
        user.atMainPage.goToContactUs();
        user.atContactUsPage.setSubject();
        user.atContactUsPage.emailInput();
        user.atContactUsPage.orderReferenceInput();
        user.atContactUsPage.messageInput();
        user.atContactUsPage.uploadFile();
        user.atContactUsPage.submitMessage();
        user.atContactUsPage.contactUsCompleteTextCompare();
    }
}
