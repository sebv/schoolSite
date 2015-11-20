package testCases.homeTest;

import appModules.home.HomePageAction;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.*;

/**
 * Created by msiles on 15/05/2015.
 */
public class HomePage_Test extends TestBase {


    @Test(description = "", groups = {"SmokeTest", "HomePage"})
    public void IndexPageReviewTest() throws Exception {
        HomePageAction.loadIndexPage();

        Assert.assertEquals(HomePageAction.indexPageReview(), 4);
    }

    @Test(description = "", groups = {"SmokeTest", "HomePage"})
    public void IndexPDFReviewTest() throws Exception {
        HomePageAction.loadIndexPage();

        Assert.assertTrue(HomePageAction.formFieldsDisplayed());
    }

}
