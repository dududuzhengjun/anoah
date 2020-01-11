package com.qa.pagetest.ApplicationManagement;

import com.qa.page.YypHomePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @ Motto：No pains, no gains！
 * @ Project：anoah
 * @ Author：duzhengjun
 * @ dateTime：2019/10/18 3:38 下午
 */
public class AddApplication {
    YypHomePage yxp =new YypHomePage();

    @BeforeTest
    //用户登录
    public void lanchBrowser(){
        yxp.lanchBrowser();
        yxp.login();
    }


    @Test
    //切换身份
    public void switchIdentity(){
        yxp.switchIdentity();
    }

    //应用管理新增PC客户端应用
    public void addPCClient(){

    }

}
