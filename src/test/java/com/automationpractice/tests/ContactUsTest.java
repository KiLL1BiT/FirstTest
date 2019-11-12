package com.automationpractice.tests;

import org.junit.Test;

import java.awt.*;

public class ContactUsTest extends BaseTest {

    @Test
    public void ContactUsTest() {
        user.atMainPage.goToContactUs();
        user.atContactUsPage.setSubject();
        user.atContactUsPage.emailInput();
        user.atContactUsPage.OrderReferenceInput();
        user.atContactUsPage.messageInput();
        user.atContactUsPage.uploadFile();
        user.atContactUsPage.submitMessage();
        user.atContactUsPage.ContactUsCompleteTextCompare();
    }
}
