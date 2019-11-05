package com.automationpractice.pages;

import com.automationpractice.helpers.RandomBoolean;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.WebElementFacade;
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
    private WebElementFacade stateDD;
    @FindBy(how = How.ID, using = "postcode")
    private WebElement zip;
    @FindBy(how = How.ID, using = "id_country")
    private WebElementFacade countryDD;
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

    public void setFirstName() {
        element(firstName).sendKeys(getRandom());
    }

    public void setLastName() {
        element(lastName).sendKeys(getRandom());
    }

    public void setPassword() {
        element(password).sendKeys("password");
    }

    public void setAddress() {
        element(address).sendKeys(getRandom());
    }

    public void setCity() {
        element(city).sendKeys(getRandom());
    }

    public void selectStateDropdown() {
        stateDD.selectByIndex(8);

    }
}
