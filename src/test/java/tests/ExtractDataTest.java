package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;

public class ExtractDataTest extends BasePage {
    @Test(priority = 0)
    public void getData(){
        HomePage homePage = new HomePage(driver);
        homePage.getStockData();
    }
}
