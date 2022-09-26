package hw1.introduction;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Introduction {


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

        driver.get("http://opencart.abstracta.us/index.php?route=common/home");

        String title = driver.getTitle();
        if (!title.equals("My Store")) {
            System.out.println("ERROR: title is not My Store");
        }

        driver.navigate().to("https://www.google.com.sv/");
        driver.navigate().back();

        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("http://opencart.abstracta.us/index.php?route=common/home")) {
            driver.quit();
        }


    }

}
