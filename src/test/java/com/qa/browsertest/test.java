package com.qa.browsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @ Motto：No pains, no gains！
 * @ Project：anoah
 * @ Author：duzhengjun
 * @ dateTime：2019/10/18 2:58 下午
 */
public class test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
    }
}
