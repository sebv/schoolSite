package utility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by msiles on 4/11/15.
 */
public final class Environments {
    private static Map<String, String> envs = new HashMap<>();
    private static String environment;

    static {
        envs.put("qa", "http://www.emuspar.com/");
    }

    private Environments() {
    }

    public static String get() {
        environment = System.getenv("server");
        System.out.println("Server Env Value: " + System.getenv("server"));
        System.out.println("Environment Value: " + environment);
        return envs.get(environment == null ? Utils.getProperty("api.environment").toLowerCase() : environment);
    }

    public static String get(String environment) {
        return envs.get(environment);
    }

    public static void set(String environment) {
        Environments.environment = environment;
    }
}
