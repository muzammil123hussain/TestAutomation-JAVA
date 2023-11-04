package DropDown;

import Base.BaseClass;
import org.testng.annotations.Test;
import pages.DropDownPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseClass {

    @Test
    public void testDropDown(){
        var dropDown = homePage.clickDropDownLink();
        var Option = "Option 1";
        dropDown.selectOptionFromDropDown(Option);
        var selectOption = dropDown.getSelectedOption();
        assertEquals(selectOption.size(), 1, "Selected Options are more then expected");
        assertTrue(selectOption.contains(Option),"Expected Option is not selected ");
    }
}
