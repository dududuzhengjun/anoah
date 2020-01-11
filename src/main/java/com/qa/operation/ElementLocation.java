package com.qa.operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @ Motto：No pains, no gains！
 * @ Project：anoah
 * @ Author：duzhengjun
 * @ dateTime：2019/10/18 2:20 下午
 */
public class ElementLocation extends BrowserOperation{
    public ElementLocation(){
        super();
    }

    public ElementLocation(int driverType){
        super(driverType);
    }

    //by xpath
    public WebElement xPath(String Element){
        WebElement element=driver.findElement(By.xpath(Element));
        if(element==null){
            System.out.println("为空");
        }
        return element;
    }

    //by id
    public WebElement id(String Element){
        return driver.findElement(By.id(Element));
    }

    //by classname
    public WebElement className (String Element){
        return driver.findElement(By.className(Element));
    }

    //by cssSelector
    public WebElement cssSelector (String Element){
        return driver.findElement(By.cssSelector(Element));
    }

    //by name
    public WebElement name (String Element){
        return driver.findElement(By.name(Element));
    }

    //by linkText
    public WebElement linkText (String Element){
        return driver.findElement(By.linkText(Element));
    }

    //by tagName
    public WebElement tagName (String Element){
        return driver.findElement(By.tagName(Element));
    }

    //by partialLinkText
    public WebElement partialLinkText (String Element){
        return driver.findElement(By.partialLinkText(Element));
    }
}
