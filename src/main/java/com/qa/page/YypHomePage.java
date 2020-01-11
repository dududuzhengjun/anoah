package com.qa.page;

import com.qa.config.BaiduHomePageConfig;
import com.qa.config.YxpHomePageConfig;
import com.qa.operation.Page;
import org.apache.log4j.Logger;

/**
 * @ Motto：No pains, no gains！
 * @ Project：anoah
 * @ Author：duzhengjun
 * @ dateTime：2019/10/18 3:30 下午
 */
public class YypHomePage {
    Logger logger = Logger.getLogger(BaiduHomePage.class);
    Page page = new Page(YxpHomePageConfig.DRIVERTYPE);

    //启动浏览器并输入网址
    public void lanchBrowser(){
        //输入优学派智慧教育首页地址
        page.geturl(YxpHomePageConfig.URL);

        //休眠
        page.pause(300);

        //窗口最大化
        page.windowmax();
    }

    //登录用户账户
    public void login(){
        //输入账号/手机号
        page.sendKey(YxpHomePageConfig.USERNAMETEXT,YxpHomePageConfig.USERNAME);

        //输入密码
        page.sendKey(YxpHomePageConfig.PASSWORDTEXT,YxpHomePageConfig.PASSWORD);

        //点击登录
        page.click(YxpHomePageConfig.LOGINBUTTON);

        //休眠
        page.pause(YxpHomePageConfig.SLEEP);
    }

    //切换身份
    public void switchIdentity(){
        //点击头像/名称/身份以准备切换身份
        page.click(YxpHomePageConfig.HEAD);

        //休眠
        page.pause(YxpHomePageConfig.SLEEP);

        //点击切换
        page.click(YxpHomePageConfig.SWITCH);
        page.pause(YxpHomePageConfig.SLEEP);

        //点击河东体育馆
        page.click(YxpHomePageConfig.HEDONG);

    }



}
