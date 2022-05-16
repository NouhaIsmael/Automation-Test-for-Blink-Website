package org.BaseBlink;


import org.Pages.BlinkHomepage;
import org.Pages.BlogPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


/**
 * Unit test for simple App.
 */
public class BaseBlink
{
    public WebDriver driver;
    protected BlinkHomepage Bhomepage;
    protected BlogPage blogPage;

@BeforeClass
    public void SetUp(){
         System.setProperty("webdriver.chrome.driver","resources/chromedriver");
         driver = new ChromeDriver();
         driver.get("https://blink22.com/");
         //driver.manage().window().maximize();
         Bhomepage = new BlinkHomepage(driver);
         blogPage = new BlogPage(driver);

    }

   /* public void QUIT(){
    driver.quit();
    }*/
}
