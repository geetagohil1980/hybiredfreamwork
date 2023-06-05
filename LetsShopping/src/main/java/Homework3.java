import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Homework3 {

    WebDriver driver;

    @Test
    void openBrowser(){


        WebDriverManager.chromedriver ().setup ();
        driver = new ChromeDriver ();
        driver.get ( "https://demo.nopcommerce.com/ " );
        driver.manage ().window ().maximize ();

    }

    @Test
     void services() throws InterruptedException {

        driver.findElement ( By.xpath ( "/html/body/div[6]/div[2]/ul[1]/li[1]/a " ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img" ) ).click ();
        driver.findElement ( By.xpath ( " /html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img" ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=\"add-to-cart-button-3\"]" ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=\"topcartlink\"]/a/span[1]" ) ).click ();
        driver.findElement ( By.className ( "qty-input" ) ).clear ();
        driver.findElement ( By.className ( "qty-input" ) ).sendKeys ( "3" );
        driver.findElement ( By.xpath ( "//*[@id=\"updatecart\"]" ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=\"shopping-cart-form\"]/div[3]/div[2]/div[3]" ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=\"checkout\"]" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]" ) ).click ();
        driver.findElement ( By.id ( "BillingNewAddress_FirstName" ) ).sendKeys ( "Geeta" );
        driver.findElement ( By.id ( "BillingNewAddress_LastName" ) ).sendKeys ( "Gohil" );
        driver.findElement ( By.id ( "BillingNewAddress_Email" ) ).sendKeys ( "gitgohil@yahoo.co.in" );
        driver.findElement ( By.id ( "BillingNewAddress_CountryId" ) ).sendKeys ( "uk" );
        driver.findElement ( By.id ( "BillingNewAddress_City" ) ).sendKeys ( "London" );
        driver.findElement ( By.id ( "BillingNewAddress_Address1" ) ).sendKeys ( "5,CovertonRoad" );
        driver.findElement ( By.id ( "BillingNewAddress_ZipPostalCode" ) ).sendKeys ( "SW17 0QN" );
        driver.findElement ( By.id ( "BillingNewAddress_PhoneNumber" ) ).sendKeys ( "07826029113" );
        driver.findElement ( By.xpath ( "//*[@id=\"billing-buttons-container\"]/button[4]" ) ).click ();
        Thread.sleep ( 1000);
        driver.findElement ( By.xpath ( "//*[@id=\"shipping-methods-form\"]/ul/li[3]/div[1]/label" ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=\"shipping-method-buttons-container\"]/button" ) ).click ();
        Thread.sleep ( 1000 );
        driver.findElement ( By.xpath ( "//*[@id=\"payment-method-block\"]/li[2]/div/div[1]/label/img" ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=\"payment-method-buttons-container\"]/button" ) ).click ();
        Thread.sleep ( 1000 );
        driver.findElement ( By.id ( "CreditCardType" ) ).sendKeys ( "Amex" );
        driver.findElement ( By.id ( "CardholderName" ) ).sendKeys ( "GEETA" );
        driver.findElement ( By.id ( "CardNumber" ) ).sendKeys ( "0000" );
        driver.findElement ( By.id ( "ExpireMonth" ) ).sendKeys ( "03" );
        driver.findElement ( By.id ( "ExpireYear" ) ).sendKeys ( "2024" );
        driver.findElement ( By.xpath ( "//*[@id=\"CardCode\"]" ) ).sendKeys ( "355" );
        driver.findElement ( By.xpath ( "//*[@id=\"payment-info-buttons-container\"]/button" ) ).click ();
        Thread.sleep ( 1000 );
        driver.findElement ( By.xpath ( "//*[@id=\"confirm-order-buttons-container\"]/button" ) ).click ();

driver.close ();







    }













}
