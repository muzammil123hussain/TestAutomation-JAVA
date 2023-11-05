package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerOkAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmAlertButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptAlertButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private By result = By.id("result");
    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickTriggerOkAlertButton(){
        driver.findElement(triggerOkAlertButton).click();
    }
    public void clickTriggerConfirmAlertButton(){
        driver.findElement(triggerConfirmAlertButton).click();
    }
    public void clickTriggerPromptAlertButton(){
        driver.findElement(triggerPromptAlertButton).click();
    }
    public String getAlertTxt(){
        return driver.switchTo().alert().getText();
    }
    public void clickAlertOk(){
        driver.switchTo().alert().accept();
    }
    public void clickAlertConfirm(){
        driver.switchTo().alert().accept();
    }
    public void clickAlertCancel(){
        driver.switchTo().alert().dismiss();
    }
    public String getResultTxt(){
        return driver.findElement(result).getText();
    }
}
