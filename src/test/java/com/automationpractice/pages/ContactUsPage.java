package com.automationpractice.pages;

import com.automationpractice.helpers.RandomBoolean;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage extends BasePage {

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "message")
    private WebElement messageField;

    @FindBy(how = How.ID, using = "uniform-id_contact")
    private WebElement subject;

    @FindBy(how = How.ID, using = "id_contact")
    private WebElement subjectDropdown;

    @FindBy(how = How.ID, using = "email")
    private WebElement emailPlaceholder;

    @FindBy(how = How.ID, using = "id_order")
    private WebElement orderReference;

    @FindBy(how = How.ID, using = "fileUpload")
    private WebElement attachFile;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p")
    private WebElement ContactUsCompleteText;

    private Boolean random() {
        return RandomBoolean.getRandomBoolean();
    }

    public void setSubject() {
        String a;
        boolean randomSubject = random();
        if (randomSubject) {
            a = "Customer service";
        } else {
            a = "Webmaster";
        }
        element(subject).click();
        selectFromDropdown(subjectDropdown, a);
    }


    public void emailInput() {
        element(emailPlaceholder).sendKeys(RandomStringUtils.randomNumeric(4) + "test@rasengan.ua");
    }

    private String getRandom() {
        return RandomStringUtils.randomAlphabetic(10);
    }

    public void OrderReferenceInput() {
        element(orderReference).sendKeys(getRandom());
    }

    public void messageInput() {
        element(messageField).sendKeys(getRandom() + "," + getRandom() + ".");
    }


    public void uploadFile() {
        upload("C:/Users/Uladzislau.Hryhoryeu/IdeaProjects/FirstTest/src/test/java/com/automationpractice/pages/PaymentPage.java").to(attachFile);
    }



    public void ContactUsCompleteTextCompare() {
        Assert.assertEquals("Your message has been successfully sent to our team.", element(ContactUsCompleteText).getText());
    }
}
