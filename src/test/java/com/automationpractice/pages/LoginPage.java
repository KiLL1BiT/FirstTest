package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    @FindBy(how = How.ID, using = "email_create")
    private WebElement emailAddressPlaceholder;

    @FindBy(how = How.ID, using = "SubmitCreate")
    private WebElement submitButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void emailAddressInput() {
        element(emailAddressPlaceholder).sendKeys("sometest@rasengan.ua");
    }

    public void emailSubmit() {
        element(submitButton).click();
    }

}
