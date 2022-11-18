package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingCartObjectModel {

    //variables
    private WebDriver driver;
    //Constructor
    public ShoppingCartObjectModel(WebDriver driver) {this.driver=driver;}

    //locators
    private By ContinueShopping(){return By.xpath("//button[@class='btn shopingCartContainer-promoCode-btn btn-grey fontLightEnAr']");}
    private By ProceedToPayButton(){return By.xpath("//button[contains(text(),'تقدم للدفع ')]");}

    private By TotalAmountText(){return By.xpath(" //p[contains(text(),'الإجمالي')]");}



    /**
     * this method click on Continue Shopping Button to go back to main menu
     */
    public void clickOnContinueShoppingButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ContinueShopping()));
        driver.findElement(ContinueShopping()).click();}

    /**
     * this method click on Proceed To Pay Button
     */
    public void clickOnProceedToPayButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(TotalAmountText()));
        driver.findElement(ProceedToPayButton()).click();}
}