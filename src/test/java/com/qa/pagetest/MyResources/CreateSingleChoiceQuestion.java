package com.qa.pagetest.MyResources;

import com.qa.page.CreateTestQuestionsPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @ Motto：No pains, no gains！
 * @ Project：anoah
 * @ Author：duzhengjun
 * @ dateTime：2020/1/11 14:16
 */
public class CreateSingleChoiceQuestion {
    CreateTestQuestionsPage yxp = new CreateTestQuestionsPage();

    @BeforeTest
    //用户登录并切换机构到“河东体育馆五四制”
    public void lanchBrowser(){
        yxp.lanchBrowser();
        yxp.login();
        yxp.switchIdentity();
    }


    @Test
    //创建单选题
    public void createSingleChoiceQuestion(){
        yxp.createSingleChoiceQuestion();


    }

}
