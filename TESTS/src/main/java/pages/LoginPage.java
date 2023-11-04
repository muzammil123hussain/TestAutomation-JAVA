package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField  = By.id("password");
    private By loginBtn = By.cssSelector("#login button");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername (String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void enterPassword (String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginBtn (){
        driver.findElement(loginBtn).click();
        return new SecureAreaPage(driver);
    }
}
