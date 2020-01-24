package com.automationpractice.tests.APITests;

import data.Paths;
import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class APILoginTest {

    @Test
    public void createCookies() {

//        JSONObject json = new JSONObject();
//        json.put("email", "123123@123.com");
//        json.put("passwd", "123123");
//        json.put("back", "my-account");
//        json.put("SubmitLogin", "");


        Response responseMyAccount = RestAssured.given().
                cookies(APIBaseTest.getCookies()).
                get(Paths.BASE_URI + "/index.php?controller=my-account");

        Assert.assertEquals(200, responseMyAccount.getStatusCode());

        String htmlAccount = responseMyAccount.asString();
        XmlPath xmlPath = new XmlPath(XmlPath.CompatibilityMode.HTML, htmlAccount);
        String title = xmlPath.getString("html.head.title");
        Assert.assertEquals("My account - My Store", title);

        Response responseHistory = RestAssured.given().cookies(APIBaseTest.getCookies())
            .get(Paths.BASE_URI + "/index.php?controller=history");
        String htmlHistory = responseHistory.asString();
        XmlPath xmlPath1 = new XmlPath(XmlPath.CompatibilityMode.HTML, htmlHistory);
        String titleHistory = xmlPath1.getString("html.head.title");
        Assert.assertEquals("Order history - My Store", titleHistory);
    }

}
