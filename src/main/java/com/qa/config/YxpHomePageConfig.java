package com.qa.config;

import java.util.ResourceBundle;

/**
 * @ Motto：No pains, no gains！
 * @ Project：anoah
 * @ Author：duzhengjun
 * @ dateTime：2019/10/18 3:31 下午
 */
public class YxpHomePageConfig {
    public static final ResourceBundle rb = ResourceBundle.getBundle("YxpHomePageConfig");
    public static final int DRIVERTYPE = Integer.parseInt(rb.getString("driverType"));  //浏览器类型
    public static final long SLEEP = Long.parseLong(rb.getString("sleep"));             //休眠时间
    public static final String URL =rb.getString("url");                                //输入网址
    public static final String USERNAMETEXT =rb.getString("userNameText");              //定位用户名输入框
    public static final String USERNAME =rb.getString("userName");                      //输入账号/手机号
    public static final String PASSWORDTEXT =rb.getString("passWordText");              //定位密码输入框
    public static final String PASSWORD =rb.getString("passWord");                      //输入密码
    public static final String LOGINBUTTON = rb.getString("loginButton");               //定位登录button
    public static final String HEAD = rb.getString("head");                             //定位头像/名称/身份
    public static final String SWITCH =rb.getString("switch");                          //定位点击切换
    public static final String HEDONG =rb.getString("hedong");                          //定位学校管理者-河东体育馆五四制

}
