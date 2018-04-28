package Pages;

import model.Article;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ArticlePage {
    BaseFunc baseFunc;
    private static final By ARTICLE = By.xpath(".//div[@class='article-title']");
    private static final By COMMENTS = By.xpath(".//a[contains(@class, 'comment-count')]");
    private static final By TITILE = By.xpath(".//span[contains(@itemprop, 'headline name')]");


    public ArticlePage(BaseFunc baseFunc) {

        this.baseFunc = baseFunc;
    }

    public List<Article> getArticle() {
        WebElement web = baseFunc.getElement(ARTICLE);
        List<Article> Article = new ArrayList<>();
        Article a = new Article();
        a.setTitle(web.findElement(TITILE).getText());
        if (web.findElements(COMMENTS).isEmpty()) {
            a.setCommentCount(0);
        } else {
            a.setCommentCount(web.findElement(COMMENTS).getText());
        }
        a.setLink(web.getText());
        Article.add(a);
        return Article;

    }



}
