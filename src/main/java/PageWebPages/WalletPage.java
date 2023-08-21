package PageWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WalletPage {

    public WebDriver driver;

    public WalletPage(WebDriver driver) {this.driver = driver;}

    //  Locate the webElement{pages}

    //   user should be able to click on the dashboard button
    private By dashboard1 = By.xpath("//a[contains(@aria-current,'page')]//div");
    //    user should be able to click on the wallet btn
    private By wallet1 = By.xpath("//a[@href='/wallet']//div");
    //   user should be able to click on the crypto button
    private By cryptowallet = By.cssSelector("#crypto-wallets-id");
    //   user should be able to click on the crypto button
    private By tronWallet = By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(4) > button:nth-child(1)");
    //   user should be able to click on the crypto button
    private By trnSend= By.cssSelector("#select-crypto-send-type");
    //   user should be able to click on the crypto button
    private By patriciaUser = By.cssSelector("#internal-send-btn");
    //   user should be able to click on the crypto button
    private By internalProceed = By.cssSelector("#select-send-type-btn");
    //   user should be able to click on the crypto button
    private By inputDollar = By.xpath("//input[@id='dollar_amount']");
    //   user should be able to click on the crypto button
    private By walletaddress = By.xpath("//input[@id='send-wallet-address']");
    //   user should be able to click on the crypto button
    private By continueTrn = By.cssSelector("#initialize-send-btn");
//    //   user should be able to click on the crypto button
    private By sendTRX= By.cssSelector("#confirm-transaction-summary-btn");
//    //   user should be able to click on the crypto button
    private By pin1 = By.cssSelector("input[aria-label='first input']");
    //    user should be able to click on the pin
    private By pin2 = By.cssSelector("input[aria-label='second input']");
    //    user should be able to click on the okButton
    private By pin3 = By.cssSelector("input[aria-label='thrid input']");
    //    user should be able to click on the okButton
    private By pin4 = By.cssSelector("input[aria-label='fourth input']");
    //    user should be able to click on the okButton
    private By pin5 = By.cssSelector("input[aria-label='fifth input']");
    //        user should be able to click on the okButton
    private By pin6 = By.cssSelector("input[aria-label='sixth input']");



    //    Action the web element

    //users should be able to input email in the email field
    public void clickdashboard1() {
        driver.findElement(dashboard1).click();
    }
    // users should be able to input password in the password field
    public void clickonwallet1() {
        driver.findElement(wallet1).click();
    }
    // users should be able to input password in the password field
    public void clickCyrpto() {driver.findElement(cryptowallet).click();}
    // users should be able to click on the button
    public void clickonTron() {driver.findElement(tronWallet).click();}
    //    Click to close the dive In modal popup
    public void clickTRNSend() {driver.findElement(trnSend).click();}
    public void clickUSer() {driver.findElement(patriciaUser).click();}
    public void InterSend() {driver.findElement(internalProceed).click();}
    public void addDollar() {driver.findElement(inputDollar).sendKeys("0.5");}
    public void addWallet() {driver.findElement(walletaddress).sendKeys("tender");}
    public void continueTRX() {driver.findElement(continueTrn).click();}
    public void clickInternal() {driver.findElement(sendTRX).click();}
//    public void InterSendtrx() {driver.findElement(internalProceed).click();}
    public void insertPin1() {driver.findElement(pin1).sendKeys("1");}
    public void inserpin2() {driver.findElement(pin2).sendKeys("2");}
    public void insertpin3() {driver.findElement(pin3).sendKeys("3");}
    public void insertpin4l() {driver.findElement(pin4).sendKeys("4");}
    public void insertpin5() {driver.findElement(pin5).sendKeys("5");}
    public void insertpin6() {driver.findElement(pin6).sendKeys("6");}




}
