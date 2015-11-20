package appModules.home;

import org.openqa.selenium.By;
import utility.*;

public class HomePageAction {

    public static void loadIndexPage() throws Exception {
        Log.info("---------------------------------------------------------------------", true);
        Log.info("Review Index Page", true);
        WebdriverUtils.goToURL("index.aspx");

        WebdriverUtils.waitUntilInstancesAreMoreThan(By.cssSelector(".art-layout-cell.layout-item-2>h2>span"), 3);
    }

    public static int indexPageReview() throws Exception {
        Log.info("---------------------------------------------------------------------", true);
        Log.info("Review Index Page", true);

        return WebdriverUtils.findElements(By.cssSelector(".art-layout-cell.layout-item-2>h2>span")).size();
    }

    public static boolean formFieldsDisplayed() throws Exception {
        try {
            Log.info("---------------------------------------------------------------------", true);
            Log.info("Review Form Fields", true);
            WebdriverUtils.waitUntilElementIsDisplayed(By.id("ContentPlaceHolder4_ctrlgeneralMenuSuscripcion_bntRegistrar"));

            WebdriverUtils.findElement(By.id("ContentPlaceHolder4_ctrlgeneralMenuSuscripcion_txtNombre")).isDisplayed();
            WebdriverUtils.findElement(By.id("ContentPlaceHolder4_ctrlgeneralMenuSuscripcion_txtApellidos")).isDisplayed();
            WebdriverUtils.findElement(By.id("ContentPlaceHolder4_ctrlgeneralMenuSuscripcion_txtCorreoRegistro")).isDisplayed();
            WebdriverUtils.findElement(By.id("datepicker")).isDisplayed();
            WebdriverUtils.findElement(By.id("ContentPlaceHolder4_ctrlgeneralMenuSuscripcion_bntRegistrar")).isDisplayed();

            return true;
        }
        catch(Exception ex) {
            throw new Exception("There is an error loading the form fields. " + ex.getMessage());
        }
    }

}
