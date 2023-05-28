package com.newtours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistartionPage {

    private WebDriver driver;
    private WebDriverWait wait;


    @FindBy(name = "AcceptAll")
    private WebElement accpetAll;


    @FindBy(name = "firstName")
    private WebElement firstNameTxt;

    @FindBy(name = "lastName")
    private WebElement lastNameTxt;

    @FindBy(name = "email")
    private WebElement usernameTxt;

    @FindBy(name = "password")
    private WebElement passwordTxt;

    @FindBy(name = "confirmPassword")
    private WebElement confirmPasswordTxt;

    @FindBy(name = "register")
    private WebElement submitBtn;

    public RegistartionPage(WebDriver driver ) {
        this.driver  = driver;
        this.wait =  new WebDriverWait(driver, 50);
        PageFactory.initElements(driver, this);
    }
    public void goTo(){
        this.driver.get("https://vins-udemy.s3.amazonaws.com/docker/docker-book-flight.html#");
        this.wait.until(ExpectedConditions.visibilityOf(this.firstNameTxt));
    }

    public void enterUserDetails(String userFirstName, String userLastName){
        this.firstNameTxt.sendKeys(userFirstName);
        this.lastNameTxt.sendKeys(userLastName);
    }

    public void enterUserCredentials(String userName, String password){
        this.usernameTxt.sendKeys(userName);
        this.passwordTxt.sendKeys(password);
    }

    public void submit(){
        this.submitBtn.click();
    }
}
