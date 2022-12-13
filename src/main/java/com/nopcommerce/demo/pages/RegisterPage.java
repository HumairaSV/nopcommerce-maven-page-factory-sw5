package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerPageText;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailId;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationPageText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButtonText;


    public String verifyRegisterText(){
        Reporter.log("Verify the Register page text" + registerPageText.toString());
        return getTextFromElement(registerPageText);
    }

    public void enterFirstName(String text){
        Reporter.log("Enter first name "+ text +" in the first name field" + firstName.toString());
        sendTextToElement(firstName,text + getRandomString(5));
    }
    public void enterLastName(String text){
        Reporter.log("Enter last name "+ text +" in the last name field" + lastName.toString());
        sendTextToElement(lastName,text + getRandomString(5));
    }
    public void enterEmail(String text){
        Reporter.log("Enter email "+ text + " in the email address field" + emailId.toString());
        sendTextToElement(emailId,text );
    }
    public void enterPassword(String text){
        Reporter.log("Enter password "+ text + " in the  password field" + password.toString());
        sendTextToElement(password,text);
    }
    public void enterConfirmPassword(String text){
        Reporter.log("Enter confirm password "+ text + " in the confirm password field" + confirmPassword.toString());
        sendTextToElement(confirmPassword, text);
    }

    public void clickOnRegisterButton(){
        Reporter.log("Click on register button" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String verifyRegistrationText(){
        Reporter.log("Verify the Registration page text" + registrationPageText.toString());
        return getTextFromElement(registrationPageText);
    }

    public void clickOnContinueButton(){
        Reporter.log("Click on continue button" + continueButtonText.toString());
        clickOnElement(continueButtonText);
    }
}
