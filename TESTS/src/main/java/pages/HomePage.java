package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage clickFormAuthenticationLink(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDownLink(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    public HoverPage clickHoverLink(){
        clickLink("Hovers");
        return new HoverPage(driver);
    }
    public SliderPage clickSliderLink(){
        clickLink("Horizontal Slider");
        return new SliderPage(driver);
    }
    public AlertsPage clickAlertsLink(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    private void clickLink(String LinkTxt){
        driver.findElement(By.linkText(LinkTxt)).click();
    }
}
