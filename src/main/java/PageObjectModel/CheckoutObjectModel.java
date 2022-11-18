package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutObjectModel {

    //variables
    private WebDriver driver;
    //Constructor
    public CheckoutObjectModel(WebDriver driver) {this.driver=driver;}

    //locators
    private By CompleteDetails(){return By.xpath("//*[@class='checkoutHeader fontLight']");}

    public Boolean getToCompletePageDetails(){
        return driver.findElement(CompleteDetails()).isDisplayed();
    }
}