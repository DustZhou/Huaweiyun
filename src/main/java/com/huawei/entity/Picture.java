package com.huawei.entity;

public class Picture {
    private Integer id;
    private Integer aId;
    private String url;

    public Picture() {
    }

    public Picture(Integer id, Integer aId, String url) {
        this.id = id;
        this.aId = aId;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", aId=" + aId +
                ", url='" + url + '\'' +
                '}';
    }
}
