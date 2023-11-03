package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;

public class BaseClass {
    private WebDriver driver;
    protected HomePage homePage;
    private final String URL = "https://the-internet.herokuapp.com/";

    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        homePage = new HomePage(driver);
        driver.quit();
    }


    public void exerciseOne(){
        driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.linkText("Example 1: Menu Element")).click();
        List <WebElement> menu = driver.findElements(By.tagName("li"));
        System.out.println(menu.size());
    }

    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        baseClass.SetUp();
    }
}
