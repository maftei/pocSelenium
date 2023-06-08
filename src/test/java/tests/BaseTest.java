package tests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;


public class BaseTest {

    public WebDriver driver;

    @BeforeTest
    public void setupDriver(ITestContext ctx) throws MalformedURLException {

        String host  = null;  // "localhost" ;           //"52.205.57.116";
       // DesiredCapabilities dc = DesiredCapabilities.chrome();

        DesiredCapabilities dc = null;

        if(System.getProperty("BROWSER")!=null &&
                System.getProperty("BROWSER").equalsIgnoreCase("edge")){
                //dc = DesiredCapabilities.edge();
            dc= DesiredCapabilities.edge();
        }else{
            dc=DesiredCapabilities.chrome();
        }

        if (System.getProperty("HUB_HOST") !=null){
            host = System.getProperty("HUB_HOST");
        }

        String testName= ctx.getCurrentXmlTest().getName();

        String completeURL= "http://" + host + ":4444/wd/hub";
        this.driver =  new RemoteWebDriver(new URL(completeURL), dc);
//
//        System.setProperty("webdriver.chrome.driver",
//                "C:\\Users\\razva\\Downloads\\chromedriver.exe");
//        this.driver = new ChromeDriver();
//        driver.manage().window().maximize();
    }

    @AfterTest
    public void quitDriver(){
        this.driver.quit();
    }
}
