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

    @FindBy(how = How.ID, using = "wishlist_button")
    private WebElement addToWishListButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    private WebElement goToAccountPageButton;

    public void AddToCart() {
        element(AddToCartButton).click();
    }

    public void goToCartAfterAddingProduct() {
        element(goToCartAfterAddingProductButton).click();
    }

    public void addToWishList() {
        element(addToWishListButton).click();
    }

    public void goToAccountPage() {
        element(goToAccountPageButton).click();
    }

}
