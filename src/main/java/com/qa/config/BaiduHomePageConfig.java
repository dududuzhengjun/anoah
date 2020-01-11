package com.qa.config;

import java.util.ResourceBundle;

/**
 * @ Motto：No pains, no gains！
 * @ Project：anoah
 * @ Author：duzhengjun
 * @ dateTime：2019/10/18 2:40 下午
 */
public class BaiduHomePageConfig {
    public static final ResourceBundle rb = ResourceBundle.getBundle("BaiduHomePageConfig");
    public static final int DRIVERTYPE = Integer.parseInt(rb.getString("driverType"));  //浏览器类型
    public static final long SLEEP = Long.parseLong(rb.getString("sleep"));             //休眠时间
    public static final String URL =rb.getString("url");                                //输入网址

}
