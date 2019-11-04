package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "id_gender1")
    private WebElement genderM;
    @FindBy(how = How.ID, using = "id_gender2")
    private WebElement genderF;
    @FindBy(how = How.ID, using = "customer_firstname")
    private WebElement firstName;
    @FindBy(how = How.ID, using = "customer_lastname")
    private WebElement lastName;
    @FindBy(how = How.ID, using = "passwd")
    private WebElement password;
    @FindBy(how = How.ID, using = "address1")
    private WebElement address;
    @FindBy(how = How.ID, using = "city")
    private WebElement city;
    @FindBy(how = How.ID, using = "id_state")
    private WebElement stateDD;
    @FindBy(how = How.ID, using = "postcode")
    private WebElement zip;
    @FindBy(how = How.ID, using = "id_country")
    private WebElement countryDD;
    @FindBy(how = How.ID, using = "phone_mobile")
    private WebElement mobileNumber;
    @FindBy(how = How.ID, using = "submitAccount")
    private WebElement submitAccountButton;


}
