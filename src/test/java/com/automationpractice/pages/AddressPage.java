package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressPage extends BasePage {

    public AddressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.NAME, using = "processAddress")
    private WebElement submitAddressButton;

    public void submitAddress() {
        element(submitAddressButton).click();
    }
}
