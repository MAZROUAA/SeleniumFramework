package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
        jse= (JavascriptExecutor)driver;
        action=new Actions(driver);
    }
    @FindBy(linkText = "Register")
    WebElement registerlink;
    @FindBy(linkText = "Log in")
    WebElement loginlink;
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
    WebElement computerMenu;
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a")
    WebElement Notebooks;

    public void openRegisterationpage(){
        clicbutton(registerlink);
    }


    public void openLoginPage(){
        clicbutton(loginlink);
    }
    public void selectNotebookMenu(){
        action.moveToElement(computerMenu).moveToElement(Notebooks)
                .click().build().perform();


    }


}

