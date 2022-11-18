package Stepdefs;

import PageObjectModel.CheckoutObjectModel;
import PageObjectModel.HomePageObjectModel;
import PageObjectModel.ProductDetailsObjectModel;
import PageObjectModel.ShoppingCartObjectModel;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ScenarioSteps{
    public static WebDriver driver;
    //variables
    HomePageObjectModel homePageObjectModel;
    ProductDetailsObjectModel productDetailsObjectModel;
    ShoppingCartObjectModel shoppingCartObjectModel;
    CheckoutObjectModel checkoutObjectModel;


    @Given("User Open Vodafone eshop website")
    public void UserNavigateToVodafoneWebsite(){
        //using selenium 4.6
        //To open Chrome browser and navigate to vf eshop website
        driver = new ChromeDriver();
        driver.navigate().to("https://eshop.vodafone.com.eg/shop/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("User Selects first product from main menu")
    public void userSelectsFirstProduct(){
        homePageObjectModel = new HomePageObjectModel(driver);
        homePageObjectModel.selectFirstProduct();}
    @And("User click on buy now button \"اشتري الان\"")
    public void userClicksOnBuyNowButton(){
        productDetailsObjectModel = new ProductDetailsObjectModel(driver);
        productDetailsObjectModel.clickOnBuyNowButton();}
    @And("User click on main menu to continue shopping")
    public void userClickOnMainMenuHyperLink(){
        shoppingCartObjectModel = new ShoppingCartObjectModel(driver);
        shoppingCartObjectModel.clickOnContinueShoppingButton();}
    @And("User Selects second product from main menu")
    public void userSelectsSecondProduct(){
        homePageObjectModel = new HomePageObjectModel(driver);
        homePageObjectModel.selectSecondProduct();}
    @And("User searches for the third product from search bar")
    public void userSearchesForThirdProduct(){
        homePageObjectModel = new HomePageObjectModel(driver);
        homePageObjectModel.searchingForProduct();}
    @And("User Selects the third button from search result")
    public void userSelectsThirdProductFromSearchResults(){
        homePageObjectModel = new HomePageObjectModel(driver);
        homePageObjectModel.clickingForThirdProduct();}
    @And("User click on proceed to pay button")
    public void userClickOnProceedToPayButton(){
        shoppingCartObjectModel = new ShoppingCartObjectModel(driver);
        shoppingCartObjectModel.clickOnProceedToPayButton();}
    @And("Screen of filling detail should appear")
    public void DetailsScreenShouldBeDisplayed(){
        checkoutObjectModel = new CheckoutObjectModel(driver);
        Assert.assertEquals(checkoutObjectModel.getToCompletePageDetails(), true);}
    @Then("Browser closes when test done")
    public void UserCloseTheBrowser() {
        //To close Chrome browser
        driver.quit();
    }
}
