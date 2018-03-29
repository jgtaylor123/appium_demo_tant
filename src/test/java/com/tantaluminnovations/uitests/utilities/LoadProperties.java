package com.tantaluminnovations.uitests.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {
    public String getPropertyValue(String propertyFile, String propertyValue) {
        Properties properties = new Properties();
        InputStream inputStream = null;
        try {
            inputStream = getClass().getClassLoader().getResourceAsStream(propertyFile);
            properties.load(inputStream);
        } catch (IOException e) {
            System.out.println("Properties file '" + propertyFile + "' not found.");
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return properties.getProperty(propertyValue);
    }
}
