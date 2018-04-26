package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class BaseFunc {

    public WebDriver driver;

    public BaseFunc() {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public void getToUrl(String url) {
        if (!url.contains("http://") && !url.contains("https://")) {
            url = "http://" + url;
        }
        driver.get(url);
    }

    public List<WebElement> getElements(By locator) {


        return (List<WebElement>) driver.findElements(locator);
    }

    public void quitBrowser(){

        driver.quit();
    }



    public void openNewTab(){
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

    }


}
