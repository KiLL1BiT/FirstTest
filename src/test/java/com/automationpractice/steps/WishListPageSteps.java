package com.automationpractice.steps;

import com.automationpractice.pages.WishListPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class WishListPageSteps extends ScenarioSteps {
    WishListPage onPage;

    @Step
    public void checkWishListVisible() {
        onPage.checkWishListVisible();
    }

    @Step
    public void deleteWishList() {
        onPage.deleteWishList();
    }

    @Step
    public void checkWishListInvisible() {
        onPage.checkWishListInvisible();
    }

}
