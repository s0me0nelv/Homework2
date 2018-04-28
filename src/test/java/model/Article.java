package model;

import org.openqa.selenium.WebElement;

public class Article {
    private String title;
    private Integer commentCount;
    private String link;
    private WebElement element;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }


    public void setCommentCount(String commentCount){
        //otbros skobok substring

        commentCount = commentCount.substring(1, commentCount.length()-1);
        this.commentCount = Integer.valueOf(commentCount);

    }


    public String getLink() {
        return link;
    }

    public void setLink(String link) {

        this.link = link;
    }

    public WebElement getElement() {
        return element;
    }

    public void setElement(WebElement element) {
        this.element = element;
    }
}

