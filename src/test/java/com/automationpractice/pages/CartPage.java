package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]")
    private WebElement submitCartSummaryButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"order-detail-content\"]")
    private WebElement productInCart;

    @FindBy(how = How.CLASS_NAME, using = "cart_quantity_delete")
    private WebElement DeleteProductFromCartButton;

    public void checkProductInCart() {
        element(productInCart).shouldBeVisible();
    }

    public void submitCartSummary() {
        element(submitCartSummaryButton).click();
    }

    public void DeleteProductFromCart() {
        element(DeleteProductFromCartButton).click();
    }

    public void checkProductNotInCart() {
        element(productInCart).shouldNotBeVisible();
    }
}
