package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartText1;

    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateCart;

    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal'][text()='$2,950.00']")
    WebElement price;

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement checkboxTerms;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkout;

    @CacheLookup
    @FindBy(xpath = "//td[@class='quantity']/child::input")
    WebElement productQuantityText;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement totalPrice;

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termsOfService;

    @CacheLookup
    @FindBy(xpath = "//td[@class='quantity']/child::input")
    WebElement quantity;

    public String verifyShoppingCartText() {
        Reporter.log("Verify the shopping cart page text" + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public String verifyShoppingCartText1() {
        Reporter.log("Verify the shopping cart page text" + shoppingCartText1.toString());
        return getTextFromElement(shoppingCartText1);
    }

    public void updateQuantity(String text) throws InterruptedException {
        Reporter.log("Click on update quantity field" + quantity.toString());
        Thread.sleep(3000);
        quantity.clear();
        quantity.sendKeys(text);
    }
    public void UpdateShoppingCart(){
        Reporter.log("Click on update shopping cart" + updateCart.toString());
        clickOnElement(updateCart);
    }
    public String verifyTheTotalPrice() {
        Reporter.log("Verify the total price of the cart" + price.toString());
        return getTextFromElement(price);
    }
    public void clickOnCheckBox(){
        Reporter.log("Click on checkbox terms" + checkboxTerms.toString());
        clickOnElement(checkboxTerms);
    }
    public void clickOnCheckOutButton(){
        Reporter.log("Click on check out button" + checkout.toString());
        clickOnElement(checkout);
    }

    public String verifyProductQuantity(){
        Reporter.log("Verify the total no of products in the cart" + productQuantityText.toString());
        WebElement wb = productQuantityText;
        String actualQuantity = wb.getAttribute("value");
        return actualQuantity;
    }

    public String verifyTotalPrice(){
        Reporter.log("Verify the total amount in the cart" + totalPrice.toString());
        return getTextFromElement(totalPrice);
    }

    public void clickOnTermsOfService(){
        Reporter.log("Click on Terms of service" + checkboxTerms.toString());
        clickOnElement(checkboxTerms);
    }

}
