package testSuites;

import PageWebPages.DashBoardPage;
import PageWebPages.LandingPage;
import PageWebPages.LoginPage;
import PageWebPages.fiatPage;
import baseClass.BaseClass;
import jdk.swing.interop.SwingInterOpUtils;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PlusTest extends BaseClass {

    @BeforeTest
    public void innit() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void Quit() {
    }
//
//    @Test(priority = 0)
//    public void LOGIN() throws InterruptedException{
//    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    LandingPage landingPage =new LandingPage(driver);
//    landingPage.enterUsername();
//    landingPage.enterPassword();
//    landingPage.clickSigIN();
//    landingPage.clickadddDevice();
//    landingPage.clickonButton();
//
//    // Verify that search results are displayed
//        String expectedTitle = "https://patricia-web-v2.gke.staging.patriciadev.com/add-device";
//        String actualTitle = driver.getCurrentUrl();
//        Assert.assertEquals(actualTitle, expectedTitle);
//        System.out.println("https://patricia-web-v2.gke.staging.patriciadev.com/add-device");
//        System.out.println("An OTP code has been sent to your email address.");

    //    }
//    @Test(priority = 1)
//    public void LoGIN1() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        LoginPage logIn = new LoginPage(driver);
//        logIn.clickLogin();
//        logIn.cickPassword();
//        logIn.clickSubmit();
//        logIn.closeDiveIn();
//        logIn.clickDashboard();
//        logIn.clickupgradeAccount();
//        logIn.clickVerification();
//        logIn.clickVerifybtn();
//        Thread.sleep(500);
//        logIn.clickFailedBverification();
//        logIn.selectDoctype();
//        logIn.clickUploadSubmit();
//        logIn.clickUpload();
//        logIn.clickokBTN();
    }

    //     System.out.println("An OTP code has been sent to your email address.");


//    @Test(priority = 2)
//    public void Dashboard() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        DashBoardPage dashBoardPage = new DashBoardPage(driver);
//        dashBoardPage.clickDashboard();
//        dashBoardPage.clickwallet();
//        dashBoardPage.clickfiatWallet();
//        dashBoardPage.clickfiatWallet1();
//        Thread.sleep(2000);
//        dashBoardPage.clickdynamicBTN();
//        Thread.sleep(2000);
//        dashBoardPage.selectBank1();
//        Thread.sleep(2000);
//        dashBoardPage.clickInputAmount();
//        dashBoardPage.click();
//        dashBoardPage.clickOk();

        //     System.out.println("An OTP code has been sent to your email address.");


//    @Test(priority =3)
//    public void fiatPage() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        fiatPage FiatPage = new fiatPage(driver);
//        FiatPage.clickdashboard();
//        FiatPage.clickonwallet();
//        FiatPage.clickFiat();
//        FiatPage.clickonDynamic();
//        Thread.sleep(3000);
//        FiatPage.clickAccount();
//        FiatPage.clickonFunds();
//        Thread.sleep(1000);
//        FiatPage.clickonContinue();
//        Thread.sleep(2000);
//        FiatPage.cickonGotthis();
//        Thread.sleep(5000);
//        FiatPage.clickPin1();
//        FiatPage.clickonPin2();
//        FiatPage.clickonpin3();
//        FiatPage.clickonPin4();
//        FiatPage.clickonPin5();
//        FiatPage.clickonpin6();
//    }
