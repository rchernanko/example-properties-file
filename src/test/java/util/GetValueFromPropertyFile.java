package util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public abstract class GetValueFromPropertyFile {

    public static String getValueFromPropertyFile() {
        Properties properties = new Properties();
        String webDriver;
        InputStream input;
        try {
            input = new FileInputStream("test.properties");
            properties.load(input);
            webDriver = properties.getProperty("webdriver");
        } catch (Exception e) {
            webDriver = "chrome";
        }

        return webDriver;
    }
}