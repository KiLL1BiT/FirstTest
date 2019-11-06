package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "[class = 'header_user_info']")
    private WebElement login;

    @FindBy(how = How.XPATH, using = "//*[@id=\"homefeatured\"]/li[1]")
    private WebElement product1;

    public void loginClick() {
        element(login).click();
    }

    public void verifyTitle() {
        Assert.assertEquals("My Store", getDriver().getTitle());
    }

    public void clickOnProduct() {
        element(product1).click();
    }
}
