package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computers;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktops;

    @CacheLookup
    @FindAll(@FindBy(how = How.XPATH, using ="//ul[@class = 'top-menu notmobile']/li" ))
    List<WebElement> topMenu;


    @CacheLookup
    @FindBy(linkText = "Electronics")
    WebElement electronics;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellphones;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutText;



    public void selectTopMenu(String text){
        Reporter.log("Select "+ text + " the top menu" + topMenu.toString());
        try{
            selectMenu(topMenu, text);
        }catch (StaleElementReferenceException e){
            List<WebElement>topMenu;
        }
    }
    public void mouseHoverAndClickOnComputers() {
        Reporter.log("Mouse hover and click on Computers link" + computers.toString());
        mouseHoverToElementAndClick(computers);
    }


    public void mouseHoverOnComputers() {
        Reporter.log("Mouse hover on Computers link" + computers.toString());
        mouseHoverToElementAndClick(computers);
    }

    public void clickOnDeskTop() {
        Reporter.log("Click on desktops link " + desktops.toString());
        clickOnElement(desktops);
    }



    public void mouseHoverOnElectronics() {
        Reporter.log("Mouse hover on electronics link" + electronics.toString());
        mouseHoverToElement(electronics);
    }

    public void mouseHoverOnCellPhonesAndClick() {
        Reporter.log("Mouse hover and click on Cell phones link" + cellphones.toString());
        mouseHoverToElementAndClick(cellphones);
    }

    public String verifyWelComeText() {
        Reporter.log("Verify the welcome text" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnLogoutButton() {
        Reporter.log("Click on logout button" + logoutText.toString());
        clickOnElement(logoutText);
    }

}