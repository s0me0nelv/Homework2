package homework2;

import Pages.BaseFunc;
import Pages.HomePage;
import model.Article;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FiveArticles2 {

    private BaseFunc baseFunc = new BaseFunc();
    private static final Logger LOGGER = LogManager.getLogger(FiveArticles2.class);


    @Test
    public void FirstFiveArticlesTest() {

        // Open main page on Web version
        LOGGER.info("We are opening www.delfi.lv");
        HomePage homePage = new HomePage(baseFunc);


        // Finding all article titles and setting them to a list
        LOGGER.info("We are finding all article titles and creating a list");
        List<WebElement> articles = homePage.getAllArticles();
        for (int i = 0; i < 5; i++) {
            WebElement web = articles.get(i);

            List<WebElement> firstFive = new ArrayList<>();
            firstFive.add(web);

        }


    }
}