import Page.LoginPage;
import Page.RegisterPage;
import com.demonopcommerce.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegisterTestPage {
    WebDriver driver;
    BasePage basePage;
    Properties prop = new Properties ();
    RegisterPage registerPage;

    @BeforeMethod
    public void openBrowser() {
        basePage = new BasePage ();
        prop = basePage.initialiseProperties ();
        driver = basePage.openBrowser ();
        driver.get ( prop.getProperty ( "url" ) );
        registerPage = new RegisterPage ( driver );

    }

    @Test
    public void registerTest() {

        registerPage.clickOnRegister ();
        registerPage.doRegister ( prop.getProperty ( "firstname" ), prop.getProperty ( "lastname" ), prop.getProperty ( "day" ),
                prop.getProperty ( "month" ), prop.getProperty ( "year" ), prop.getProperty ( "email" ),
                prop.getProperty ( "company" ), prop.getProperty ( "pass" ), prop.getProperty ( "confirmpassword" ) );


    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit ();

    }


}