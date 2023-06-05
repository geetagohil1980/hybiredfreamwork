package Com.Demo.Nopcommerce.Base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    WebDriver driver;
    Properties prop;
    FileInputStream  file;
    public WebDriver initialisesDriver(String browserName)
    {
        if (browserName.equals ( "chrome" )){

            WebDriverManager.chromedriver ().setup ();
            driver=new ChromeDriver ();
        }else if (browserName.equals ( "edge" )){
            WebDriverManager.edgedriver ().setup ();
            driver=new EdgeDriver ();

        }else if (browserName.equals ( "firefox" )){
            WebDriverManager.firefoxdriver ().setup ();
            driver=new FirefoxDriver ();


            }else {
            System.out.println ("BROWSER NOT MATCH");
        }

        driver.manage ().window ().maximize ();
        driver.manage ().deleteAllCookies ();
        return driver;

        //we're using void in method so nwe will not get return value so we have to use return word with what we need to return



    }
    public Properties initialiseProperties() {

        prop = new Properties ();

        try {

            file = new FileInputStream ( "C:\\Users\\sidgo\\IdeaProjects\\PomPractice\\src\\test\\resources\\TestData\\Config.Properties " );

            prop.load ( file );
        } catch (FileNotFoundException exception) {
            System.out.println ( "CONFIG FILE NOT FOUND PLEASE CHECK" );

        } catch (IOException e) {
            System.out.println ( "properties could  be not loaded" );

        }
        return  prop;


    }



}









