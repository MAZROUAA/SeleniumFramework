package tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegisterationPage;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegWithJavaFaker extends TestBase{
    HomePage homeobj;
    UserRegisterationPage registerobj;
    LoginPage loginobj;
    Faker fakeData=new Faker();
    String firstname=fakeData.name().firstName();
    String lastname=fakeData.name().lastName();
    String email=fakeData.internet().emailAddress();
    String pass=fakeData.number().digits(8).toString();
    @Test(priority = 1,alwaysRun = true)
    public void userRegisterSuccesfully()
    {
        homeobj=new HomePage(driver);
        homeobj.openRegisterationpage();
        registerobj=new UserRegisterationPage(driver);
        registerobj.userregister(firstname,lastname,email,pass);
        System.out.println(firstname+" "+lastname+" "+email+" "+pass);
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
