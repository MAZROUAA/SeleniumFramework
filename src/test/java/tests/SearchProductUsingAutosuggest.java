package tests;

import Pages.ProductDetailsPage;
import Pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductUsingAutosuggest extends TestBase{
    SearchPage searchobj;
    String productName="Apple MacBook Pro 13-inch";
    ProductDetailsPage detailsOBj;
    @Test
    public void userSearchUsingAutosuggest() throws InterruptedException {
        searchobj=new SearchPage(driver);
        searchobj.productSearchUsingAutoSuggest("MAC");
        detailsOBj=new ProductDetailsPage(driver);
        Assert.assertEquals(detailsOBj.ProductNameInBreadcrumb.getText(),productName);

    }
}
