package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public WebDriver driver;

    @BeforeTest
    public void setupDriver() throws MalformedURLException {

        String host ="localhost";
        DesiredCapabilities dc = DesiredCapabilities.chrome();

        if(System.getProperty("BROWSER")!=null &&
                System.getProperty("BROWSER").equalsIgnoreCase("edge")){
                dc = DesiredCapabilities.edge();
        }

        String completeURL= "http://" + host + ":4444/wd/hub";
        this.driver =  new RemoteWebDriver(new URL(completeURL), dc);
//
//        System.setProperty("webdriver.chrome.driver",
//                "C:\\Users\\razva\\Downloads\\chromedriver.exe");
//        this.driver = new ChromeDriver();
    }

    @AfterTest
    public void quitDriver(){
        this.driver.quit();
    }
}
