package org.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BlogPage {

    public WebDriver driver;

    public BlogPage(WebDriver driver) {
        this.driver = driver;
    }

    // Invalid Scenario by clicking Subscribe without entering any valid data
    public void ClickOnSubscribe() throws InterruptedException {
        try{driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@id='_form_5_submit']")).click();}
        //driver.findElement(By.cssSelector("#_form_5_submit")).click();
        catch(Exception e){}
    }

    // Validate on an invalid Email format is not accepted (ns$kl12#.com)

    public void EnterInvalidEmailStructure(String invalidEmail) {

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(invalidEmail);
    }


    // Validate useing Valid data and assert on the Thanks message that appears

    public void EnterValidCredentials(String ValidFname, String ValidLname,String Validemail) {

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@id='firstname'] ")).sendKeys(ValidFname);
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(ValidLname);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Validemail);

    }

}
