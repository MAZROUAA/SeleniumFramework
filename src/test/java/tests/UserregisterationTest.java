package tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegisterationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserregisterationTest extends TestBase{
    HomePage homeobj;
    UserRegisterationPage registerobj;
    LoginPage loginobj;
    @Test(priority = 1,alwaysRun = true)
    public void userRegisterSuccesfully()
    {
        homeobj=new HomePage(driver);
        homeobj.openRegisterationpage();
        registerobj=new UserRegisterationPage(driver);
        registerobj.userregister("Mohamed","Mazrouaa","testeemail832@gmail.com","1234567");
        Assert.assertTrue(registerobj.successMessage.getText().contains("registration completed"));
    }
    @Test(dependsOnMethods = "userRegisterSuccesfully")
    public void RegisteredUserCanLogout(){
        registerobj.userLogout();
    }
    @Test(dependsOnMethods ="RegisteredUserCanLogout" )
    public void RegisteredUserCanLgoin(){

        loginobj=new LoginPage(driver);
        loginobj.userlogin("testeemail832@gmail.com","1234567");


    }
}
