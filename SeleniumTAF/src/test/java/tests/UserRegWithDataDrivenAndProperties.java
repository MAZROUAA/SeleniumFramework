package tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegisterationPage;
import data.LoadPropertiesFile;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegWithDataDrivenAndProperties extends TestBase{
    HomePage homeobj;
    UserRegisterationPage registerobj;
    LoginPage loginobj;
    String firstname= LoadPropertiesFile.userData.getProperty("firstname");
    String lastname= LoadPropertiesFile.userData.getProperty("lastname");
    String email= LoadPropertiesFile.userData.getProperty("email");
    String pass= LoadPropertiesFile.userData.getProperty("pass");
    @Test(priority = 1,alwaysRun = true)
    public void userRegisterSuccesfully()
    {
        homeobj=new HomePage(driver);
        homeobj.openRegisterationpage();
        registerobj=new UserRegisterationPage(driver);
        registerobj.userregister(firstname,lastname,email,pass);
        Assert.assertTrue(registerobj.successMessage.getText().contains("registration completed"));
    }
    @Test(dependsOnMethods = "userRegisterSuccesfully")
    public void RegisteredUserCanLogout(){
        registerobj.userLogout();
    }
    @Test(dependsOnMethods ="RegisteredUserCanLogout" )
    public void RegisteredUserCanLgoin(){

        loginobj=new LoginPage(driver);
        loginobj.userlogin(email,pass);


    }
}
