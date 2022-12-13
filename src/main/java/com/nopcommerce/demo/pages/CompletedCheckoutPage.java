package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CompletedCheckoutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankyouText;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement sucessText;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;


    public String verifyThankYouText(){
        Reporter.log("Verify the Thank you text" + thankyouText.toString());
        return getTextFromElement(thankyouText);
    }
    public String verifySucessOrderText(){
        Reporter.log("Verify order placed successfully text" + sucessText.toString());
        return getTextFromElement(sucessText);
    }
    public void clickOnContinue(){
        Reporter.log("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }
}
