package se.swedsoft.bookkeeping.app;

import java.io.IOException;
import java.util.ResourceBundle;

/**
 * Class holding constants with version information
 * @version $Id: Version.java 195 2015-05-13 03:26:44Z ellefj $
 */
public final class Version {
    public final static String APP_TITLE = "Fribok";

    public final static String APP_BUILD = buildDateTime();
    public final static String APP_VERSION = version();

    public static String buildDateTime() {
	return ResourceBundle.getBundle("version").getString("build.date");
    }
    public static String version() {
	return ResourceBundle.getBundle("version").getString("version") + "-$Rev: 195 $";
    }

    public final static boolean CAN_DELETE_VOUCHERS = false;

    private Version() {} // prevents instantiation
}
