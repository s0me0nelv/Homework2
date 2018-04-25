package homework2;

import Pages.ArticlePage;
import Pages.BaseFunc;
import Pages.HomePage;
import model.Article;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Test;
import org.omg.PortableInterceptor.HOLDING;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FiveArticles {

    private BaseFunc baseFunc = new BaseFunc();
    private static final Logger LOGGER = LogManager.getLogger(FiveArticles.class);


    @Test
    public void FirstFiveArticlesTest(){

        // Open main page on Web version
        LOGGER.info("We are opening www.delfi.lv");
        HomePage homePage = new HomePage(baseFunc);
        homePage.openBrowser();

        // Finding all article titles and setting them to a list
        LOGGER.info("We are finding all article titles and creating a list");
        List<WebElement> articles = homePage.getAllArticles();

        //Creating an Arraylist for our first five articles
        LOGGER.info("We are creating an arraylist for first five articles");
        List<Article> firstFive = new ArrayList<Article>();

        for (int i = 0; i < 5; i++){
            Article a = new Article();
            WebElement web = articles.get(i);
            //System.out.println(web.getText());




            a.setTitle(web.findElement(homePage.TITLE).getText());
            if (web.findElements(homePage.COMMENTS).isEmpty()) {
                a.setCommentCount(0);
            } else {
                a.setCommentCount(web.findElement(homePage.COMMENTS).getText());
            }

            //System.out.println(a.getTitle());

            firstFive.add(a);
            //System.out.println(firstFive);





        }
        articles.get(0).click();
        ArticlePage aaa = new ArticlePage(baseFunc);
        WebElement article1 = aaa.getArticleName();
          System.out.println(article1.getText());
        baseFunc.driver.navigate().back();
        baseFunc.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        articles.get(1).click();
        WebElement article2 = aaa.getArticleName();
        System.out.println(article2.getText());



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
