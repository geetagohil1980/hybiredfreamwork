import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.print.PageLayout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Shopping1 {

    WebDriver driver;

    @Test
    void openBrowser() {
        WebDriverManager.chromedriver ().setup ();
        driver = new ChromeDriver ();
        driver.get ( "https://demo.nopcommerce.com/" );
        driver.manage ().window ().maximize ();
        System.out.println ( "Open browser" );

    }

    @Test(priority = 1)
    void myShopping()  {



        System.out.println ("Open Browser");
        WebDriverManager.chromedriver ().setup ();
        driver = new ChromeDriver ();
        driver.get ( "https://demo.nopcommerce.com/" );
        driver.manage ().window ().maximize ();
        System.out.println ( "Shoping Lenovo pc" );

        driver.findElement ( By.xpath ( "/html/body/div[6]/div[2]/ul[1]/li[1]/a" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img  " ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a  " ) ).click ();

        driver.findElement ( By.className ( "button-2 product-box-add-to-cart-button" ) ).click ();
        driver.findElement ( By.className ( "cart-label" ) ).click ();
        driver.findElement ( By.className ( "quantity" ) ).sendKeys ( "2" );
        driver.findElement ( By.name ( "updatecart " ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=\"shopping-cart-form\"]/div[3]/div[2]/div[1]/table/tbody/tr[4]/td[1]/label" ) );
        driver.findElement ( By.id ( "termsofservice" ) ).click ();
        driver.findElement ( By.id ( "checkout" ) ).click ();
        System.out.println ( "User able to do shopping" );

    }

    @Test(priority = 2)
    void checkout0() {

        WebDriverManager.chromedriver ().setup ();
        driver = new ChromeDriver ();
        driver.get ( "https://demo.nopcommerce.com/" );
        driver.manage ().window ().maximize ();
        System.out.println ("User can go to checkout");

        driver.findElement (By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1] " )  ).click ();
        System.out.println ( "User able to go Checkout page" );


    }


    @Test(priority = 3)
    void checkout11() {
        WebDriverManager.chromedriver ().setup ();
        driver = new ChromeDriver ();
        driver.get ( "https://demo.nopcommerce.com/" );
        driver.manage ().window ().maximize ();
        System.out.println ( "Open browser" );

        driver.findElement ( By.className ( "step-title " ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=checkout-billing-load]/div/div[1]/p/label " ) ).click ();
        driver.findElement ( By.id ( "BillingNewAddress_FirstName " ) ).sendKeys ( "Ella" );
        driver.findElement ( By.id ( " BillingNewAddress_LastName" ) ).sendKeys ( " Rosy" );
        driver.findElement ( By.id ( "BillingNewAddress_Email " ) ).sendKeys ( "git@123yahoo.com" );
        driver.findElement ( By.name ( "BillingNewAddress.CountryId " ) ).click ();
        driver.findElement ( By.name ( " BillingNewAddress.City" ) ).sendKeys ( "London" );
        driver.findElement ( By.id ( " BillingNewAddress_Address1" ) ).sendKeys ( "5,CovertonRoad" );
        driver.findElement ( By.name ( "BillingNewAddress.ZipPostalCode " ) ).sendKeys ( "SW17 0QN" );
        driver.findElement ( By.name ( "BillingNewAddress.PhoneNumber " ) ).sendKeys ( "07827029116" );
        driver.findElement ( By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/div/button[4] " ) ).click ();


    }

    @Test(priority = 4)
    void checkout22() {
        driver.findElement ( By.xpath ( " /html/body/div[6]/div[3]/div/div/div/div[1]/h1" ) ).click ();
        driver.findElement ( By.id ( "shipping option_1 " ) ).click ();
        driver.findElement ( By.className ( " button-1 shipping-method-next-step-button" ) ).click ();
        driver.findElement ( By.className ( "step-title " ) ).click ();
        driver.findElement ( By.className ( " payment-description" ) ).click ();
        driver.findElement ( By.className ( " button-1 payment-method-next-step-button" ) ).click ();
        driver.findElement ( By.className ( "dropdown lists " ) ).click ();
        driver.findElement ( By.id ( "CardholderName " ) ).sendKeys ( "ella Rosy" );
        driver.findElement ( By.name ( "CardNumber " ) ).sendKeys ( " 23456678" );
        driver.findElement ( By.name ( "ExpireMonth " ) ).sendKeys ( "3" );
        driver.findElement ( By.name ( "ExpireYear " ) ).sendKeys ( " 2024" );
        driver.findElement ( By.id ( "CardCode " ) ).sendKeys ( "1432" );
        driver.findElement ( By.className ( " button-1 payment-info-next-step-button" ) ).click ();
        driver.findElement ( By.className ( " button-1 confirm-order-next-step-button" ) ).click ();

        System.out.println ( "User checkout sucessfully" );


    }

    @Test(priority = 5)
    void conformYes() {

        driver.findElement ( By.className ( " section order-completed" ) ).click ();
        System.out.println ( " User receive conformation message" );


    }

    @Test
    void closeBrowser() {
        driver.close ();
        System.out.println ( "Browser close" );
    }

}















