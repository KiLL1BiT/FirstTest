package com.automationpractice.helpers;

import com.automationpractice.tests.APIBaseTest;

import java.util.Map;

public class CookiesForSelenium {

    public static String getCookiesName(){
        Map<String, String> cookiesAPI = APIBaseTest.getCookies();

        String name = cookiesAPI.keySet().stream().findFirst().get();
        return name;

    }
    public static String getCookiesValue(){
        Map<String, String> cookiesAPI = APIBaseTest.getCookies();

        String value = cookiesAPI.values().stream().findFirst().get();
        return value;
    }
}