package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class PaymentCheckOut extends Utility {
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement cardType;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderNameField;

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumberField;

    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonthField;

    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYearField;

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCodeField;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton;



    public void selectCardTypeFromDropDown(String text){
        Reporter.log("Select the card type "+ text +" from drop down" + cardType.toString());
        selectByValueFromDropDown(cardType,text);
    }
    public void enterCardHolderName(String text){
        Reporter.log("Enter card holder name "+ text +" in the card holder name field" + cardHolderNameField.toString());
        sendTextToElement(cardHolderNameField,text);
    }
    public void enterCardNumber(String text){
        Reporter.log("Enter card number "+ text +" in the card number field" + cardNumberField.toString());
        sendTextToElement(cardNumberField,text);
    }
    public void selectExpiryMonthFromDropDown(String text){
        Reporter.log("Select the expiry month "+ text +" from drop down" + expireMonthField.toString());
        selectByValueFromDropDown(expireMonthField,text);
    }
    public void selectExpiryYearFromDropDown(String text){
        Reporter.log("Select the expiry year "+ text +" from drop down" + expireYearField.toString());
        selectByValueFromDropDown(expireYearField,text);
    }
    public void enterCardCode(String text){
        Reporter.log("Enter the card code "+ text +" in the card code field" + cardCodeField.toString());
        sendTextToElement(cardCodeField,text);
    }
    public void clickOnContinueButton(){
        Reporter.log("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }
}
