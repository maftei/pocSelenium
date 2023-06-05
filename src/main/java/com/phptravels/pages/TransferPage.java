package com.phptravels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransferPage {
    private WebDriver driver;
    private WebDriverWait wait;



    @FindBy(id = "languages")
    private WebElement languageBtn;


    @FindBy(id = "currency")
    private WebElement currencyBtn;

    @FindBy(id = "ACCOUNT")
    private WebElement accountBtn;



    public TransferPage(WebDriver driver ) {
        this.driver  = driver;
        this.wait =  new WebDriverWait(driver, 50);
        PageFactory.initElements(driver, this);
    }
    public void goTo(){
        this.driver.get("https://phptravels.net/");
        this.wait.until(ExpectedConditions.visibilityOf(this.languageBtn));
    }

    public void submit(){
        this.languageBtn.click();
        this.currencyBtn.click();
        this.accountBtn.click();
    }
}
