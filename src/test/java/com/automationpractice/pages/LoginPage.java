package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    @FindBy(how = How.ID, using = "email_create")
    private WebElement emailAddressPlaceholder;

    @FindBy(how = How.ID, using = "SubmitCreate")
    private WebElement submitCreateAccountButton;

    @FindBy(how = How.ID, using = "email")
    private WebElement loginEmailAddressPlaceholder;

    @FindBy(how = How.ID, using = "passwd")
    private WebElement passwordPlaceholder;

    @FindBy(how = How.ID, using = "SubmitLogin")
    private WebElement SubmitLoginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginEmailAddressInput() {
        element(loginEmailAddressPlaceholder).sendKeys("sometest@rasengan.ua");
    }

    public void loginPasswordInput() {
        element(passwordPlaceholder).sendKeys("password");
    }

    public void loginSubmit() {
        element(SubmitLoginButton).click();
    }

    public void emailAddressInput() {
        element(emailAddressPlaceholder).sendKeys(RandomStringUtils.randomNumeric(4) + "test@rasengan.ua");
    }

    public void emailSubmit() {
        element(submitCreateAccountButton).click();
    }

}
