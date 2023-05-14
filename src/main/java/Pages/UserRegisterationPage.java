package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage extends PageBase {

    public UserRegisterationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="gender-male")
    WebElement gendermaleradbtn;
    @FindBy(id="FirstName")
    WebElement fntxtbox;
    @FindBy(id="LastName")
    WebElement lntxtbox;
    @FindBy(id="Email")
    WebElement emailtxtbox;
    @FindBy(id="Password")
    WebElement passtxtbox;
    @FindBy(id="ConfirmPassword")
    WebElement confirmpasstxtbox;
    @FindBy(id="register-button")
    WebElement regbtn;
    @FindBy(css = "div.result")
    public WebElement successMessage;
    @FindBy(linkText= "Log in")
    public WebElement loogoutLink;
    @FindBy(linkText= "My account")
     WebElement myaccountlink;
    public void userregister(String Fn,String Ln ,String email ,String password)
    {
        clicbutton(gendermaleradbtn);
        setTextElement(fntxtbox,Fn);
        setTextElement(lntxtbox,Ln);
        setTextElement(emailtxtbox,email);
        setTextElement(passtxtbox,password);
        setTextElement(confirmpasstxtbox,password);
       clicbutton(regbtn);
    }
    public void userLogout(){
        clicbutton(loogoutLink);
    }
    public void openMyaccountLink(){
        clicbutton(myaccountlink);
    }



}
