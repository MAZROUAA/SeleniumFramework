package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends PageBase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "small-searchterms")
    WebElement searchTxtbox;
    @FindBy(css = "button.button-1.search-box-button")
    WebElement searchBtn;
    @FindBy(id="ui-id-1")
   List< WebElement> AutocompleteList;
    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    WebElement productTitle;
    public void productSearch(String productName){
        setTextElement(searchTxtbox,productName);
        clicbutton(searchBtn);
    }
    public void openProductDetailPage()
    {
        clicbutton(productTitle);
    }

    public void productSearchUsingAutoSuggest(String searchtxt) throws InterruptedException {
        setTextElement(searchTxtbox,searchtxt);
        Thread.sleep(3000);
        AutocompleteList.get(0).click();
    }

}



