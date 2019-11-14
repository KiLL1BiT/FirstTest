package com.automationpractice.tests;

import org.junit.Test;

public class AddToWishListAndDeleteTest extends BaseTest {

    @Test
    public void addToWishListAndDeleteTest() {
        user.atMainPage.loginClick();
        user.atLoginPage.loginAsUser();
        user.atAccountPage.goToHomePage();
        user.atMainPage.clickOnProduct();
        user.atProductPage.addToWishList();
        user.atProductPage.goToAccountPage();
        user.atAccountPage.goToMyWishList();
        user.atWishListPage.checkWishListVisible();
        user.atWishListPage.deleteWishList();
        user.atWishListPage.checkWishListInvisible();
    }
}
