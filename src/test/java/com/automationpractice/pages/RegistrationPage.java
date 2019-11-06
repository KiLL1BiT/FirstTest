package com.automationpractice.pages;

import com.automationpractice.helpers.RandomBoolean;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.apache.commons.lang3.RandomStringUtils;
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
    private WebElement stateDropDown;
    @FindBy(how = How.ID, using = "uniform-id_state")
    private WebElement state;
    @FindBy(how = How.ID, using = "postcode")
    private WebElement zip;
    @FindBy(how = How.ID, using = "id_country")
    private WebElement countryDD;
    @FindBy(how = How.ID, using = "phone_mobile")
    private WebElement mobileNumber;
    @FindBy(how = How.ID, using = "submitAccount")
    private WebElement submitAccountButton;

    private Boolean getGender() {
        return RandomBoolean.getRandomBoolean();
    }

    public void setGender() {
        boolean randomGender = getGender();
        if (randomGender) {
            element(genderM).click();
        } else {
            element(genderF).click();
        }
    }

    private String getRandom() {
        return RandomStringUtils.randomAlphabetic(10);
    }

    public void inputFirstName() {
        element(firstName).sendKeys(getRandom());
    }

    public void inputLastName() {
        element(lastName).sendKeys(getRandom());
    }

    public void inputPassword() {
        element(password).sendKeys("password");
    }

    public void inputAddress() {
        element(address).sendKeys(getRandom());
    }

    public void inputCity() {
        element(city).sendKeys(getRandom());
    }

    public void selectStateDropdown() {
        element(state).click();
        selectFromDropdown(stateDropDown, "Alabama");
    }

    public void inputZip() {
        element(zip).sendKeys(RandomStringUtils.randomNumeric(5));
    }

    public void inputPhone() {
        element(mobileNumber).sendKeys("+" + RandomStringUtils.randomNumeric(12));
    }

    public void submitRegistration() {
        element(submitAccountButton).click();
    }
}
