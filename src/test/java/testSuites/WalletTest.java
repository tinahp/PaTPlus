package testSuites;

import PageWebPages.*;
import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

    public class WalletTest extends BaseClass {

        @BeforeTest
        public void innit() {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @AfterTest
        public void Quit() {
        }

//        @Test(priority = 1)
//        public void LoGIN2() throws InterruptedException {
//            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//            LoginPage logIn = new LoginPage(driver);
//            logIn.clickLogin();
//            logIn.cickPassword();
//            logIn.clickSubmit();
//            logIn.closeDiveIn();
//        }

//        @Test(priority = 2)
//        public void walletPage() throws InterruptedException {
//            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//            WalletPage walletPage = new WalletPage(driver);
//            walletPage.clickdashboard1();
//            walletPage.clickonwallet1();
//            walletPage.clickCyrpto();
//            walletPage.clickonTron();
//            walletPage.clickTRNSend();
//            walletPage.clickUSer();
//            walletPage.InterSend();
//            Thread.sleep(1000);
//            walletPage.addDollar();
//            Thread.sleep(1000);
//            walletPage.addWallet();
//            walletPage.continueTRX();
////              User should be able to click on the transaction Send
//            walletPage.clickInternal();
////                walletPage.InterSendtrx();
//            walletPage.insertPin1();
//            walletPage.inserpin2();
//            walletPage.insertpin3();
//            walletPage.insertpin4l();
//            walletPage.insertpin5();
//            walletPage.insertpin6();
//       }


//        @Test(priority = 3)
//        public void walletPage2() throws InterruptedException {
//            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//            WallletPage2 walletPage = new WallletPage2(driver);
//            walletPage.clickboard();
//            walletPage.clickwallet1();
//            walletPage.clickCyrptowallet();
//            walletPage.clickonripple();
//            walletPage.clickonripple();
//            walletPage.clickTRNSend1();
//            walletPage.clickEternalUSer();
//            walletPage.enterrnalSend();
//            Thread.sleep(1000);
//            walletPage.addDollar();
//            walletPage.enterMEMO();
//            Thread.sleep(4000);
//            walletPage.enterMEMO1();
//            Thread.sleep(1000);
//            walletPage.addExternalWallet();
//            walletPage.continueRipple();
//            walletPage.enterPriority();
//            walletPage.clickSendRipple();
////              User should be able to click on the transaction Send
////                walletPage.InterSendtrx();
//            walletPage.insertPin7();
//            walletPage.inserpin8();
//            walletPage.insertpin9();
//            walletPage.insertpin9l();
//            walletPage.insertpin9d();
//            walletPage.insertpin9c();


//        }

        @Test(priority = 4)
        public void signUp1() throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            SignUP signPage = new SignUP(driver);
            signPage.clickAccountCreate();
            Thread.sleep(1000);
            signPage.cancelDialoge();
            Thread.sleep(1000);
            signPage.ClickCreateEMAIl();
            signPage.ClickCreatePassword();
            signPage.clickCountry();
            signPage.clickonDynamic();


        }

    }