package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computerPageName;

    public void clickOnDesktopTab(){
        Reporter.log("Click on desktop tab " + desktopLink.toString());
        clickOnElement(desktopLink);
    }

    public String verifyComputersPageText()throws InterruptedException{
        Reporter.log("Verify Computers page text" + computerPageName.toString());
        Thread.sleep(5000);
        return getTextFromElement(computerPageName);
    }
}
