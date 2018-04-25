package Pages;

import model.Article;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    public static final By ARTICLE_TITLE = By.xpath("//a[@class='top2012-title']");

    private static final By ARTICLE = By.className("top2012-big");

    private static final String MAIN_PAGE_WEB_URL = "http://www.delfi.lv";

    private static final String MAIN_PAGE_MOBILE_URL = "http://m.delfi.lv";

    public static final By TITLE1 = By.xpath(".//*[contains(@class, 'top2012-title')]/a[1]");

    public static final By TITLE = By.xpath(".//a[contains(@class, 'top2012-title')]");

    public static final By COMMENT = By.xpath(".//*[contains(@class, 'top2012-title')]/a[2]");

    public static final By COMMENTS = By.xpath(".//a[contains(@class, 'comment-count')]");



    BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {

        this.baseFunc = baseFunc;
    }

    public List<WebElement> getAllArticles(){
        return baseFunc.getElements(ARTICLE);
    }

    public List<WebElement> getAllTitles() {

        //Find all titles and add them to a list!
        return baseFunc.getElements(TITLE);
    }

    public List<WebElement> getAllComments(){

        //Find all comments and add them to a list!
        return baseFunc.getElements(COMMENT);
    }

   public void openBrowser(){
        baseFunc.getToUrl(MAIN_PAGE_WEB_URL);
    }

   public void openBrowserMobile(){
        baseFunc.getToUrl(MAIN_PAGE_MOBILE_URL);
   }
}
