package homework2;

import Pages.ArticlePage;
import Pages.BaseFunc;
import Pages.HomePage;
import model.Article;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.omg.PortableInterceptor.HOLDING;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FiveArticles {

    private BaseFunc baseFunc = new BaseFunc();
    private static final Logger LOGGER = LogManager.getLogger(FiveArticles.class);
    private static final String URL = "www.delfi.lv";

    @Test
    public void FirstFiveArticlesTest(){

        // Open main page on Web version
        LOGGER.info("We are opening www.delfi.lv");
        baseFunc.getToUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        ArticlePage articlePage = new ArticlePage(baseFunc);

        //Creating firstFive list and filling it with first five article titles, comment count and links
        LOGGER.info("We are creating an arraylist for the first five articles");
        List<Article> firstFive = homePage.getFirstFive();


        //Click on the first article
        firstFive.get(0).getElement().click();
        //Get firstArticle title, comment count and link
        List<Article> firstArticle = articlePage.getArticle();
        //Compare firstArticle with firstFive
        Assert.assertEquals("First article is not the same", firstFive.get(0).getTitle(), firstArticle.get(0).getTitle());

        //Go to the second article
        baseFunc.getToUrl(firstFive.get(1).getLink());








        //Open mobile page
        //Create list and get all articles
        //Create mobile  first five Arraylist
        //Get first five articles to the list
        //Compare firstFive web with firstFIve mobile



        //Compare with firstFive
        //Go to comment page
        //Get comment + comment
        //Compare with firstFive





//        articles.get(0).click();
//        ArticlePage aaa = new ArticlePage(baseFunc);
//        WebElement article1 = aaa.getArticleName();
//          System.out.println(article1.getText());
//        baseFunc.driver.navigate().back();
//        baseFunc.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        articles.get(1).click();
//        WebElement article2 = aaa.getArticleName();
//        System.out.println(article2.getText());



        //Article article1 = new Article();
        //WebElement article11 = baseFunc.driver.findElement()

        //LOGGER.info("Opening new tab");
       //baseFunc.openNewTab();



      //  List<WebElement> comments = homePage.getAllComments();

//        for (int i = 0; i < 5; i++) {
//            Article a = new Article();
//            WebElement com = comments.get(i);
//            //System.out.println(com.getText());
//            a.setCommentCount(com.getText());
//            firstFive.add(a);
//            System.out.println(firstFive);
//        }



    }

//    @After
//    public void end(){
//        baseFunc.quitBrowser();
//    }
}
