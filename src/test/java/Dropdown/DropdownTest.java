package Dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropdownTest extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }


}
