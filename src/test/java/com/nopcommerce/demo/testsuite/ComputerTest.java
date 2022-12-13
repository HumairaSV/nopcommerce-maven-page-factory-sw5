package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Map;

public class ComputerTest extends BaseTest {

    HomePage homePage;
    DeskTopPage deskTopPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    ShoppingCartPage shoppingCartPage;
    CheckOutAsGuest checkOutAsGuestPage;
    BillingCheckOutPage checkOutPage;
    ShippingMethodCheckoutPage checkoutPage1;
    PaymentMethodCheckOut checkOutPage2;
    PaymentCheckOut checkOutPage3;
    ConfirmOrderPage confirmOrderPage;
    CompletedCheckoutPage completedCheckoutPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        deskTopPage = new DeskTopPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
        shoppingCartPage = new ShoppingCartPage();
        checkOutAsGuestPage = new CheckOutAsGuest();
        checkOutPage = new BillingCheckOutPage();
        checkoutPage1 = new ShippingMethodCheckoutPage();
        checkOutPage2 = new PaymentMethodCheckOut();
        checkOutPage3 = new PaymentCheckOut();
        confirmOrderPage = new ConfirmOrderPage();
        completedCheckoutPage = new CompletedCheckoutPage();

    }


    @Test(groups = {"sanity", "regression"})
    public void verifyProductArrangeInAlphaBaticalOrder(){
        homePage.mouseHoverOnComputers();
        homePage.clickOnDeskTop();
        deskTopPage.selectSortByName("Name: Z to A");
        Map<String, ArrayList> mapArrays = deskTopPage.arrangeProductInDescendingOrder();
        Assert.assertEquals(mapArrays.get("originalProductsName"), mapArrays.get("afterSortByZToAProductsName"));
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.mouseHoverAndClickOnComputers();
        homePage.clickOnDeskTop();
        deskTopPage.selectSortByName("Name: A to Z");
        Thread.sleep(5000);
        deskTopPage.clickOnAddToCart();
        softAssert.assertEquals(buildYourOwnComputerPage.verifytheTextBuildyourowncomputer(),"Build your own computer" , "Text is not Display");
        buildYourOwnComputerPage.selectProcessor("1");
        buildYourOwnComputerPage.selectRam("5");
        buildYourOwnComputerPage.selectHDDRadio();
        buildYourOwnComputerPage.selectOSRadiVistaPremium();
        buildYourOwnComputerPage.selectSoftware();
        Thread.sleep(5000);
        softAssert.assertEquals(buildYourOwnComputerPage.verifyThePrice(),"$1,475.00" , "Price does not match");
        buildYourOwnComputerPage.clickOnAddToCartButton();
        softAssert.assertEquals(buildYourOwnComputerPage.verifyTheMessageOnTopGreenBar(),"The product has been added to your shopping cart","Message doesnot match");
        buildYourOwnComputerPage.clickOnCloseBar();
        buildYourOwnComputerPage.mouseHoverOnShoppingCart();
        Thread.sleep(5000);
        buildYourOwnComputerPage.clickOnShoppingCart();
        Thread.sleep(5000);
        softAssert.assertEquals(shoppingCartPage.verifyShoppingCartText(),"Shopping cart","Text is not display");
        shoppingCartPage.updateQuantity("2");
        shoppingCartPage.UpdateShoppingCart();
        softAssert.assertEquals(shoppingCartPage.verifyTheTotalPrice(),"$2,950.00","Price is not match");
        shoppingCartPage.clickOnCheckBox();
        shoppingCartPage.clickOnCheckOutButton();
        softAssert.assertEquals(checkOutAsGuestPage.verifyWelcomeText(),"Welcome, Please Sign In!","Text is not matched");
        checkOutAsGuestPage.clickOnAsGuestButton();
        //Fill ALl Fields
        checkOutPage.enterBillingFirstName("Linda");
        checkOutPage.enterBillingLastName("Smith");
        checkOutPage.enterBillingEmailAddress("linda.smith0@gmail.com");
        checkOutPage.selectCountryFromDropDown("233");
        checkOutPage.enterBillingCity("Manchester");
        checkOutPage.enterBillingAddress("269,Cambridge Lane");
        checkOutPage.enterBillingZipcode("M12 9AW");
        checkOutPage.enterBillingPhoneNumber("5665995116994");
        checkOutPage.clickOnCheckOutButton();
        Thread.sleep(5000);
        checkoutPage1.clickOnRadioButtonTextDayAir();
        checkoutPage1.clickOnContinue();
        checkOutPage2.clickOnCreditCard();
        checkOutPage2.clickOnContinue();
        checkOutPage3.enterCardHolderName("Linda Smith");
        checkOutPage3.enterCardNumber("5555555555554444");
        checkOutPage3.selectExpiryMonthFromDropDown("6");
        checkOutPage3.selectExpiryYearFromDropDown("2024");
        checkOutPage3.enterCardCode("0201");
        checkOutPage3.clickOnContinueButton();
        softAssert.assertEquals(confirmOrderPage.verifyCreditCardPaymentMethod(),"Credit Card","Method is not correct");
        softAssert.assertEquals(confirmOrderPage.verifyShippingMethod(),"Next Day Air","method is not correct");
        softAssert.assertEquals(confirmOrderPage.verifyTheTotalPrice(),"$2,950.00","Price is not Match");
        confirmOrderPage.clickOnConFirm();
        softAssert.assertEquals(completedCheckoutPage.verifyThankYouText(),"Thank you","Text is not displayed");
        softAssert.assertEquals(completedCheckoutPage.verifySucessOrderText(),"Your order has been successfully processed!","Text is not displayed");
        completedCheckoutPage.clickOnContinue();
        softAssert.assertEquals(homePage.verifyWelComeText(),"Welcome to our store","Text is not displayed");
        softAssert.assertAll();
    }
}
