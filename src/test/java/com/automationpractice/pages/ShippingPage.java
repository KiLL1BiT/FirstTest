package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingPage extends BasePage {

    public ShippingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "uniform-cgv")
    private WebElement termsCheckbox;

    @FindBy(how = How.NAME, using = "processCarrier")
    private WebElement submitShippingButton;

    public void agreeTermsOfService() {
        element(termsCheckbox).click();
    }

    public void submitShipping() {
        element(submitShippingButton).click();
    }

}
