package hw1.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.List;

public class Locators {

    public static void main(String[] args) {

        //Chrome
        System.setProperty("webdriver.chrome.driver", "D:\\TestDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Firefox
        //System.setProperty("webdriver.gecko.driver","D:\\TestDrivers\\geckodriver.exe" );
        //WebDriver driver= new FirefoxDriver();

        //Edge
        //System.setProperty("webdriver.edge.driver", "D:\\TestDrivers\\msedgedriver.exe");
        //WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php");

        //Using cssSelector
        driver.findElement(By.cssSelector("a.blockbestsellers")).click();

        //Using xpath by single attr
        //driver.findElement(By.xpath("//*[@id=\"home-page-tabs\"]/li[2]/a")).click();

        driver.findElement(By.id("search_query_top")).sendKeys("test" + Keys.ENTER);
        driver.navigate().back();

        List<WebElement> elements = driver.findElements(By.cssSelector("#blockbestsellers div.right-block div.content_price span[class=\"price product-price\"]"));

        String lblFirstElement = elements.get(0).getText();
        String lblLastElement = elements.get(elements.size() - 1).getText();

        System.out.println(lblFirstElement);
        System.out.println(lblLastElement);

        driver.quit();
    }


}
