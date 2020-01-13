package com.automationpractice.tests;

import data.Paths;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class APIRegistrationTest {

    private String getRandom() {
        return RandomStringUtils.randomAlphabetic(10);
    }

    @Test
    public void registrationAPITest() {
        String email_create = RandomStringUtils.randomAlphanumeric(6) + "test@email.ua";
//        Response responseRegistration0 = RestAssured.given().
//                param("controller", "authentication").
//                param("SubmitCreate", "1").
//                param("ajax", "true").
//                param("email_create", email_create).
//                param("back", "history").
//                param("token", "ce65cefcbafad255f0866d3b32d32058").
//                post(Paths.BASE_URI + "/index.php");
//        Assert.assertEquals(200, responseRegistration0.getStatusCode());
        String firstname = getRandom();
        String lastname = getRandom();
        Response responseRegistration = RestAssured.given().
                param("id_gender", "1").
                param("customer_firstname", firstname).
                param("customer_lastname", lastname).
                param("email", email_create).
                param("passwd", "password").
                param("days", RandomStringUtils.randomNumeric(1)).
                param("months", RandomStringUtils.randomNumeric(1)).
                param("years", "1994").
                param("firstname", firstname).
                param("lastname", lastname).
                param("company", "").
                param("address1", getRandom()).
                param("address2", "").
                param("city", getRandom()).
                param("id_state", "13").
                param("postcode", RandomStringUtils.randomNumeric(5)).
                param("id_country", "21").
                param("other", "").
                param("phone", "").
                param("phone_mobile", "+" + RandomStringUtils.randomNumeric(12)).
                param("alias", "My address").
                param("dni", "").
                param("email_create", "1").
                param("is_new_customer", "1").
                param("back", "my-account").
                param("submitAccount", "").
                post(Paths.BASE_URI + "/index.php?controller=authentication");
        System.out.println(responseRegistration.prettyPrint());
        Assert.assertEquals(302, responseRegistration.getStatusCode());

        Response responseRegistration2 = RestAssured.given().
                param("controller", "my-account").
                get(Paths.BASE_URI + "/index.php?controller=my-account");
        Assert.assertEquals(200, responseRegistration2.getStatusCode());
    }
}
