package ResultVerification;

import CommanPages.Utils;
import org.testng.Assert;

public class ResultVerificationForHomePage extends Utils {
    public void HomePageTitle(){
        String HomePageTitle = driver.getTitle();
        Assert.assertEquals(HomePageTitle,"nopCommerce demo store. Register","Home page title not matched");
    }
}
