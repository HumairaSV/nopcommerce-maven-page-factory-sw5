package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeskTopPage extends Utility {
    @CacheLookup
    @FindBy(name = "products-orderby")
    WebElement sortByName;

    @CacheLookup
    @FindBy(css = "div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-2 div.page.category-page div.page-body div.products-container div.products-wrapper div.product-grid div.item-grid div.item-box:nth-child(1) div.product-item div.details div.add-info div.buttons > button.button-2.product-box-add-to-cart-button:nth-child(1)")
    WebElement addToCart;

    public void selectSortByName(String text) {
        Reporter.log("Select sort by Name" + sortByName.toString());
        selectByVisibleTextFromDropDown(sortByName, text);

    }

    public void clickOnAddToCart() throws InterruptedException {
        Reporter.log("Click on add to cart button" + addToCart.toString());
        Thread.sleep(5000);
        clickOnElement(addToCart);
    }

    public Map<String, ArrayList> arrangeProductInDescendingOrder() {
        Map<String, ArrayList> mapArrays = new HashMap<String, ArrayList>();
        List<WebElement> products = driver.findElements(By.xpath("//h2/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
//        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        // Select sort by Name Z - A
        selectByVisibleTextFromDropDown(By.id("products-orderby"), "Name: Z to A");
        // After filter Z -A Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//h2/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        mapArrays.put("originalProductsName", originalProductsName);
        mapArrays.put("afterSortByZToAProductsName", afterSortByZToAProductsName);
        return mapArrays;

    }

}
