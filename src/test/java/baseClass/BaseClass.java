package baseClass;


import PageWebPages.DashBoardPage;
import PageWebPages.LandingPage;
import PageWebPages.LoginPage;
import PageWebPages.fiatPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class BaseClass {

    public static WebDriver driver;

    public WebDriver startdriver(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
        } else
            return driver;
        return null;
    }

    //ExtentTest test;
    //ExtentReports reports;
    //extentManager ExtentManager = new extentManager();
    // Create a Landingpage
    protected LandingPage landingPage;
    protected LoginPage loginPage;
    protected DashBoardPage dashBoardPage;
    protected fiatPage FiatPage;


    @BeforeTest
    public void SetUp() {
        // reports = ExtentManager.getReports();
        // test = reports.createTest("BaseClassTest");
         ChromeOptions options = new ChromeOptions();
         options.addArguments("---disable notifications");
        //Set Chrome Browser
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        this.driver = new ChromeDriver();

        // maximize window
        driver.manage().window().maximize();
        //Open the page URL
        driver.get("https://patricia-web-v2.gke.staging.patriciadev.com/login?rt=%2F");


//            //Instantiate the page after launching the browser
//           landingPage = new LandingPage(driver);

    }

}



