package org.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BlinkHomepage {

    public WebDriver driver;

    public BlinkHomepage (WebDriver driver){
        this.driver = driver;
    }

    public void ClinkOnBlogIcon () throws InterruptedException {
        try{driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[normalize-space()='BLOG']")).click();}
        catch (Exception e){}
    }

}
