package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import ultils.StockData;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void getStockData() {
        List<WebElement> rows = driver.findElements(By.xpath("//div[@id='pills-active']//tbody/tr"));
        List<StockData> stockData = new ArrayList<>();
        for (WebElement cells : rows) {
            WebElement codeElm = cells.findElement(By.cssSelector("td:nth-child(1)"));
            String code = codeElm.getText();
            WebElement nameElm = cells.findElement(By.tagName("th"));
            String name = nameElm.getText();
            WebElement lastDoneElm = cells.findElement(By.cssSelector("td:nth-child(3)"));
            String lastDone = lastDoneElm.getText();
            WebElement changeElm = cells.findElement(By.cssSelector("td:nth-child(4)"));

            //Resolve for case change = "-" return 0.0
            double change = 0.0;
            if (changeElm.getText().trim().equals("-")) {
                change = 0.0;
            } else {
                change = Double.parseDouble(changeElm.getText());
            }
            WebElement volElm = cells.findElement(By.cssSelector("td:nth-child(5)"));
            String vol = volElm.getText();
            stockData.add(new StockData(code, name, lastDone, change, vol));
        }
        //Collection arrayList sort
        stockData.sort(Comparator.comparingDouble(StockData::getChange));
        Collections.reverse(stockData);

        for (StockData data : stockData){
            System.out.println(data.toString());
        }
    }
}
