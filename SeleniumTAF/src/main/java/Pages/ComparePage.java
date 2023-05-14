package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparePage extends PageBase{
    public ComparePage(WebDriver driver) {
        super(driver);
    }
    @FindBy (css ="a.clear-list")
    WebElement ClearListBtn;
    @FindBy (css ="table.compare-products-table")
    WebElement CompareTable;

    public void clearCompareTable(){
        clicbutton(ClearListBtn);
    }
    public void compareProducts(){
        System.out.println(CompareTable.getText());

    }


}
