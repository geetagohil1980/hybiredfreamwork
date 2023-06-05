package ResultVerification;

import CommanPages.Utils;
import org.testng.Assert;

public class ResultVerificationForRegisterPage extends Utils {

    public void registerPageTitle(){
        String RegisterPageTitle = driver.getTitle();
        System.out.println (RegisterPageTitle);
        Assert.assertEquals (RegisterPageTitle,"nopCommerce demo store. Register","Register page title not matched");
    }

}
