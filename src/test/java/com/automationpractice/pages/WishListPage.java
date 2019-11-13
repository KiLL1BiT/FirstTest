package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishListPage extends BasePage {

    public WishListPage(WebDriver driver) {
        super(driver);
    }

     @FindBy(how = How.ID, using = "block-history")
    private WebElement wishList;

    @FindBy(how = How.CLASS_NAME, using = "icon-remove")
    private WebElement deleteWishListButton;

    public void checkWishListVisible() {
        element(wishList).shouldBeVisible();
    }

    public void deleteWishList() {
        Point location = element(deleteWishListButton).getLocation();
        int x = location.getX();
        int y = location.getY();
        withAction().moveByOffset(x, y).click().build().perform();
        getDriver().switchTo().alert().accept();
        waitABit(1000);
    }

    public void checkWishListInvisible() {
        element(wishList).shouldNotBeVisible();
    }
}
