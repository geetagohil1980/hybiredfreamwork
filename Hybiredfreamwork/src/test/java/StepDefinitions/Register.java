package StepDefinitions;

import ResultVerification.ResultVerificationForHomePage;
import ResultVerification.ResultVerificationForRegisterPage;
import WebElements.RegisterPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
    RegisterPage registerPage = new RegisterPage ();
    ResultVerificationForRegisterPage resultVerificationForRegisterPage = new ResultVerificationForRegisterPage();
    ResultVerificationForHomePage resultVerificationForHomePage = new ResultVerificationForHomePage();


    @When("^User click on Register link$")
    public void user_click_on_Register_link() {
        registerPage.clickOnRegisterLink ();

    }

    @When("^User is on Register page and verify the register page$")
    public void user_is_on_Register_page_and_verify_the_register_page()
    {
        resultVerificationForRegisterPage.registerPageTitle ();



    }

    @When("^User enter Registration detail and click on registerbutton$")
    public void user_enter_FirstName_and_LastName() {registerPage.doRegister ();

    }


    @When("^User is on home page and verify the home page title$")
    public void user_is_on_home_page_and_verify_the_home_page_title(){

        resultVerificationForHomePage.HomePageTitle ();


    }






}
