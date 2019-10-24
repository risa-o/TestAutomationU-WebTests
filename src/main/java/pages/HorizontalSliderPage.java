package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.cssSelector(".sliderContainer input");
    private By sliderNumber = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void moveSlider(String number){
       while(!getSliderNumber().equals(number)) {
           driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
       }
    }

    public String getSliderNumber(){
        return driver.findElement(sliderNumber).getText();
    }

}
