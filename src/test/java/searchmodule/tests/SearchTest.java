package searchmodule.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import searchmodule.pages.SearchPage;
import tests.BaseTest;


public class SearchTest extends BaseTest {

    private WebDriver driver;



    @Test
    public void search(){
        SearchPage searchPage =  new SearchPage(driver);
        searchPage.goTo();
        searchPage.doSearch("java");
//        searchPage.goToVideos();
//        searchPage.printResult();
    }
}
