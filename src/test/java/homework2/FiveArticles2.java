package homework2;

import Pages.BaseFunc;
import Pages.HomePage;
import model.Article;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class FiveArticles2 {

    private BaseFunc baseFunc = new BaseFunc();
    private static final Logger LOGGER = LogManager.getLogger(FiveArticles2.class);
    private static final String URL = "www.delfi.lv";

    @Test
    public void FirstFiveArticlesTest(){

        // Open main page on Web version
        LOGGER.info("We are opening www.delfi.lv");
        baseFunc.getToUrl(URL);
        HomePage homePage = new HomePage(baseFunc);

        //Creating an Arraylist for our first five articles
        LOGGER.info("We are creating an arraylist for first five articles");
        List<Article> firstFive = homePage.getFirstFive();


        //Open mobile page
        //Create list and get all articles
        //Create mobile  first five Arraylist
        //Get first five articles to the list
        //Compare firstFive web with firstFIve mobile

        //Open 1 article
        //Get firstArticle title and comment
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
