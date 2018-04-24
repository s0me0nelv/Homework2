package homework2;

import Pages.BaseFunc;
import Pages.HomePage;
import model.Article;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Test;
import org.omg.PortableInterceptor.HOLDING;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

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
        List<WebElement> articleTitles = homePage.getAllTitles();

        //Creating an Arraylist for our first five articles
        LOGGER.info("We are creating an arraylist for first five articles");
        List<Article> firstFive = new ArrayList<Article>();

        for (int i = 0; i < 5; i++){
            Article a = new Article();
            WebElement web = articleTitles.get(i);
            //System.out.println(web.getText());

            a.setTitle(web.findElement(homePage.ARTICLE_TITLE).getText());
            if (web.findElements(homePage.COMMENTS).isEmpty()) {
                a.setCommentCount(0);
            } else {
                a.setCommentCount(web.findElement(homePage.COMMENTS).getText());
            }
            //System.out.println(a);

            firstFive.add(a);


        }




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

    @After
    public void end(){
        baseFunc.quitBrowser();
    }
}
