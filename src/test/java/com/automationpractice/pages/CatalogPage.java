package com.automationpractice.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class CatalogPage extends BasePage {

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[1]/div")
    private WebElement product1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
    private WebElement product2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[1]/div/div[3]/div[2]/a")
    private WebElement addToCompareProduct1Button;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[2]/div/div[3]/div[2]/a")
    private WebElement addToCompareProduct2Button;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div[3]/div[2]/form")
    private WebElement submitCompareButton;

    @FindBy(how = How.CLASS_NAME, using = "content_scene_cat_bg")
    private WebElement element;

    @FindBy(how = How.ID, using = "selectProductSort")
    private WebElement sortingDropDown;

    @FindBy(how = How.ID, using = "uniform-selectProductSort")
    private WebElement sorting;

    public void product1Focus() {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.mouseMove(element(element).getLocation().x, element(element).getLocation().y);
        robot.mouseWheel(4);
        robot.mouseMove(element(product1).getLocation().x, element(product1).getLocation().y);
    }

    public void addToCompareProduct1() {
        element(addToCompareProduct1Button).click();
    }

    public void product2Focus() {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.mouseWheel(-1);
        robot.mouseMove(element(product2).getLocation().x, element(product2).getLocation().y);
    }

    public void addToCompareProduct2() {
        element(addToCompareProduct2Button).click();
    }

    public void submitCompare() {
        element(submitCompareButton).click();
    }

    public void selectStateDropdown() {
        element(sorting).click();
        selectFromDropdown(sortingDropDown, "Price: Lowest first");
    }
}
