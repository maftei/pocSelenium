package com.newtours.tests;

import com.newtours.pages.RegistartionPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookFlightTest {

    private WebDriver driver;

    @BeforeTest
    public void setupDriver(){
        this.driver = new ChromeDriver();
    }

    @Test
    public void registrationPageTest(){
        RegistartionPage registartionPage =  new RegistartionPage(driver);
        registartionPage.enterUserDetails("Maftei", "Razvan");
        registartionPage.enterUserCredentials("razvan@gmail.com", "@pass@!");
        registartionPage.submit();
    }

}
