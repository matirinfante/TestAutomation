package hw1.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class Locators {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\TestDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php");

        //Using cssSelector
        driver.findElement(By.cssSelector("a.blockbestsellers")).click();

        //Using xpath by single attr
        //driver.findElement(By.xpath("//*[@id=\"home-page-tabs\"]/li[2]/a")).click();

        driver.findElement(By.id("search_query_top")).sendKeys("test" + Keys.ENTER);
        driver.navigate().back();

        List<WebElement> elements = driver.findElements(By.cssSelector("#blockbestsellers .price.product-price"));

        for (WebElement e : elements) {
            System.out.println(e.getText());
        }

        String txtFirstElement = elements.get(1).getText();
        String txtLastElement = elements.get(elements.size() - 1).getText();

        System.out.println(txtFirstElement);
        System.out.println(txtLastElement);

        driver.quit();
    }


}
