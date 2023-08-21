package PageWebPages;

import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SignUP {

    public WebDriver driver;

    public SignUP(WebDriver driver) {this.driver = driver;}


//  Locate the webElement{pages}

//   user should be able to click on the landingPage to create account
    private By createAccount = By.xpath("(//button[contains(@class,'')])[1]");
    //    Switch to the dialogue Box
    private By cancelDialogue =By.xpath("//button[@id='onesignal-slidedown-cancel-button']");
//    user should be able  to click on usernamefield
    private By createEmail = By.xpath("//input[@id='email-address']");
//    user should be able  to click on passowrdField
    private By createpassword = By.xpath("//input[@id='password']");
//    user should be able  to click on selectCountry
    private By selectCountry = By.cssSelector("#pat_dropdown-44");
//    user should be able  to click on selectCountry
    private By drpCountry = By.xpath("//li[contains(@aria-label,'Algeria')]");
//    user should be able to create account
    private By Account  =By.xpath("(//button[contains(@class,'suffixed')])[1]");



//    Action the web element
//    users should be able to click on create account button
     public void clickAccountCreate() {
        driver.findElement(createAccount).click();
    }
//   users should be able to click on the cancelDialogue
     public void cancelDialoge() {driver.findElement(cancelDialogue).click();}
//   Users should be able to create Email
     public void ClickCreateEMAIl(){driver.findElement(createEmail).sendKeys("tinahp52+200@gmail.com");}
//     public void cancelDialoge() {driver.switchTo().alert().dismiss();}
//        Alert alert = driver.switchTo().alert(); // switch to alert
//        String alertmessage = alert.getText();
//        System.out.println(alertmessage);
//        alert.dismiss();}
//   Users should be able to create Password
     public void ClickCreatePassword(){driver.findElement(createpassword).sendKeys("Blonde@77");}
//    Users should be able to click Country
     public void clickCountry(){driver.findElement(selectCountry).click();}
//    users should be able to select from the drop downlist
     public void clickonDynamic() throws InterruptedException {
             List<WebElement> itemcountry = driver.findElements(By.xpath("//li[contains(@aria-label,'Algeria')]"));
             for (WebElement item : itemcountry) {
                 // Do something with each item
                 item.click(); // Click the item
                 item.getText(); // Get the text of the item
             }
         }
     public void clickAccout(){driver.findElement(Account).click();
    }








}