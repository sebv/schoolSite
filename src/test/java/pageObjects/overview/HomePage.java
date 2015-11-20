package pageObjects.overview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BaseClass;
import utility.Log;
import utility.WebdriverUtils;

import java.util.List;

public class HomePage extends BaseClass {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static WebElement menuBar() throws Exception {
        WebdriverUtils.waitUntilElementIsDisplayed(By.id("MenuBarDiv"));
        return WebdriverUtils.findElement(By.id("MenuBarDiv"));
    }

    public static WebElement lnkOrganization() throws Exception {
        WebdriverUtils.waitUntilElementIsDisplayed(By.cssSelector("div[id='CC_Menu_CurrentOrganizationDiv']>a"));
        return WebdriverUtils.findElement(By.cssSelector("div[id='CC_Menu_CurrentOrganizationDiv']>a"));
    }

    public static WebElement lnkSubOrganization() throws Exception {
        WebdriverUtils.waitUntilElementIsDisplayed(By.id("CurrentWorkingCompanyName"));
        return WebdriverUtils.findElement(By.id("CurrentWorkingCompanyName"));
    }

    public static WebElement barStudy() throws Exception {
        WebdriverUtils.waitUntilElementIsDisplayed(By.id("expanderImage"));
        return WebdriverUtils.findElement(By.id("expanderImage"));
    }

    public static class Menu {

        public static class Overview {
            public static class OverviewPage {
                public static String relativeURL = "/Sponsor/overview/";
            }

        }

    }

}
