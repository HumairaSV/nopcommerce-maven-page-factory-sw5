package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputer;


    @CacheLookup
    @FindBy(name = "product_attribute_1")
    WebElement processorName;

    @CacheLookup
    @FindBy(name = "product_attribute_2")
    WebElement ram;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hDD;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement oS;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement software;

    @CacheLookup
    @FindBy(xpath = "//span[text() = '$1,475.00']")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[5]/div[1]/p[1]")
    WebElement message;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[5]/div[1]/span[1]")
    WebElement closeBar;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickCart;


    public String verifytheTextBuildyourowncomputer() {
        Reporter.log("Verify the build your own computer page text" + buildYourOwnComputer.toString());
        return getTextFromElement(buildYourOwnComputer);
    }

    public void selectProcessor(String text) {
        Reporter.log("Select the processor" + processorName.toString());
        selectByValueFromDropDown(processorName, text);
    }

    public void selectRam(String text) {
        Reporter.log("Select Ram from drop down menu" + ram.toString());
        selectByValueFromDropDown(ram, text);
    }

    public void selectHDDRadio() {
        Reporter.log("Click on HDD radio button" + hDD.toString());
        clickOnElement(hDD);
    }

    public void selectOSRadiVistaPremium() {
        Reporter.log("Select OS Vista Premium" + oS.toString());
        clickOnElement(oS);
    }

    public void selectSoftware() {
        Reporter.log("Click on select software" + software.toString());
        clickOnElement(software);
    }

    public String verifyThePrice() {
        Reporter.log("Verify the price" + price.toString());
        return getTextFromElement(price);
    }

    public void clickOnAddToCartButton() {
        Reporter.log("Click on add to cart button" + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String verifyTheMessageOnTopGreenBar() {
        Reporter.log("Verify the success message on the top green bar" + message.toString());
        return getTextFromElement(message);
    }

    public void clickOnCloseBar() {
        Reporter.log("Click on close icon" + closeBar.toString());
        clickOnElement(closeBar);
    }

    public void mouseHoverOnShoppingCart() {
        Reporter.log("Mouse hover on the shopping cart link" + shoppingCart.toString());
        mouseHoverToElement(shoppingCart);
    }

    public void clickOnShoppingCart() {
        Reporter.log("Click on Go to Cart link" + clickCart.toString());
        clickOnElement(clickCart);
    }


}
