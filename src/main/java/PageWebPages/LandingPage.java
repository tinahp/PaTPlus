package PageWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    //locate the Webpages

    //    User should be able to enter username
    private By userName = By.xpath("//input[@id='email-address']");
    //    User should be able to enter password
    private By passWord = By.xpath("//input[@id='password']");
    //    User should be able to sign In
    private By signIN = By.cssSelector("body div[id='__nuxt'] div[id='__layout'] div main div div div div form div button:nth-child(1)");
    //   User should be able to add device
    private By addDevice = By.cssSelector("#email");
    //    User should be able to click on  the continue button
    private By clickButton = By.cssSelector("#continue-process");


    //    Action the element/objects
//    User should be able to enter username in the input field
    public void enterUsername() {
        driver.findElement(userName).sendKeys("tinahp52+176@gmail.com");
    }

    //    User should be able to enter username in the input field
    public void enterPassword() {
        driver.findElement(passWord).sendKeys("Blonde@77");
    }

    //    User should be able to click Sign In
    public void clickSigIN() {
        driver.findElement(signIN).click();
    }

    //    User should be able to add device
    public void clickadddDevice() {
        driver.findElement(addDevice).sendKeys("tinahp52+175@gmail.com");
    }

    //   User should be able to click on the continue button
    public LoginPage clickonButton() {
        driver.findElement(clickButton).click();
        return new LoginPage(driver);
    }
}