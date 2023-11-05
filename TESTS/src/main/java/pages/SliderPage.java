package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SliderPage {
    private WebDriver driver;
    private By slider = By.cssSelector(".sliderContainer input");
    private By value = By.id("range");
    public SliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAndSlide(String expectedValue){
        while(!getValue().equals(expectedValue)){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        };
    }

    public String getValue(){
        return driver.findElement(value).getText();
    }
}
