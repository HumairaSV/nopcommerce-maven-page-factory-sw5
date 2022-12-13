package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellPhonesPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1[text() = 'Cell phones']")
    WebElement cellPhonesText;

    @CacheLookup
    @FindBy(xpath = "//div/a[text()='List']")
    WebElement listViewLink;

    @CacheLookup
    @FindBy(xpath = "//h2/a[text()='Nokia Lumia 1020']")
    WebElement nokiaLumiaText;


    public String verifyCellPhonesText() {
        Reporter.log("Verify the Cell Phones Page text" + cellPhonesText.toString());
        return getTextFromElement(cellPhonesText);
    }

    public void clickOnListView() {
        Reporter.log("Click on list view link" + listViewLink.toString());
        clickOnElement(listViewLink);
    }

    public void clickOnNokiaLumia() {
        Reporter.log("Click on product nokia lumia" + nokiaLumiaText.toString());
        clickOnElement(nokiaLumiaText);
    }
}
