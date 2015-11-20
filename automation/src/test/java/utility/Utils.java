package utility;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by msiles on 4/11/15.
 */
public final class Utils {


    private static Properties properties = new Properties();
    static {
        try {
            properties.load(Utils.class.getResourceAsStream("/emuspar.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    private Utils() {
    }

    public static String getProperty(String property) {
        return properties.getProperty(property);
    }

}
