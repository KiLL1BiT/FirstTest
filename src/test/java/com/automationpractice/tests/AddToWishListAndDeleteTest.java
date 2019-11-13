package com.automationpractice.tests;

import org.junit.Test;

public class AddToWishListAndDeleteTest extends BaseTest {

    @Test
    public void addToWishListTest() {
        user.atMainPage.loginClick();
        user.atLoginPage.emailPlaceholderInput();
        user.atRegistrationPage.signUp();
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
