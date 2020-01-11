package com.qa.page;

import com.qa.config.CreateTestQuestionsPageConfig;
import com.qa.config.YxpHomePageConfig;
import com.qa.operation.Page;

/**
 * @ Motto：No pains, no gains！
 * @ Project：anoah
 * @ Author：duzhengjun
 * @ dateTime：2020/1/11 14:00
 */
public class CreateTestQuestionsPage{
    Page page = new Page(CreateTestQuestionsPageConfig.DRIVERTYPE);

    //启动浏览器并输入网址
    public void lanchBrowser(){
        //输入优学派智慧教育首页地址
        page.geturl(CreateTestQuestionsPageConfig.URL);

        //休眠
        page.pause(300);

        //窗口最大化
        page.windowmax();
    }

    //登录用户账户
    public void login(){
        //输入账号/手机号
        page.sendKey(CreateTestQuestionsPageConfig.USERNAMETEXT,CreateTestQuestionsPageConfig.USERNAME);

        //输入密码
        page.sendKey(CreateTestQuestionsPageConfig.PASSWORDTEXT,CreateTestQuestionsPageConfig.PASSWORD);

        //点击登录
        page.click(CreateTestQuestionsPageConfig.LOGINBUTTON);

        //休眠
        page.pause(CreateTestQuestionsPageConfig.SLEEP);
    }

    //切换身份
    public void switchIdentity(){
        //点击头像/名称/身份以准备切换身份
        page.click(CreateTestQuestionsPageConfig.HEAD);

        //休眠
        page.pause(CreateTestQuestionsPageConfig.SLEEP);

        //点击切换
        page.click(CreateTestQuestionsPageConfig.SWITCH);
        page.pause(CreateTestQuestionsPageConfig.SLEEP);

        //点击河东体育馆
        page.click(CreateTestQuestionsPageConfig.HEDONG);
        page.pause(CreateTestQuestionsPageConfig.SLEEP);

    }

    //创建单选题
    public void createSingleChoiceQuestion(){
        //点击进入我的资源
        page.click(CreateTestQuestionsPageConfig.MYRESOURCES);

        //这里休眠时间稍长一点
        page.pause(3000);

        //点击左侧我的试题
        page.click(CreateTestQuestionsPageConfig.MYTESTQUESTION);
        System.out.println("这里打印一次点击试题的操作");

        //再点击一次左侧我的试题
        page.click(CreateTestQuestionsPageConfig.MYTESTQUESTION);
        System.out.println("这里打印一次收起试题的操作");

        //点击切换创建试题的学校



    }

}
