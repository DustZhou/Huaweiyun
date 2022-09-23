package com.huawei.util;

public class StringUtils {
    public static String subId(String url){
        if (url !=null&&url.trim().length()!=0){
            int index =url.lastIndexOf("/");
            String id = url.substring(index+1);
            return id;
        }else {
            return "";
        }
    }
}
