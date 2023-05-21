package org.tsegelnikova.util;

import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;

public class ParsingUtil {
    private static final ISettingsFile config = new JsonSettingsFile("Config.json");
    private static final ISettingsFile testData = new JsonSettingsFile("TestData.json");

    private ParsingUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static String getConfigParamByName(String name) {
        return config.getValue(name).toString();
    }

    public static String getTestDataByName(String name) {
        return testData.getValue(name).toString();
    }
}
