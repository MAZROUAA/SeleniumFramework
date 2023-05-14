package steps;

import Pages.HomePage;
import Pages.UserRegisterationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import tests.TestBase;

public class UserRegForBDD extends TestBase {
    HomePage homeObj;
    UserRegisterationPage registerObj;
    @Given("^the user in the home page$")
    public void the_user_in_the_home_page() throws Throwable {
        homeObj=new HomePage(driver);
        homeObj.openRegisterationpage();
    }

    @When("^I click on register link$")
    public void i_click_on_register_link() throws Throwable {
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }

   /* @When("^I entered the user data$")
    public void i_entered_the_user_data() throws Throwable {
        registerObj=new UserRegisterationPage(driver);
        registerObj.userregister("moza","mmmm","msddd@gmail.com","1111111");
    }*/
   @When("^I entered the \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
   public void i_entered_the(String firstname, String lastname, String email, String pass) throws Throwable {
       registerObj=new UserRegisterationPage(driver);
       registerObj.userregister(firstname,lastname,email,pass);
   }

    @Then("^the registration page displayed successfully$")
    public void the_registration_page_displayed_successfully() throws Throwable {
     registerObj.userLogout();

    }
}
