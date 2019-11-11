package com.automationpractice.tests;

import com.automationpractice.steps.*;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class User extends ScenarioSteps {

    @Steps
    public MainPageSteps atMainPage;

    @Steps
    public LoginPageSteps atLoginPage;

    @Steps
    public RegistrationPageSteps atRegistrationPage;

    @Steps
    public CartPageSteps atCartPage;

    @Steps
    public AccountPageSteps atAccountPage;

    @Steps
    public ProductPageSteps atProductPage;

    @Steps
    public AddressPageSteps atAddressPage;

    @Steps
    public ShippingPageSteps atShippingPage;

    @Steps
    public PaymentPageSteps atPaymentPage;

    @Steps
    public ContactUsPageSteps atContactUsPage;

    @Steps
    public WishListPageSteps atWishListPage;

}
