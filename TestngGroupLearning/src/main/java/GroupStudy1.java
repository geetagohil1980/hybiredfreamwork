import org.apache.hc.core5.reactor.Command;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupStudy1 {


    @Test(priority = 1)
    void openBrowse() {
        System.out.println ( "Open browser  successfully" );
    }


    @Test(priority = 2)
    void LogIn() {
        System.out.println ( "User able to log in" );

    }

    @Test(dependsOnMethods = "LogIn")
    void findProduct() {
        System.out.println ( "User able to find product@@" );
        Assert.fail ();

    }

    @Test()
    void addToCart() {
        System.out.println ( "USER ABLE TO ADD PRODUCT IN CART " );
        Assert.assertTrue ( true );
    }


}
