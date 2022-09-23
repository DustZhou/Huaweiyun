package com.huawei.util;

import com.huawei.entity.Article;
import com.huawei.entity.Picture;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BlogUtil {
    public static int getArticleCount(String blogHome){
        Document doc = null;
        try {
            doc = Jsoup.connect(blogHome).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Element countElement = doc.select("li>a>div.user-profile-statistics-num").first();
        String s = countElement.text();
        String articleCount = s.replace(",","");
        System.out.println(articleCount);
        return Integer.parseInt(articleCount);
    }
    public static int getArticlePageCount(int articleCount){
        int pageCount = (int)Math.ceil(articleCount/Constants.PAGE_SIZE);
        return pageCount;
    }
    public static List<Article> getAeticleList(int pageBegin,int pageEnd,String blogHome,String bId){
        ArrayList<Article> articles = new ArrayList<>((pageEnd-pageBegin+1)*((int)Constants.PAGE_SIZE));
        String articleListUrl = null;
        for(int i=0;i<pageEnd;i++){
            articleListUrl = blogHome + Constants.ARTICLE_LIST_URL;

            Document doc = null;
            try {
                doc = Jsoup.connect(articleListUrl).get();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Element articleList = doc.select("div.mainContent").first();
            Elements articleElements = articleList.select("article.blog-list-box");
            for(Element element:articleElements){
                String url = element.select("article>a").first().attr("href");
                String title = element.select("div.blog-list-box-top").first().text();
                String createTime = element.select("div.blog-list-footer-left").first().text();

                Article article = new Article();
                article.setUrl(url);
                article.setTitle(title);
                article.setCreateTime(createTime);
                article.setbId(bId);
                articles.add(article);
            }
        }
        return articles;
    }
    public static List<Picture> getArticlePictures(String articleUrl){
        ArrayList<Picture> pictures = new ArrayList<>();
        Document doc = null;
        try {
            doc = Jsoup.connect(articleUrl).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Element article = doc.select("div.htmledit_views").first();
        Elements images = article.select("img");
        for (Element image:images){
            String picUrl = image.attr("src");
            Picture picture = new Picture();
            picture.setUrl(picUrl);
            pictures.add(picture);
        }
        return pictures;

    }
}
