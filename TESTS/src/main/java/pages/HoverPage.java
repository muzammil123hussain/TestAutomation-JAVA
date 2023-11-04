package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    private WebDriver driver;
    private By figBox = By.className("figure");

    public HoverPage(WebDriver driver) {
        this.driver = driver;
    }

    public FigCaption hoverOnElement(int index){
        WebElement figure = driver.findElements(figBox).get(index - 1);
        Actions action =  new Actions(driver);
        action.moveToElement(figure).perform();
        return new FigCaption(figure);
    }

    public class FigCaption {
        private WebElement caption;
        public FigCaption(WebElement caption) {
            this.caption = caption;
        }
        public boolean isCaptionDisplayed (){
            return caption.isDisplayed();
        }
        public String getTitle (){
            return caption.findElement(By.tagName("h5")).getText();
        }
        public String getLinkTxt (){
            return caption.findElement(By.tagName("a")).getText();
        }
        public String getLinkURL (){
            return caption.findElement(By.tagName("a")).getAttribute("href");
        }
    }
}
