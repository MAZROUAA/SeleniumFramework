package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyaccountPage extends PageBase{
    public MyaccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "Change password")
    WebElement changPassLink;
    @FindBy(id = "OldPassword")
    WebElement oldPassTxtbox;
    @FindBy(id = "NewPassword")
    WebElement newPassTxtbox;
    @FindBy(id = "ConfirmNewPassword")
    WebElement confirmNewPassTxtbox;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/button")
    WebElement chngPassBtn;
    @FindBy(css = "p.content")
    public WebElement passChangedTxt;

    @FindBy(linkText= "My account")
    WebElement myaccountlink;


    public void openChngPassLink() {
        clicbutton(myaccountlink);
       clicbutton(changPassLink);
    }
    public void changePass(String oldpass,String newPass) throws InterruptedException {
        setTextElement(oldPassTxtbox,oldpass);
        setTextElement(newPassTxtbox,newPass);
        setTextElement(confirmNewPassTxtbox,newPass);
        clicbutton(chngPassBtn);
    }
}
