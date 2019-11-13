package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchPage extends BasePage {

    @FindBy(how = How.ID, using = "product-name")
    private WebElement productName;

    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/ul/li/div/div[2]/h5/a")
    private List<WebElement> searchResults;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void searchResultVerification() {
        String searchText = "Printed";
        String searchText1 = "Dress";
        int i = 0;
        for (WebElement product : searchResults) {
            assertThat(element(product).getText()).contains(searchText, searchText1);
        }
    }
}
