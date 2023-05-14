package tests;

import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverMenuTest extends TestBase{
HomePage homeObj;

@Test
    public void UserCanHoverAndSelect(){
    homeObj=new HomePage(driver);
    homeObj.selectNotebookMenu();
    Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
}

}
