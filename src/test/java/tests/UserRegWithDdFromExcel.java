package tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegisterationPage;
import data.ExcelReadee;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserRegWithDdFromExcel extends TestBase{
    HomePage homeobj;
    UserRegisterationPage registerobj;
    LoginPage loginobj;
    @DataProvider(name="excelData")
    public Object[][] userRegData() throws IOException {
        //get data from excel reader class
        ExcelReadee er =new ExcelReadee();
        return er.getExcelData();
    }
    @Test(priority = 1,alwaysRun = true,dataProvider = "excelData")
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
