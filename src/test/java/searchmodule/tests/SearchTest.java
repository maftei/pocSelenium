package searchmodule.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import searchmodule.pages.SearchPage;

public class SearchTest {

    private WebDriver driver;

    @BeforeTest
    public void setupDriver(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\razva\\Downloads\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    @Test
    public void sarch(){
        SearchPage searchPage =  new SearchPage(driver);
        searchPage.goTo();
        searchPage.doSearch("java");
        searchPage.goToVideos();
        searchPage.printResult();
    }

    @AfterTest
    public void quitDriver(){
        this.driver.quit();
    }
}
