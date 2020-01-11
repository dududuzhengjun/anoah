package com.qa.config;

import java.util.ResourceBundle;

/**
 * @ Motto：No pains, no gains！
 * @ Project：anoah
 * @ Author：duzhengjun
 * @ dateTime：2020/1/11 14:02
 */
public class CreateTestQuestionsPageConfig {
    public static final ResourceBundle rb = ResourceBundle.getBundle("CreateTestQuestionsPageConfig");
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
    public static final String HEDONG =rb.getString("heDong");                          //定位学校管理者-河东体育馆五四制
    public static final String MYRESOURCES =rb.getString("myResources");                //定位我的资源入口
    public static final String MYTESTQUESTION = rb.getString("myTestQuestion");         //定位左侧我的试题


}
