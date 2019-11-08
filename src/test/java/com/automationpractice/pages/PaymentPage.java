package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.junit.Assert;
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

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[1]")
    private WebElement orderCompleteText;

    public void setPayByCheckConfirmation() {
        element(payByCheckButton).click();
    }

    public void orderConfirmation() {
        element(orderConfirmationButton).click();
    }
    public void orderCompleteTextCompare() {
        Assert.assertEquals("Your order on My Store is complete.", element(orderCompleteText).getText());
    }
}
