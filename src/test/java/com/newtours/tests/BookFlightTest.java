package com.newtours.tests;


import com.newtours.pages.RegistartionPage;
import com.newtours.pages.RegistrationConfirmationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookFlightTest {

    private WebDriver driver;

    @BeforeTest
    public void setupDriver(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\razva\\Downloads\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    @Test
    public void registrationPage(){
        RegistartionPage registartionPage =  new RegistartionPage(driver);
        registartionPage.goTo();
        registartionPage.enterUserDetails("Maftei", "Razvan");
        registartionPage.enterUserCredentials("razvan@gmail.com", "@pass@!");
        registartionPage.submit();
    }

    @Test(dependsOnMethods ="registrationPage" )
    public void registrationConfirmationPage(){
        RegistrationConfirmationPage registrationConfirmationPage =
                new RegistrationConfirmationPage(driver);
        registrationConfirmationPage.gotToFlightDetailsPage();
    }
//    @Test(dependsOnMethods = "registrationConfirmationPage")
//    public void flightDetailsPage(){
//        FlightDetailsPage flightDetailsPage =  new FlightDetailsPage(driver);
//        flightDetailsPage.selectPassengers("2");
//        flightDetailsPage.goToFindFlightsPage();
//    }

}
