package com.huawei.entity;
//博主
public class Blogger {
    private String id;
    private Integer articleCount;
    private Integer pageCount;

    public Blogger() {
    }

    public Blogger(String id, Integer articleCount, Integer pageCount) {
        this.id = id;
        this.articleCount = articleCount;
        this.pageCount = pageCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(Integer articleCount) {
        this.articleCount = articleCount;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Blogger{" +
                "id='" + id + '\'' +
                ", articleCount=" + articleCount +
                ", pageCount=" + pageCount +
                '}';
    }
}
