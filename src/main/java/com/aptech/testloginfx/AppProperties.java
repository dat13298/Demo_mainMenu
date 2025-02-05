package com.aptech.testloginfx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppProperties {
    private static final Properties properties = new Properties();
    private static final String APP_PROPERTIES_FILE = "/app.properties";

    static {
        try {
            InputStream inputStream = AppProperties.class.getResourceAsStream(APP_PROPERTIES_FILE);
            if (inputStream != null) {
                properties.load(inputStream);

            } else {
                System.out.println("can not find" +APP_PROPERTIES_FILE);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static void setProperty(String key, String value) {
        properties.setProperty(key, value);
        try {
            FileOutputStream fos = new FileOutputStream(APP_PROPERTIES_FILE);
            properties.store(fos, null);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
