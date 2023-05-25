package com.newtours.pages;

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

    @FindBy(name = "firstName")
    private WebElement firstNameTxt;

    @FindBy(name = "lastName")
    private WebElement lastNameTxt;

    @FindBy(name = "email")
    private WebElement usernameTxt;

    @FindBy(name = "passsword")
    private WebElement passwordTxt;

    @FindBy(name = "confirmPasssword")
    private WebElement confirmPasswordTxt;

    @FindBy(name = "submit")
    private WebElement submitBtn;

    public RegistartionPage(WebDriver driver ) {
        this.driver  = driver;
        this.wait =  new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }
    public void goTo(){
        this.driver.get("https://demo.guru99.com/test/newtours/");
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
