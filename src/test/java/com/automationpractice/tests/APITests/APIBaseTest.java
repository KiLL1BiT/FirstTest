package com.automationpractice.tests.APITests;

import data.Paths;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;

import java.util.Map;

public abstract class APIBaseTest {

    @Before
    public static Map<String, String> getCookies() {
        Response response = RestAssured.
                given().
                param("email", "123123@123.com").
                param("passwd", "123123").
                param("back", "my-account").
                param("SubmitLogin", "").
                post(Paths.BASE_URI + "/index.php?controller=authentication");
        Map<String, String> cookies = response.getCookies();
        return cookies;
    }
}
