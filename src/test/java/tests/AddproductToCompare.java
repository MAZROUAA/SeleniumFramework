package tests;

import Pages.ComparePage;
import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class AddproductToCompare extends TestBase {
    String firstProductName="Apple MacBook Pro 13-inch";
    String secondProductName="Asus N551JK-XO076H Laptop";
    //1-search for the 2 products and add to compare
    //2-clear list
    ProductDetailsPage detailsObj;
    HomePage homObj;
    ComparePage CompareObj;
    SearchPage searchObj;
    @Test(priority = 1)
    public void userCanCompareProducts() throws InterruptedException {
        searchObj=new SearchPage(driver);
        CompareObj=new ComparePage(driver);
        detailsObj=new ProductDetailsPage(driver);
        //product 1
        searchObj.productSearchUsingAutoSuggest("Mac");
        detailsObj.addProductToCompare();
        //product 2
        searchObj.productSearch("Asus N551JK-XO076H Laptop");
        Thread.sleep(4000);
        detailsObj.addProductToCompare();
        Thread.sleep(4000);
        //Navigate to compare page
        driver.navigate().to("https://demo.nopcommerce.com/compareproducts");

        CompareObj.compareProducts();
        Thread.sleep(4000);
    }
    @Test(priority = 2)
    public void userClearCompare(){
        CompareObj.clearCompareTable();
    }


}