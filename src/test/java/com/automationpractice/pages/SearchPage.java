package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePage {

    @FindBy(how = How.ID, using = "product-name")
    private WebDriver productName;

    public SearchPage(WebDriver driver) {
        super(driver);
    }
    public void searchResultVerification() {
        WebDriver driver = getDriver().switchTo().frame("center_column");
        List<WebElement> productName = driver.findElements(By.id("product-name"));



    }
}
