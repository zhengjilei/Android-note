package com.example.ethanwalker.recyclerfrag;

/**
 * Created by EthanWalker on 2017/5/19.
 */

public class News {
    private String title;


    private String content;
    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
