package PageWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //  Locate WebPages
//  user should be able to log in successfully
    private By email = By.xpath("//input[@id='email-address']");
    //  user should be able to input password
    private By password = By.xpath("//input[@id='password']");
    //  user should be able to click on login submit button
    private By submit = By.xpath("//span[normalize-space()='Sign in']");
    //   Click to close the dive In modal
    private By diveIn = By.cssSelector("button[id='dive-in'] span");


    //   user should be able to click on the dashboard button
    private By dashboard = By.xpath("//a[contains(@aria-current,'page')]//div");
    //   user should be able to click on upgrade account
    private By upgradeAccount = By.cssSelector("div[id='container'] div div div div div div div div div div div div div button");
    //   user should be able to click on verification
    private By verificationbtn = By.xpath("//a[contains(@href,'/settings/verification')]");
    //   user should be able to click on the identity button
    private By verifybtn = By.xpath("//button[@id='verify-id-btn']");
    //   user should be able to click on the identity button
    private By okFailedVerification = By.xpath("//div[@document-types='[object Object],[object Object],[object Object],[object Object],[object Object]']//div//button");
    //   user should be able to select from the list of docTYPE
    private By listOFDoctype = By.xpath("(//*[name()='path'])[43]");
    //   user should be able to click on the upload button
    private By uploadSubmit = By.xpath("//div[contains(@failure-message,'Your kyc verification has been declined.')]//div//button");
    //    user should be able to upload front camera
    private By uploadFrNT = By.xpath("//input[@name='document-front-uploader']");
    //   user should be able to upload rear camera
    private By uploadBACK = By.xpath("//input[@name='document-back-uploader']");
    //  user should be able to click on the Ok button
    private By clickOk = By.xpath("(//button)[9]");
    //  user should be able to upload fronTId
    private By uploadFrntID = By.xpath("//input[@name='selfie-uploader']");
//    user should be able to click on re-upload link
//    private By reupload =By.xpath("//button[normalize-space()='Re-upload photo']");
//    user should be able to click the Ok bTN
    private By frntIDbtn = By.cssSelector("body div[id='__nuxt'] div[id='__layout'] div div main div div div div div div div div ul li div div section div[id='identity-modal'] div div div div[document-types='[object Object],[object Object],[object Object],[object Object],[object Object]'] div button:nth-child(1)");





    //      Action the element/objects
//    users should be able to input email in the email field
    public void clickLogin() {
        driver.findElement(email).sendKeys("tinahp52+176@gmail.com");
    }

    //    users should be able to input password in the password field
    public void cickPassword() {
        driver.findElement(password).sendKeys("Blonde@77");
    }

    //    users should be able to click on the button
    public void clickSubmit() {
        driver.findElement(submit).click();
    }

    //    Click to close the dive In modal popup
    public void closeDiveIn() {
        driver.findElement(diveIn).click();
    }


    //    Action the above Object
    public void clickDashboard() {
        driver.findElement(dashboard).click();
    }

    public void clickupgradeAccount() {
        driver.findElement(upgradeAccount).click();
    }

    public void clickVerification() {
        driver.findElement(verificationbtn).click();
    }

    public void clickVerifybtn() {
        driver.findElement(verifybtn).click();
    }

    public void clickFailedBverification() {
        driver.findElement(okFailedVerification).click();
    }

    public void selectDoctype() {
        driver.findElement(listOFDoctype).click();
    }

    public void clickUploadSubmit() {
        driver.findElement(uploadSubmit).click();
    }

    public void clickUpload() {
        WebElement uploadfrnt = driver.findElement(By.cssSelector("input[name='document-front-uploader']"));
        uploadfrnt.sendKeys("C:\\Users\\Tizspec\\Downloads\\beautiful-flowers-g83c1ae228_1920.jpg");
        WebElement uploadBCK = driver.findElement(By.xpath("//input[@name='document-back-uploader']"));
        uploadBCK.sendKeys("C:\\Users\\Tizspec\\Downloads\\beautiful-flowers-g83c1ae228_1920.jpg");
    }

    public void clickokBTN() {
        driver.findElement(clickOk).click();
        WebElement uploadFRNTID = driver.findElement(By.xpath("//input[@name='selfie-uploader']"));
        uploadFRNTID.sendKeys("C:\\Users\\Tizspec\\Downloads\\Frontid.jpg");
        driver.findElement(frntIDbtn).click();

    }



    }






