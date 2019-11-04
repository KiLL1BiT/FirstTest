package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.NAME, using = "header_user_info")
    private WebElementFacade login;

    public void loginClick() {
        withAction().moveToElement(login).perform();
        element(login).click();
    }
}
