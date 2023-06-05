package Stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Register {

WebDriver driver;

    @Given("^user able to open browser$")
    public void user_able_to_open_browser()  {
        WebDriverManager.chromedriver ().setup ();
        driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();

    }

    @Given("^Enter Url$")
    public void enter_Url() {
        driver.get ( "https://demo.nopcommerce.com/ " );

    }

    @When("^user click on register link$")
    public void user_click_on_register_link() {
        driver.findElement ( By.className ( "ico-register" ) ).click ();

    }

    @Then("^verify register page title$")
    public void verify_register_page_title() {
        String TITLE = driver.getTitle ();
        System.out.println (TITLE);
        Assert.assertEquals ( "nopCommerce demo store. Register",TITLE );

    }

    @Then("^enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enter_and_and(String Firstname, String Lastname, String Email) throws InterruptedException {
        driver.findElement ( By.id ( "FirstName" ) ).sendKeys ( Firstname);
        driver.findElement ( By.id ( "LastName" ) ).sendKeys ( Lastname );
        Thread.sleep ( 2000 );
        driver.findElement ( By.xpath ( "//*[@id=\"Email\"]" ) ).sendKeys (Email  );

    }

    @Then("^use valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void use_valid_and(String Password, String Confirmpassword)  {
        driver.findElement ( By.id ( "Password" ) ).sendKeys (Password);
        driver.findElement ( By.id ( "ConfirmPassword" ) ).sendKeys ( Confirmpassword);

    }

    @Then("^Click on register button$")
    public void click_on_register_button()  {
        driver.findElement ( By.xpath("//*[@id=\"register-button\"]")).click() ;

    }







}
