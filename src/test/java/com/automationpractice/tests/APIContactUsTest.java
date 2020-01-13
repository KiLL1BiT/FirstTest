package com.automationpractice.tests;

import data.Paths;
import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class APIContactUsTest {

    @Test
    public void apiContactUsTest() {
        String email = RandomStringUtils.randomAlphanumeric(3) + "test@email.ua";
        Response contactUsResponse = RestAssured.given().
//                header("controller","contact").
                param("id_contact", "2").
                param("from", email).
                param("id_order", RandomStringUtils.randomAlphanumeric(10)).
                param("MAX_FILE_SIZE", "2000000").
                param("fileUpload", "(binary)").
                param("message", RandomStringUtils.randomAlphanumeric(100) + email).
                param("url", "").
                param("contactKey", "e05ed44d77d6f3ca33ea3201d6c5bef0").
                param("submitMessage", "").
//                cookies(APIBaseTest.getCookies()).
                when().
                post(Paths.BASE_URI + "/index.php?controller=contact")
                .thenReturn();
        Assert.assertEquals(200, contactUsResponse.getStatusCode());
//        Response getContactUsResponse = RestAssured.given().
//                get(Paths.BASE_URI + "/index.php?controller=contact");
        String htmlHistory = contactUsResponse.asString();
        XmlPath xmlPath = new XmlPath(XmlPath.CompatibilityMode.HTML, htmlHistory);
        String alertSuccess = xmlPath.getString("html.body.div.div[2].div.div[3].div.p.text");
//        Assert.assertEquals("Your message has been successfully sent to our team.", alertSuccess);
        System.out.println(contactUsResponse.prettyPrint());
    }
}
