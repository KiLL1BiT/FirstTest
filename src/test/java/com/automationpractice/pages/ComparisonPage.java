package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComparisonPage extends BasePage {

    public ComparisonPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"product_comparison\"]/tbody/tr[1]/td[2]")
    private WebElement comparisonBlock1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"product_comparison\"]/tbody/tr[1]/td[3]")
    private WebElement comparisonBlock2;

    public void comparisonBlock1Visible() {
        element(comparisonBlock1).shouldBeVisible();
    }

    public void comparisonBlock2Visible() {
        element(comparisonBlock2).shouldBeVisible();
    }
}
