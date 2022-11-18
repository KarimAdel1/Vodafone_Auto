package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageObjectModel {
    //variables
    private WebDriver driver;

    //Constructor
    public HomePageObjectModel(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By FirstProduct() {
        return By.xpath("//div/div/p[contains(text(),'Samsung Galaxy A33(5G)  8/128 ')]");
    }

    private By SecondProduct() {
        return By.xpath("//div/div/p[contains(text(),'Charge 5 Bluetooth Speaker')]");
    }

    private By SearchBar() {
        return By.id("search-q");
    }


    private By FirstProductInList() {
        return By.xpath("//div[1]/ul/div[1]/div/a/li/div[2]/p");
    }


    /**
     * this method click on first product from main menu
     */
    public void selectFirstProduct() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(FirstProduct()));
        driver.findElement(FirstProduct()).click();
    }


    /**
     * this method click on first product from main menu
     */
    public void selectSecondProduct() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(SecondProduct()));
        driver.findElement(SecondProduct()).click();
    }

    /**
     * this method searches in search bar for the third product
     */
    public void searchingForProduct() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchBar()));
        driver.findElement(SearchBar()).sendKeys("smart watch");
    }

    /**
     * this method click on first product in the list for the third product
     */
    public void clickingForThirdProduct() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(FirstProductInList()));
        driver.findElement(FirstProductInList()).click();
    }




}