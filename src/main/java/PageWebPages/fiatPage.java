package PageWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fiatPage {
    public WebDriver driver;

    public fiatPage(WebDriver driver) {
        this.driver = driver;
    }


    //  Locate WebPages

    //   user should be able to click on the dashboard button
    private By dashboard = By.xpath("//a[contains(@aria-current,'page')]//div");
    //    user should be able to click on the wallet btn
    private By wallet = By.xpath("//a[@href='/wallet']//div");
    //   user should be able to click on verification
    private By clickfiatbtn = By.xpath("(//div[contains(@class,'p-6')])[3]");
    //   user should be able to click on the dynamic button
    private By clickDynamic = By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");

    private By clickaccount =By.xpath("(//div[@class='h-24 flex items-center justify-between px-8'])[1]");
    //   user should be able to withdraw in primary account
//    private By clickAlat = By.cssSelector(".h-24.flex.items-center.justify-between.px-8");
    //    user should be able to input amount into the field
    private By inputFunds = By.xpath("//input[@id='amount']");
    //    user should be able to click on the continue button
    private By clickContinue = By.xpath("(//button[contains(@class,'')])[12]");
    //    user should be able to input into the field
    //    user should be able to click on the okButton
    private By clickGotthis = By.cssSelector("div[selected-account='[object Object]'] div button");
    //    user should be able to click on the pin
    private By pin1 = By.xpath("//input[@aria-label='first input']");
    //    user should be able to click on the pin
    private By pin2 = By.xpath("//input[@aria-label='second input']");
    //    user should be able to click on the okButton
    private By pin3 = By.xpath("//input[@aria-label='thrid input']");
    //    user should be able to click on the okButton
    private By pin4 = By.xpath("//input[@aria-label='fourth input']");
    //    user should be able to click on the okButton
    private By pin5 = By.xpath("//input[@aria-label='fifth input']");
    //        user should be able to click on the okButton
    private By pin6 = By.xpath("//input[@aria-label='sixth input']");


    //    Action the web element
    //users should be able to input email in the email field
    public void clickdashboard() {
        driver.findElement(dashboard).click();
    }

    //    users should be able to input password in the password field
    public void clickonwallet() {
        driver.findElement(wallet).click();
    }

    //    users should be able to input password in the password field
    public void clickFiat() {
        driver.findElement(clickfiatbtn).click();}

    //    users should be able to click on the button
    public void clickonDynamic() {
        driver.findElement(clickDynamic).click();
    }

    //    Click to close the dive In modal popup
    public void clickAccount() {
        driver.findElement(clickaccount).click();}


    //    users should be able to click on the button
    public void clickonFunds() {
        driver.findElement(inputFunds).sendKeys("100");
    }

    public void clickonContinue() {
        driver.findElement(clickContinue).click();
    }

    //  Click to close the dive In modal popup
    public void cickonGotthis() {
        driver.findElement(clickGotthis).click();
    }

    //    users should be able to click on the button
    public void clickPin1() {
        driver.findElement(pin1).sendKeys("1");
    }

    // Click to close the dive In modal popup
    public void clickonPin2() {
        driver.findElement(pin2).sendKeys("2");
    }

    // Click to close the dive In modal popup
    public void clickonpin3() {
        driver.findElement(pin3).sendKeys("3");
    }

    //    Click to close the dive In modal popup
    public void clickonPin4() {
        driver.findElement(pin4).sendKeys("4");
    }

    //  Click to close the dive In modal popup
    public void clickonPin5() {
        driver.findElement(pin5).sendKeys("5");
    }

    // Click to close the dive In modal popup
    public void clickonpin6() {
        driver.findElement(pin6).sendKeys("6");
        // Click to close the dive In modal popup
    }
}