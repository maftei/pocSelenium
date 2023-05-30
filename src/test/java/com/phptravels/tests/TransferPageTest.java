package com.phptravels.tests;

import com.newtours.pages.RegistartionPage;
import com.newtours.pages.RegistrationConfirmationPage;
import com.phptravels.pages.TransferPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.BaseTest;

public class TransferPageTest  extends BaseTest {

//      private WebDriver driver;
//
//    @BeforeTest
//    public void setupDriver(){
//        System.setProperty("webdriver.chrome.driver",
//                "C:\\Users\\razva\\Downloads\\chromedriver.exe");
//        this.driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }

    @Test
    public void transferPage(){
        TransferPage transferPage =  new TransferPage(driver);
        transferPage.goTo();
        transferPage.submit();
    }
}
