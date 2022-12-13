package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShippingMethodCheckoutPage extends Utility {

    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement nextDayAir;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_2']")
    WebElement secondDayAir;

    public void clickOnRadioButtonTextDayAir(){
        Reporter.log("Click on next day air button" + nextDayAir.toString());
        clickOnElement(nextDayAir);
    }
    public void clickOnContinue(){
        Reporter.log("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void clickOnRadioButtonSecondDayAir(){
        Reporter.log("Click on radio button shipping by second day air" + secondDayAir.toString());
        clickOnElement(secondDayAir);
    }
}
