package Pages;

import model.Article;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomePage {

    private static final By ARTICLE = By.xpath(".//h3[@class='top2012-title']");
    private static final String MAIN_PAGE_MOBILE_URL = "http://m.delfi.lv";
    private static final By TITLE1 = By.xpath(".//*[contains(@class, 'top2012-title')]/a[1]");
    private static final By TITLE = By.xpath(".//a[contains(@class, 'top2012-title')]");
    private static final By COMMENT = By.xpath(".//*[contains(@class, 'top2012-title')]/a[2]");
    private static final By COMMENTS = By.xpath(".//a[contains(@class, 'comment-count')]");


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

   public void openBrowserMobile(){

        baseFunc.getToUrl(MAIN_PAGE_MOBILE_URL);
   }

   public void getTitle(){
        baseFunc.driver.findElement(TITLE);
   }

   public List<Article> getFirstFive() {

       List<WebElement> articles = getAllArticles();
       List<Article> firstFive = new ArrayList<>();

       for (int i = 0; i < 5; i++) {
           Article a = new Article();
           WebElement web = articles.get(i);
           //System.out.println(web.getText());


           a.setTitle(web.findElement(TITLE).getText());

           if (web.findElements(COMMENTS).isEmpty()) {
               a.setCommentCount(0);
           } else {
               a.setCommentCount(web.findElement(COMMENTS).getText());
           }

           a.setLink(web.getAttribute("href"));

           a.setElement(web.findElement(TITLE));

           //System.out.println(a.getTitle());


           firstFive.add(a);
           //System.out.println(firstFive);
       }
      return firstFive;
   }

   public List<Article> clickFirstArticle() {

        getFirstFive().get(0);

       return null;
   }

    public void clickLinkByHref(String href) {
        List<WebElement> anchors = baseFunc.driver.findElements(By.tagName("a"));
        Iterator<WebElement> i = anchors.iterator();

        while(i.hasNext()) {
            WebElement anchor = i.next();
            if(anchor.getAttribute("href").contains(href)) {
                anchor.click();
                break;
            }
        }
    }


}
