package com.epam.supplyon.Utils;

public class TestConfig {
    public static String getApplicationUrl(){
//        return System.getProperty("sut.url");
        return Config.getProperty("sut.url");
    }


}