package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishListPage extends BasePage {

    public WishListPage(WebDriver driver) {
        super(driver);
    }
     @FindBy(how = How.ID, using = "block-history")
    private WebElement wishList;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wishlist_14322\"]/td[6]")
    private WebElement deleteWishListButton;

    public void checkWishListVisible() {
        element(wishList).shouldBeVisible();
    }

    public void deleteWishList() {
        element(deleteWishListButton).click();
        getDriver().switchTo().alert().accept();
    }

    public void checkWishListInvisible() {
        element(wishList).shouldNotBeVisible();
    }
}
