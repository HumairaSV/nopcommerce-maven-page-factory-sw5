package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class PaymentMethodCheckOut extends Utility {
    @CacheLookup
    @FindBy(css = "#paymentmethod_1")
    WebElement creditCard;


    @CacheLookup
    @FindBy(xpath = "//ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement continueButton;


    public void clickOnCreditCard(){
        Reporter.log("Click on credit card button" + creditCard.toString());
        clickOnElement(creditCard);
    }
    public void clickOnContinue(){
        Reporter.log("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }
}
