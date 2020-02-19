package com.automationpractice.tests.UITests;

import org.junit.Test;

public class AddToWishListAndDeleteTest extends BaseTest {

    @Test
    public void addToWishListAndDeleteTest() {
        user.atMainPage.apiLoginAndGetMainPage();
        user.atMainPage.clickOnProduct();
        user.atProductPage.addToWishList();
        user.atProductPage.goToAccountPage();
        user.atAccountPage.goToMyWishList();
        user.atWishListPage.checkWishListVisible();
        user.atWishListPage.deleteWishList();
        user.atWishListPage.checkWishListInvisible();
    }
}
