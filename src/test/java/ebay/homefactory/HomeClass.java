package ebay.homefactory;

import ebay.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static ebay.DriverFactory.driver;

public class HomeClass extends DriverFactory {

        //find element for search box
        @FindBy(id = "gh-ac")
        WebElement Searchbar;
        public void searchbox(String item)
        {
            Searchbar.sendKeys(item);
        }
        //find element for search logo and click on magnifier
        @FindBy(id ="gh-btn")
        WebElement clickbox;
        public void clickonsearch(){
            clickbox.click();
        }
        // find elements for sort price box and select low to high
       // public void lowtohigh() {
         //   WebElement select = driver.findElement(By.xpath("//*[@id=\"w8\"]/button/div/div"));
           // Select sel = new Select(select);
            //sel.selectByIndex(0);
       // }

            //find elements for add to basket
            public void selectproduct() {
                WebElement sel = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/a"));
                sel.click();
            }
                    public void selectsize(){
                    WebElement select = driver.findElement(By.cssSelector("#msku-sel-1"));
                    Select sel1 = new Select(select);
                    sel1.selectByValue("0");
                }
                    public void addtocart(){
                    WebElement add = driver.findElement(By.cssSelector("#atcRedesignId_btn"));
                    add.click();
                }
            }
        //find elements for all the products in low to high
        //public void priceranges() {
        //  List<WebElement> elements = driver.findElements(By.cssSelector(".a-price"));
        //for (WebElement element : elements) {
        //  String prices = element.getText().replaceFirst("£", "");
        //System.out.println(prices);

        //public String pageURL(){

        //    return driver.getCurrentUrl();


      //  }





