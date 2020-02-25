package ebay;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;

    public DriverFactory() {

        PageFactory.initElements(driver, this);
    }

    //Create Open browser method
    public void openbrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.ebay.co.uk");
    }
    //create maxi browser method
    public void maxibrowser() {

        driver.manage().window().maximize();
    }
    //create implicitly wait method
    public void implicitlywait() {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    // create  close browser method
    public void closebrowser() {

        driver.close();
    }
}