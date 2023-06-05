package Stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver;

    @Given("^user able to open browser(\\d+)$")
    public void user_able_to_open_browser(int arg1)  {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver ();
        driver.manage().window().maximize();
    }

    @Given("^Enter Url(\\d+)$")
    public void enter_Url(int arg1)  {
        driver.get("https://demo.nopcommerce.com/");

    }


    @When("^USER CLICK ON LOGIN LINK$")
    public void user_CLICK_ON_LOGIN_LINK()  {
        driver.findElement( By.className("ico-login")).click();


    }

    @When("^user on login page and verify login page title$")
    public void user_on_login_page_and_verify_login_page_title()  {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Login",title);

    }

    @Then("^Enter username and password and click on login link$")
    public void enter_username_and_password_and_click_on_login_link()  {
        driver.findElement(By.id("Email")).sendKeys("gitgohil@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("abc123456@");
        driver.findElement(By.className("login-button")).click();

    }


}
