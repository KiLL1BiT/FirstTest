package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

   @FindBy(how = How.XPATH, using = "//*[@id=\"order-detail-content\"]")
    private WebElement productInCart;

    public void checkProductInCart() {
        element(productInCart).shouldBePresent();
    }
}
