package Slider;

import Base.BaseClass;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseClass {
    @Test
    public void testSliderTill4(){
        var sliderpage = homePage.clickSliderLink();
        sliderpage.clickAndSlide("4");
        assertEquals(sliderpage.getValue(),"4","Slider value is  not same as expected");
    }
}
