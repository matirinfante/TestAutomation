package hw1.introduction;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Introduction {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\TestDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

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
