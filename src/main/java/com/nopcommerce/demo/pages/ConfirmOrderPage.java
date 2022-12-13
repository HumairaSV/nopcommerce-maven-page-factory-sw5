package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ConfirmOrderPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement paymentMethod;

    @CacheLookup
    @FindBy(xpath = "//div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]")
    WebElement shippingtMethod;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[4]/td[2]/span[1]/strong[1]")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]")
    WebElement secondDayAir;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[4]/td[2]/span[1]/strong[1]")
    WebElement nokiaTotalPrice;


    public String verifyCreditCardPaymentMethod(){
        Reporter.log("Verify the payment method text" + paymentMethod.toString());
        return getTextFromElement(paymentMethod);
    }
    public String verifyShippingMethod(){
        Reporter.log("Verify the shipping method text" + shippingtMethod.toString());
        return getTextFromElement(shippingtMethod);
    }
    public String verifyTheTotalPrice() {
        Reporter.log("Verify the total amount" + price.toString());
        return getTextFromElement(price);
    }
    public void clickOnConFirm(){
        Reporter.log("Click on confirm button" + confirmButton.toString());
        clickOnElement(confirmButton);
    }

    public String verifySecondDayAir(){
        Reporter.log("Verify shipping is Second day by air" + secondDayAir.toString());
        return getTextFromElement(secondDayAir);
    }

    public String verifyNokiaTotalPrice(){
        Reporter.log("Verify the total price of the nokia phone" + nokiaTotalPrice.toString());
        return getTextFromElement(nokiaTotalPrice);
    }
}
