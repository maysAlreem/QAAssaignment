package Handlers;

import Browser.BrowserClass;
import PropratiesFileAPI.Proparites;
import com.google.common.base.Verify;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.Properties;

public class BooksStore {
    public static Properties p;

    static {
        try {
            p = Proparites.defineAndReadProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @When("^Click on (.*)$")
    public void goToNeededPage(String Handler) {

        if (Handler.equalsIgnoreCase("Home")) {
            BrowserClass.getChromeBrowser().findElement(By.xpath(p.getProperty("HomePage"))).click();
        }else
        if(Handler.equalsIgnoreCase("Authers")){
                BrowserClass.getChromeBrowser().findElement(By.xpath(p.getProperty("AuthersPage"))).click();
        }else
        if(Handler.equalsIgnoreCase("Books"))
        {
            BrowserClass.getChromeBrowser().findElement(By.xpath(p.getProperty("BooksPage"))).click();
        }else
        if (Handler.equalsIgnoreCase("Search"))
        {
            BrowserClass.getChromeBrowser().findElement(By.xpath(p.getProperty("SearchButton"))).click();
        }else
        if(Handler.equalsIgnoreCase("Create Book")){
                BrowserClass.getChromeBrowser().findElement(By.xpath(p.getProperty("CreateBook"))).click();
        }else
         if(Handler.equalsIgnoreCase("Clear"))
         {BrowserClass.getChromeBrowser().findElement(By.xpath(p.getProperty("ClearButton"))).click();
         }else
         if (Handler.equalsIgnoreCase("Save"))
        {
            BrowserClass.getChromeBrowser().findElement(By.xpath(p.getProperty("SaveButton"))).click();
         }
    }

    @Then("Check if is opened successfully")
    public static void check_if_is_opened_successfully() {
        Assert.assertFalse(BrowserClass.getChromeBrowser().findElement(By.xpath(p.getProperty("TextMsg"))).getText().toString().contains("404") ,BrowserClass.getChromeBrowser().findElement(By.xpath(p.getProperty("TextMsg"))).getText());
    }
    @When("^fill the (.*) field with (.*)$")
    public static void fillTheField(String fieldName , String FieldValue){
        BrowserClass.getChromeBrowser().findElement(By.xpath(p.getProperty(fieldName))).sendKeys(FieldValue);
    }
    @Then ("Verify validation msg")
    public static void VerifyValidationMsg(){
        SoftAssert sa =new SoftAssert();
            String Actual  =BrowserClass.getChromeBrowser().findElement(By.xpath(p.getProperty("ValidationMsg"))).getText();
           sa.assertEquals(Actual, "Title should have at least 8 characters");
            sa.assertAll();
            System.out.println("Expected value was: " + "Title should have at least 8 characters"+ " and the actual text was:  "+Actual) ;


    }
    @Then ("Check saved Successfully")
    public static void CheckSavedSuccessfully(){
        Assert.assertFalse(BrowserClass.getChromeBrowser().findElement(By.xpath(p.getProperty("TextMsg"))).getText().toString().contains("500") ,BrowserClass.getChromeBrowser().findElement(By.xpath(p.getProperty("TextMsg"))).getText());
    }
}
