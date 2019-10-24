package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.*;

public class SliderTest extends BaseTests {
    @Test
    public void testSlider(){
        var sliderPage = homePage.clickHorizontalSlider();
        String value = "4";
        sliderPage.moveSlider(value);
        assertEquals(sliderPage.getSliderNumber(),value,"Slider value incorrect");
    }
}
