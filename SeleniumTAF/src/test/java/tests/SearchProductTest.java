package tests;

import Pages.ProductDetailsPage;
import Pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest extends TestBase{
    String productName="Apple MacBook Pro 13-inch";
    SearchPage searchobj;
    ProductDetailsPage detailsOBj;
    @Test
    public void UserCanSearchProducts(){
        searchobj=new SearchPage(driver);
        detailsOBj=new ProductDetailsPage(driver);
        searchobj.productSearch(productName);
        searchobj.openProductDetailPage();
        Assert.assertTrue(detailsOBj.ProductNameInBreadcrumb.getText().contains("MacBook Pro 13-"));


    }
}
