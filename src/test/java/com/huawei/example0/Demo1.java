package com.huawei.example0;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    @Test
    public void TestUrl() throws IOException {
        //1.解析URL拿到对象
        Document doc = Jsoup.connect("https://example.com").get();
        //2.获取title标签的内容
        String title = doc.title();
        System.out.println(title);
    }
    @Test
    public void TestStr() throws IOException {
        String html = FileUtils.readFileToString(new File("E:/project/Test/test1.html"), "UTF-8");
        System.out.println(html);
        //解析字符串拿到Document
        Document doc = Jsoup.parse(html);
        //2.获取标签内容
        String title = doc.title();
        System.out.println(title);
    }
    @Test
    public void TestFile() throws IOException {
        //解析文件拿到Document
        Document doc = Jsoup.parse(new File("E:/project/Test/test1.html"), "UTF-8");
        String title= doc.title();
        System.out.println(title);
    }
}
