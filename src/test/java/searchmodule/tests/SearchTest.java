package searchmodule.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import searchmodule.pages.SearchPage;
import tests.BaseTest;


public class SearchTest extends BaseTest {

    @Test
    public void search(){
        SearchPage searchPage =  new SearchPage(driver);
        searchPage.goTo();
        searchPage.doSearch("java");
    }
}
