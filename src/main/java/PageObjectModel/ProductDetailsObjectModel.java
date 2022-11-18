package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetailsObjectModel {
    //variables
    private WebDriver driver;
    //Constructor
    public ProductDetailsObjectModel(WebDriver driver) {this.driver=driver;}

    //locators
    private By BuyNowButton(){return By.xpath("//button[@class='btn btn-red btn-block fontLightEnAr']");}
    private By InstallmentsSection(){return By.xpath("//div[@class='installments-price row']");}

    /**
     * this method click on buy now product to put it into cart
     */
    public void clickOnBuyNowButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(InstallmentsSection()));
        driver.findElement(BuyNowButton()).click();}

}