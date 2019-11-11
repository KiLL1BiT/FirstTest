package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/div/div[1]/ul")
    private WebElement centerColumn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
    private WebElement signOutButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/div[2]/ul/li/a")
    private WebElement goToMyWishListButton;

    public void goToHomePage() {
        getDriver().navigate().to("http://automationpractice.com/");
    }

    public void signOut(){
        element(signOutButton).click();
    }

    public void checkRegistrationAndLoginSuccessful(){
        element(centerColumn).shouldBeVisible();
    }

    public void goToMyWishList() {
        element(goToMyWishListButton).click();
    }


}
