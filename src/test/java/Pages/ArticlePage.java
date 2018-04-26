package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ArticlePage {
    BaseFunc baseFunc;
    private static final By ARTICLE_NAME = By.xpath("//span[@itemprop='headline name']");


    public ArticlePage(BaseFunc baseFunc) {

        this.baseFunc = baseFunc;
    }

    public WebElement getArticleName(){

        return this.baseFunc.driver.findElement(ARTICLE_NAME);


    }
}
