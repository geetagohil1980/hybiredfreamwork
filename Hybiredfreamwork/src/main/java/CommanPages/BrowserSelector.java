package CommanPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage{

    LoadProperty loadProperty = new LoadProperty();

    String browserName = loadProperty.getProperty("browser");
    String URL =loadProperty.getProperty("url");

    public void openSelectedBrowser (){
        //Open the local browser
        if(browserName.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver ();
        }else if(browserName.equals("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver ();
        }else if(browserName.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver ();
        }else {
            System.out.println("Browser Not Matched");
        }
        //Maximising the browser window
        driver.manage().window().maximize();
        //Deleting the cookies
        driver.manage().deleteAllCookies();
        //Page loading timeout
        driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);
        //Applying the implicit wait for driver object
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get(URL);
    }



}
