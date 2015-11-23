package utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.lang.reflect.Method;

/**
 * Created by moisessiles on 4/29/15.
 */
public class TestBase {
    public static WebDriver driver;

    /**
     * Stop the standard test tearDown from being processed as we only want to stop the browser at the end of the suite
     */
    @AfterMethod(alwaysRun = true)
    public static void tearDown() {
        try {
            if (driver != null) {
                try {
                    driver.quit();
                } catch (Exception x) {
                    Log.error("Did not manage to quit driver object cleanly: " + x.getMessage());
                }
            }
        } catch (Exception x) {
            Log.error("Error Quitting Browser: " + x.getMessage());
            Log.error("Killing Selenium!");
            Runtime.getRuntime().halt(1);
        }
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp(Method method) throws Exception {
        Log.info("---------------------------------------------------------------------", true);
        Log.info("Executing Setup Method");
        Log.info("Executing Test: " + method.getName(), true);
        WebdriverUtils.setTestName(method.getName());
        driver = WebdriverUtils.openBrowser();
    }

}
