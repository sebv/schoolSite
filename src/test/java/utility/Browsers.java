package utility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by msiles on 4/11/15.
 */
public final class Browsers {
    private static Map<String, String> browsersList = new HashMap<>();
    private static String browser;

    static {
        browsersList.put("ie9", "IE9");
        browsersList.put("ie10", "IE10");
        browsersList.put("ie11", "IE11");
        browsersList.put("firefox", "Firefox");
        browsersList.put("chrome", "Chrome");
        browsersList.put("safari", "Safari");
        browsersList.put("saucelabs", "Saucelabs");
    }

    private Browsers() {
    }

    public static String get() {
        System.out.println("AKAK0");
        browser = System.getenv("browser");
        System.out.println("AKAK1 " + browser);
        String ret = browsersList.get(browser == null ? Utils.getProperty("api.browser") : browser).toLowerCase();
        System.out.println("AKAK2 " + ret);
        return ret;
    }

    public static String get(String environment) {
        return browsersList.get(environment.toLowerCase());
    }

    public static void set(String environment) {
        Browsers.browser = environment;
    }
}
