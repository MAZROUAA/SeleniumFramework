package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
    public Actions action;
   protected WebDriver driver;
    public JavascriptExecutor jse;
    public Select select;

//create constructor
    public  PageBase(WebDriver driver){
        PageFactory.initElements(driver,this);
    }



    protected static void clicbutton(WebElement button){
        button.click();
    }
    protected static void setTextElement(WebElement txtElement,String value){
        txtElement.sendKeys(value);
    }
    public void scrollToBottom(){
        jse.executeScript("scrollBy(0,2500)");

    }

}
