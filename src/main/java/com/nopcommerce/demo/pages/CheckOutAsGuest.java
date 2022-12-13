package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutAsGuest extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//button[text()= 'Checkout as Guest']")
    WebElement guestButton;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerLink;


    public String verifyWelcomeText() {
        Reporter.log("Verify the welcome text" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }
    public void clickOnAsGuestButton(){
        Reporter.log("Click on check out as guest button" + guestButton.toString());
        clickOnElement(guestButton);
    }

    public void clickOnRegisterTab(){
        Reporter.log("Click on register link" + registerLink.toString());
        clickOnElement(registerLink);
    }
}
