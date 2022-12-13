package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class NokiaLumiaPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumiaText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement nokiaPrice;

    @CacheLookup
    @FindBy(css = "#add-to-cart-button-20")
    WebElement nokiaAddToCartLink;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement productAddedText;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement crossButtonLink;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverShoppingCart;

    @CacheLookup
    @FindBy(css ="#product_enteredQuantity_20" )
    WebElement quantity;

    public String verifyNokiaLumiaText(){
        Reporter.log("Verify the product Nokia Lumia page text" + nokiaLumiaText.toString());
        return getTextFromElement(nokiaLumiaText);
    }

    public String verifyNokiaPrice(){
        Reporter.log("Verify the product Nokia Lumia price" + nokiaPrice.toString());
        return getTextFromElement(nokiaPrice);
    }

    public void changeNokiaQuantity(String qty){
        Reporter.log("Change the quantity of product to "+qty + quantity.toString());
        quantity.clear();
        sendTextToElement(quantity, qty);
    }

    public void nokiaAddToCartButton(){
        Reporter.log("Add the nokia phone to cart" + nokiaAddToCartLink.toString());
        clickOnElement(nokiaAddToCartLink);
    }

    public String productAddedToTheCartMessage(){
        Reporter.log("Verify the message that product is added to cart" + productAddedText.toString());
        return getTextFromElement(productAddedText);
    }

    public void clickOnCrossButton(){
        Reporter.log("Click on the cross button" + crossButtonLink.toString());
        clickOnElement(crossButtonLink);
    }

    public void clickOnShoppingCartLink(){
        Reporter.log("Mouse hover on the shopping cart and click on go to cart link " + mouseHoverShoppingCart.toString() + shoppingCartLink.toString());
        mouseHoverToElement(mouseHoverShoppingCart);
        clickOnElement(shoppingCartLink);

    }
}
