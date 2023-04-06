package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);}
    @FindBy(id="Email")
    WebElement emailTxtBox;
    @FindBy(id="Password")
    WebElement passTxtBox;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
    WebElement loginBtn;
    public void userlogin(String email,String password){
        setTextElement(emailTxtBox,email);
        setTextElement(passTxtBox,password);
        clicbutton(loginBtn);
    }
}
