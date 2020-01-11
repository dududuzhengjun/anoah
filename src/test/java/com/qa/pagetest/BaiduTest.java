package com.qa.pagetest;

import com.qa.page.BaiduHomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @ Motto：No pains, no gains！
 * @ Project：anoah
 * @ Author：duzhengjun
 * @ dateTime：2019/10/18 2:19 下午
 */
public class BaiduTest {
    BaiduHomePage baiduhomepage = new BaiduHomePage();

    @Test
    public void lanchBrowser(){
        baiduhomepage.lanchBrowser();
    }
}
