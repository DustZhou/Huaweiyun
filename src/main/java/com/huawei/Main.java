package com.huawei;

import com.huawei.entity.Article;
import com.huawei.entity.Picture;
import com.huawei.util.BlogUtil;
import com.huawei.util.Constants;
import com.huawei.util.StringUtils;

import java.util.List;

import static com.huawei.util.Constants.*;

public class Main {
    public static void main(String[] args){
        int articleCount = BlogUtil.getArticleCount(BLOG_HOME);
        System.out.println(BlogUtil.getArticlePageCount(articleCount));
        List<Article> articleList = BlogUtil.getAeticleList(1,2,BLOG_HOME, StringUtils.subId(BLOG_HOME));
        for (Article article:articleList){
            System.out.println(article);
        List<Picture> pictures = BlogUtil.getArticlePictures(article.getUrl());
        for (Picture picture:pictures){
            System.out.println(picture);
        }
        }
    }
}
