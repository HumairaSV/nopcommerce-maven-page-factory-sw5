package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage;
    ComputerPage computerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        computerPage = new ComputerPage();

    }

    @Test(groups = {"sanity", "regression"})
    public void verifyPageNavigation()throws  InterruptedException{
       // homePage.mouseHoverAndClickOnComputers();
        homePage.selectTopMenu("Computers");
        Thread.sleep(5000);
        Assert.assertEquals(computerPage.verifyComputersPageText(), "Computers", "Not navigated to Computers page");

    }
}
