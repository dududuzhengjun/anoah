package com.qa.page;

import com.qa.config.BaiduHomePageConfig;
import com.qa.operation.Page;
import org.apache.log4j.Logger;

/**
 * @ Motto：No pains, no gains！
 * @ Project：anoah
 * @ Author：duzhengjun
 * @ dateTime：2019/10/18 2:37 下午
 */
public class BaiduHomePage {
    Logger logger = Logger.getLogger(BaiduHomePage.class);
    Page page = new Page(BaiduHomePageConfig.DRIVERTYPE);

    public void lanchBrowser(){
        //输入百度首页地址
        page.geturl(BaiduHomePageConfig.URL);

        //休眠
        page.pause(300);

        //窗口最大化
        page.windowmax();
    }

}
