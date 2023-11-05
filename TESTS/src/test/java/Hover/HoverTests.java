package Hover;

import Base.BaseClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class HoverTests extends BaseClass {
    @Test
    public void testHoverUser1 (){
        var hoverpage = homePage.clickHoverLink();
        var caption = hoverpage.hoverOnElement(1);
        assertTrue(caption.isCaptionDisplayed(), "caption is not displayed");
        assertEquals(caption.getTitle(), "name: user1", "user name is not user1");
        assertEquals(caption.getLinkTxt(),"View profile", "link text is not same as view profile");
        assertTrue(caption.getLinkURL().endsWith("/users/1"), "Link is  incorrect");
    }

}
