package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase{
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "strong.current-item")
    public WebElement ProductNameInBreadcrumb;
    @FindBy(css = "button.button-2.add-to-compare-list-button")
    WebElement addToCompareBtn;
    public void addProductToCompare(){
        clicbutton(addToCompareBtn);
    }

}
