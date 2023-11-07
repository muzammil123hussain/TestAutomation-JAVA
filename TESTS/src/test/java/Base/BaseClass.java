package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseClass {
    private WebDriver driver;
    protected HomePage homePage;
    private final String URL = "https://the-internet.herokuapp.com/";

    @BeforeClass
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "/home/muzammil/Documents/practice/TestAutomation-JAVA/resources/chromedriver");
        driver = new ChromeDriver();
        goHome();
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        homePage = new HomePage(driver);
    }
    @BeforeMethod
    public void goHome(){
        driver.get(URL);
    }

    @AfterClass
    public void TearDown(){
        driver.quit();
    }
}
