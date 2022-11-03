package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
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
        for (WebElement cells : rows) {
            WebElement code = cells.findElement(By.cssSelector("td:nth-child(1)"));
            WebElement name = cells.findElement(By.tagName("th"));
            WebElement lastDone = cells.findElement(By.cssSelector("td:nth-child(3)"));
            WebElement change = cells.findElement(By.cssSelector("td:nth-child(4)"));
            WebElement vol = cells.findElement(By.cssSelector("td:nth-child(5)"));
            System.out.println(code.getText() + " | " + name.getText() + " | " + lastDone.getText() + " | " + change.getText() + " | " + vol.getText());
        }
    }
}
