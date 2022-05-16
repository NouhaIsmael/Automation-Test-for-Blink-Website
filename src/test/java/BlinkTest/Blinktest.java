package BlinkTest;

import org.BaseBlink.BaseBlink;

import org.Pages.BlogPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Blinktest extends BaseBlink {

      // clicking on Subscribe without entering any fields
       @Test (priority=1)
        public void ClickonSubs () throws InterruptedException {
        Bhomepage.ClinkOnBlogIcon();
        blogPage.ClickOnSubscribe();
        Assert.assertEquals("This field is required.", "This field is required.");
            System.out.println ("You should fill those fields");
    }

    // Entering an Invalid email address
        @Test (priority=2)
        public void InvalidEmailAddress()throws InterruptedException{
        Bhomepage.ClinkOnBlogIcon();
        blogPage.EnterInvalidEmailStructure("ns$kl12#.com");
        blogPage.ClickOnSubscribe();
        Assert.assertEquals ( "Enter a valid email address.",
                "Enter a valid email address.");
        System.out.println("Enter a valid email address.");

    }

    // Entering Valid Credentials
        @Test (priority=3)
     public void TestValidFields()throws InterruptedException{

        Bhomepage.ClinkOnBlogIcon();
        blogPage.EnterValidCredentials("Nouha","Ismael"
            ,"nouha_ismael@outlook.com");
        blogPage.ClickOnSubscribe();
        Assert.assertEquals("Thanks for signing up! Check your inbox for your Welcome package!",
                "Thanks for signing up! Check your inbox for your Welcome package!");

    System.out.println("Thanks for signing up! Check your inbox for your Welcome package!");
    }}


