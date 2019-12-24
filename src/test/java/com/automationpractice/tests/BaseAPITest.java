package com.automationpractice.tests;

import data.Paths;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

public abstract class BaseAPITest {
    static String key;

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = Paths.BASE_URI;
        RestAssured.basePath = Paths.BASE_PATH;
        key = Paths.KEY;
    }

}
