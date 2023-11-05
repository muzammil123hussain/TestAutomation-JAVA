package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By result = By.id("result");
    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickTriggerAlertButton(){
        driver.findElement(triggerAlertButton).click();
    }
    public String getAlertTxt(){
        return driver.switchTo().alert().getText();
    }
    public void clickAlertOk(){
        driver.switchTo().alert().accept();
    }
    public String getResultTxt(){
        return driver.findElement(result).getText();
    }
}
