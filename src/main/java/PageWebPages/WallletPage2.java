package PageWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WallletPage2 {

    public WebDriver driver;

    public WallletPage2(WebDriver driver) {this.driver = driver;}

    //  Locate the webElement{pages}

    //   user should be able to click on the dashboard button
    private By dashboard2 = By.xpath("//a[contains(@aria-current,'page')]//div");
    //    user should be able to click on the wallet btn
    private By wallet2 = By.xpath("//a[@href='/wallet']//div");
    //   user should be able to click on the crypto button
    private By cryptowallet1 = By.cssSelector("#crypto-wallets-id");
    //   user should be able to click on the crypto button
    private By rippleWallet = By.xpath("(//button[contains(@class,'flex')])[7]");
    //   user should be able to click on the crypto button
    private By rippleSendbutton= By.cssSelector("#select-crypto-send-type");
    //   user should be able to click on the crypto button
    private By externalUser = By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(3) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(2) > div:nth-child(1)");
    //   user should be able to click on the crypto button
    private By ExternalProceed = By.cssSelector("#select-send-type-btn");
    //   user should be able to click on the crypto button
    private By inputDollar1 = By.xpath("//input[@id='dollar_amount']");
    //   user should be able to click on the crypto button
    private By Memoaddress = By.cssSelector("div[class='mb-4'] div[class='base-input']");
    //   user should be able to click on the crypto button
    private By Memoaddress1 = By.xpath("//input[@id='send-memo']");
    //   user should be able to click on the crypto button
    private By Externaladdress = By.xpath("//input[@id='send-wallet-address']");
    //   user should be able to click on the crypto button
    private By continueRipple1 = By.cssSelector("#initialize-send-btn");
    //  user should be able to click on the crypto button
    private By priorityfee = By.xpath("(//button[contains(@class,'flex')])[9]");
    //  User should be abl e to send transaction successfully
    private By sendRipple= By.cssSelector("#confirm-transaction-summary-btn");
    //  User should be able to click on the crypto button
    private By pin2 = By.cssSelector("input[aria-label='first input']");
    //    user should be able to click on the pin
    private By pin3 = By.cssSelector("input[aria-label='second input']");
    //    user should be able to click on the okButton
    private By pin4 = By.cssSelector("input[aria-label='thrid input']");
    //    user should be able to click on the okButton
    private By pin5 = By.cssSelector("input[aria-label='fourth input']");
    //    user should be able to click on the okButton
    private By pin6 = By.cssSelector("input[aria-label='fifth input']");
    //        user should be able to click on the okButton
    private By pin7 = By.cssSelector("input[aria-label='sixth input']");



    //    Action the web element [classes]
    //users should be able to input email in the email field
    public void clickboard() {
        driver.findElement(dashboard2).click();
    }
    // users should be able to input password in the password field
    public void clickwallet1() {
        driver.findElement(wallet2).click();
    }
    // users should be able to input password in the password field
    public void clickCyrptowallet() {driver.findElement(cryptowallet1).click();}
    // users should be able to click on the button
    public void clickonripple() {driver.findElement(rippleWallet).click();}
    //    Click to close the dive In modal popup
    public void clickTRNSend1() {driver.findElement(rippleSendbutton).click();}
    public void clickEternalUSer() {driver.findElement(externalUser).click();}
    public void enterrnalSend() {driver.findElement(ExternalProceed).click();}
    public void addDollar() {driver.findElement(inputDollar1).sendKeys("0.5");}
    public void enterMEMO() {driver.findElement(Memoaddress).click();}
    public void enterMEMO1(){driver.findElement(Memoaddress1).sendKeys("1220474802");}
    public void addExternalWallet() {driver.findElement(Externaladdress).sendKeys("rLHzPsX6oXkzU2qL12kHCH8G8cnZv1rBJh");}
    public void continueRipple() {driver.findElement(continueRipple1).click();}
    public void enterPriority() {driver.findElement(priorityfee).click();}
    public void clickSendRipple() {driver.findElement(sendRipple).click();}
    //    public void InterSendtrx() {driver.findElement(internalProceed).click();}
    public void insertPin7() {driver.findElement(pin2).sendKeys("1");}
    public void inserpin8() {driver.findElement(pin3).sendKeys("2");}
    public void insertpin9() {driver.findElement(pin4).sendKeys("3");}
    public void insertpin9l() {driver.findElement(pin5).sendKeys("4");}
    public void insertpin9d() {driver.findElement(pin6).sendKeys("5");}
    public void insertpin9c() {driver.findElement(pin7).sendKeys("6");}




}

