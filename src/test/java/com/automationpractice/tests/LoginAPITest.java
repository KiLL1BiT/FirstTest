package com.automationpractice.tests;

import data.Paths;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Test;

import java.util.Collection;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class LoginAPITest extends BaseAPITest {


    @Test
    public void login() {
//       int status = given().when().get(Paths.BASE_URI).then().extract().response().statusCode();
//        Assert.assertEquals(status, 200);

        Collection<String> cookies = given().
                param("email", "123123@123.com").
                param("passwd", "123123").
                param("back", "my-account").
                param("SubmitLogin", "").
                when().get(Paths.BASE_URI + "/index.php?controller=authentication").getCookies().values();
        System.out.println(cookies);

    }
    public Map<String, String> cookies;
    @Test
    public void createCookies() {

        JSONObject json = new JSONObject();
        json.put("email", "123123@123.com");
        json.put("passwd", "123123");
//        json.put("back", "my-account");
//        json.put("SubmitLogin", "");

        Response response = RestAssured.given()
                .body(json)
                .post(Paths.BASE_URI + "/index.php?controller=authentication");
        System.out.println(response.getStatusCode());
         cookies = response.getCookies();
        System.out.println(cookies);


        Response responseHistory = RestAssured.given().cookies(cookies)
                .get(Paths.BASE_URI + "/index.php?controller=history");
        System.out.println(responseHistory.prettyPrint());
        System.out.println(responseHistory.getStatusCode());

    }

//    @Test
//    public void auth() {
//        Response responseHistory = RestAssured.given().cookies(cookies)
//            .get(Paths.BASE_URI + "/index.php?controller=history");
//        System.out.println(responseHistory.getBody());
//        System.out.println(responseHistory.getStatusCode());
//    }
}
