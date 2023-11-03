package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArea {
    private WebDriver driver;
    private By alertMsg = By.id("flash");

    public SecureArea(WebDriver driver) {
        this.driver = driver;
    }
    public String getAlertMsg(String msg){
        return driver.findElement(alertMsg).getText();
    }
}
