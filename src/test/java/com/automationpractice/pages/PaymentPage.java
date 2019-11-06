package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage extends BasePage {

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    private WebElement payByWireButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
    private WebElement payByCheckButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button")
    private WebElement orderConfirmationButton;

    public void setPayByCheckConfirmation() {
        element(payByCheckButton).click();
    }

    public void orderConfirmation() {
        element(orderConfirmationButton).click();
    }
}
