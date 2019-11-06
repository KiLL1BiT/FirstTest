package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.NAME, using = "Submit")
    private WebElement AddToCartButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    private WebElement goToCartAfterAddingProductButton;

    public void AddToCart() {
        element(AddToCartButton).click();
    }

    public void goToCartAfterAddingProduct() {
        element(goToCartAfterAddingProductButton).click();
    }
}
