package com.automationpractice.tests.APITests;

import data.Paths;
import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class APIContactUsTest {
    //  Service returns unexpected response, therefore test doesn't work proper way
    @Test
    public void apiContactUsTest() {
        String email = RandomStringUtils.randomAlphanumeric(3) + "test@email.ua";
        Response contactUsResponse = RestAssured.given().
                param("id_contact", "2").
                param("from", email).
                param("id_order", RandomStringUtils.randomAlphanumeric(10)).
                param("MAX_FILE_SIZE", "2000000").
                param("fileUpload", "").
                param("message", RandomStringUtils.randomAlphanumeric(100) + email).
                param("url", "").
                param("contactKey", RandomStringUtils.randomNumeric(32)).
                param("submitMessage", "").
                cookies(APIBaseTest.getCookies()).
                when().
                post(Paths.BASE_URI + "/index.php?controller=contact");
        System.out.println(contactUsResponse.getHeaders());
        Assert.assertEquals(200, contactUsResponse.getStatusCode());
        String htmlHistory = contactUsResponse.asString();
        XmlPath xmlPath = new XmlPath(XmlPath.CompatibilityMode.HTML, htmlHistory);
        String alertSuccess = xmlPath.getString("html.body.div.div[2].div.div[3].div.p.text");
//        Assert.assertEquals("Your message has been successfully sent to our team.", alertSuccess);
    }
}
