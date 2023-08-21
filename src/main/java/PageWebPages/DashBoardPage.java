package PageWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class DashBoardPage {

    public WebDriver driver;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }


   //    locate the elements on Dashboard
//    user should be able to click on the dashboard button
      private By dashboard = By.xpath("//a[contains(@aria-current,'page')]//div");
//     user should be able to click on the wallet btn
       private By wallet = By.xpath("//a[@href='/wallet']//div");
//    // user should be able to click on Fiat Wallets
      private By FiatWallets = By.xpath("//button[@id='fiat-wallets-id']");
    // user should be able to click on Fiat Wallets displaying the naira
      private By FiatWallet1 = By.xpath("//div[@id='wallet-panel']");
      //user should be able to click on the wallet button
//      private By walletButton = By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
      //user should be able to click on the dynamic  button
      private By dynamicButton =By.xpath("(//div)[132]");
//     user should be able to select bank
      private By selectBank =By.cssSelector(".h-24.flex.items-center.justify-between.px-8");
//     user should be able to proceed with inputting amount in the text field
      private By inputAmount = By.cssSelector("#amount");
//    user should be able to click on the continue button
       private By clickonContinue = By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1) > button:nth-child(1)");
//       User should be able to click on the okay button
       private By confirmOkButton =By.xpath("(//button)[12]");

//
//
//   Action the above Object
    public void clickDashboard(){ driver.findElement(dashboard).click();}
    public void clickwallet(){driver.findElement(wallet).click();}
    public void clickfiatWallet(){driver.findElement(FiatWallets).click();}
    public void clickfiatWallet1(){driver.findElement(FiatWallet1).click();}
    public void clickdynamicBTN(){driver.findElement(dynamicButton).click();}
    public void selectBank1(){driver.findElement(selectBank).click();}
    public void clickInputAmount(){driver.findElement(inputAmount).sendKeys("100");}
    public void click(){driver.findElement(clickonContinue).click();}
    public void clickOk(){driver.findElement(confirmOkButton).click();}

//    }


}

