package com.huawei.entity;

public class Article {
    private Integer id;
    private String bId;
    private String url;
    private String createTime;
    private String title;

    public Article() {
    }

    public Article(Integer id, String bId, String url, String createTime, String title) {
        this.id = id;
        this.bId = bId;
        this.url = url;
        this.createTime = createTime;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", bId='" + bId + '\'' +
                ", url='" + url + '\'' +
                ", createTime='" + createTime + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
