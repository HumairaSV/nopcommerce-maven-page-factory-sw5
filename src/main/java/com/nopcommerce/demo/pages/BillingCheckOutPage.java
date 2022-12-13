package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.model.Report;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BillingCheckOutPage extends Utility {

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNamefield;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailAddressField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countryField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement stateField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement zipCodeField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberField;

    @CacheLookup
    @FindBy(xpath = "//div[1]/button[4]")
    WebElement checkout;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement continueButton;


    public void enterBillingFirstName(String text) {
        Reporter.log("Enter first name "+ text +" in the first name field" + firstNamefield.toString());
        sendTextToElement(firstNamefield, text);
    }

    public void enterBillingLastName(String text) {
        Reporter.log("Enter last name "+ text +" in the last name field" + lastNameField.toString());
        sendTextToElement(lastNameField, text);
    }

    public void enterBillingEmailAddress(String text) {
        Reporter.log("Enter email "+ text + " in the email address field" + emailAddressField.toString());
        sendTextToElement(emailAddressField, text);
    }

    public void selectCountryFromDropDown(String text) {
        Reporter.log("Select Country "+ text + " from the drop down menu" + countryField.toString());
        selectByValueFromDropDown(countryField, text);
    }

    public void selectStateFromDropDown(String text) {
        Reporter.log("Select State "+ text + " from the drop down menu" + stateField.toString());
        selectByValueFromDropDown(stateField, text);
    }

    public void enterBillingCity(String text) {
        Reporter.log("Enter City "+ text + " in the City field" + cityField.toString());
        sendTextToElement(cityField, text);
    }

    public void enterBillingAddress(String text) {
        Reporter.log("Enter address "+ text + " in the address field" + addressField.toString());
        sendTextToElement(addressField, text);
    }

    public void enterBillingZipcode(String text) {
        Reporter.log("Enter zip code "+ text + " in the zip code field" + zipCodeField.toString());
        sendTextToElement(zipCodeField, text);
    }

    public void enterBillingPhoneNumber(String text) {
        Reporter.log("Enter Phone no "+ text + " in the Phone no field" + phoneNumberField.toString());
        sendTextToElement(phoneNumberField, text);
    }

    public void clickOnCheckOutButton() {
        Reporter.log("Click on Check out button" + checkout.toString());
        clickOnElement(checkout);
    }

    public void clickOnContinueButton() {
        Reporter.log("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }
}
