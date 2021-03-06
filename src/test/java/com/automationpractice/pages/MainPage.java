package com.automationpractice.pages;

import com.automationpractice.helpers.CookiesForSelenium;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.junit.Assert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

import static com.automationpractice.tests.UITests.BaseTest.baseUrl;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "[class = 'header_user_info']")
    private WebElement loginButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"homefeatured\"]/li[1]/div")
    private WebElement product1;

    @FindBy(how = How.CLASS_NAME, using = "sf-with-ul")
    private WebElement goToCatalogButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"contact-link\"]/a")
    private WebElement ContactUsButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[2]")
    private WebElement quickViewButton;

    @FindBy(how = How.ID, using = "search_query_top")
    private WebElement searchPlaceholder;

    public void loginClick() {
        element(loginButton).click();
    }

    public void verifyTitle() {
        Assert.assertEquals("My Store", getDriver().getTitle());
    }

    public void clickOnProduct() { element(product1).click();
    }

    public void apiLoginAndGetMainPage() {
        Cookie cookies = new Cookie(CookiesForSelenium.getCookiesName(), CookiesForSelenium.getCookiesValue());
        getDriver().manage().addCookie(cookies);
        getDriver().navigate().to(baseUrl);
    }

    public void goToContactUs() {
        element(ContactUsButton).click();
    }

    public void quickView() {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.mouseMove(element(product1).getLocation().x, element(product1).getLocation().y);
        robot.mouseWheel(3);
        robot.mouseMove(element(product1).getLocation().x, element(product1).getLocation().y);
        element(quickViewButton).click();
    }

    public void quickViewWindowVisible() {
        WebElement el = element(By.className("fancybox-iframe"));
        WebDriver driver = getDriver().switchTo().frame(el);
        WebElement quickViewWindow = driver.findElement(By.id("product"));
        Assert.assertTrue(quickViewWindow.isDisplayed());
    }


    public void searchProduct() {
        String searchText = "Printed Dress";
        element(searchPlaceholder).sendKeys(searchText);
        element(searchPlaceholder).submit();
    }

    public void goToCatalog() {
        element(goToCatalogButton).click();
    }
}
