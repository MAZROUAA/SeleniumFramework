package tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegisterationPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserRegWithDataDriven extends TestBase{
    HomePage homeobj;
    UserRegisterationPage registerobj;
    LoginPage loginobj;

    @DataProvider(name = "testData")
    public static Object[][] userData(){
        return new Object[][]{
                {
                    "mohamed" ,"ahmed","test1111@gmail.com","123456"
                },
                {
                        "Ali" ,"ahmed","test1234@gmail.com","1234567"
                }
        };
    }
    @Test(priority = 1,alwaysRun = true,dataProvider = "testData")
    public void userRegisterSuccesfully(String fname,String lname,String email, String pass)
    {
        homeobj=new HomePage(driver);
        homeobj.openRegisterationpage();
        registerobj=new UserRegisterationPage(driver);
        registerobj.userregister(fname,lname,email,pass);
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
