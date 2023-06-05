package WebElements;

import CommanPages.LoadProperty;
import CommanPages.Utils;
import org.openqa.selenium.By;

public class RegisterPage extends Utils {
    LoadProperty loadProperty = new LoadProperty();

     By _clickonRegisterLink = By.xpath ( "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a" );
    By _firstName = By.id ( "FirstName" );
    By _lastName =By.id ( "LastName" );
    By _emailId = By.id ( "Email" );
    By _passWord = By.id ( "Password" );
    By _confirmPassword =By.id ( "ConfirmPassword");
    By _clickOnRegisterButton =By.xpath ( "//*[@id=\"register-button\"]" );

public void clickOnRegisterLink(){
    doClick ( _clickonRegisterLink);



}
public void doRegister (){
    doSendkey ( _firstName,loadProperty.getProperty ( "FirstName" ) );
    doSendkey ( _lastName,loadProperty.getProperty ( "LastName" ) );
    doSendkey ( _emailId,loadProperty.getProperty ( "Email" ) );
    doSendkey ( _passWord,loadProperty.getProperty ( "Password" ) );
    doSendkey ( _confirmPassword,loadProperty.getProperty ( "Confirmpassword" ) );
doClick ( _clickOnRegisterButton );



}














}
