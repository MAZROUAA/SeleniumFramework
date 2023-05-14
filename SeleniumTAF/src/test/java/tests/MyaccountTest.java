package tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyaccountPage;
import Pages.UserRegisterationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyaccountTest extends TestBase{
    String email="testeemail828@gmail.com";
    HomePage homeobj;
    UserRegisterationPage registerobj;
    LoginPage loginobj;
    MyaccountPage myccountobj;
    @Test(priority = 1,alwaysRun = true)
    public void userRegisterSuccesfully()
    {
        homeobj=new HomePage(driver);
        homeobj.openRegisterationpage();
        registerobj=new UserRegisterationPage(driver);
        registerobj.userregister("Mohamed","Mazrouaa",email,"1234567");
        Assert.assertTrue(registerobj.successMessage.getText().contains("registration completed"));
    }
    @Test(dependsOnMethods = "userRegisterSuccesfully")
    public void RegisteredUserCanLogout(){
        registerobj.userLogout();
    }
    @Test(dependsOnMethods ="RegisteredUserCanLogout" )
    public void RegisteredUserCanLgoin() throws InterruptedException {

        loginobj=new LoginPage(driver);
        loginobj.userlogin(email,"1234567");

    }
   @Test(dependsOnMethods ="RegisteredUserCanLgoin" )
    public void changePassTest() throws InterruptedException {
        myccountobj=new MyaccountPage(driver);
        myccountobj.openChngPassLink();
        myccountobj.changePass("1234567","111111");
        Assert.assertTrue(myccountobj.passChangedTxt.getText().contains("Password was changed"));


    }
}
