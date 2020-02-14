package com.automationpractice.tests.APITests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Test;

public class APITemporaryTest {
    private String WEB_API_URL = "https://qa.flex.cafe";
    private String FLEX_HOST = "porscheadmin.qa.flex.cafe";

    private String AUTHORIZATION = "Bearer 6d5d85448a674ff8997271bad1d329f9";
    private String USER_ID = "AppUser-22m23dptag222smv";
    private String ENVIRONMENT_KEY = "QA-86db6a00f2c14a75be416e36174d7f53";
    private String CONTENT_TYPE = "application/json";

//    private static String ClientCode = "PCNA";
//    private static String OrgIds = "Org-1000521";

    @Test
    public void SeveralOrganisationSummary() {
        JSONObject jsonBody = new JSONObject();
        jsonBody.put( "ClientCode", "PCNA");
        jsonBody.put( "OrgIds", new String[]{"Org-1000652", "Org-1000521"});
        Response severalOrganisationSummaryRequest = RestAssured.given().
                header("flex-host", FLEX_HOST).
                header("Authorization", AUTHORIZATION).
                header("Content-Type", CONTENT_TYPE).
//                param("ClientCode", ClientCode).
//                param("OrgIds", OrgIds).
                body(jsonBody).
                get(WEB_API_URL + "/api/v1/RewardProgram/GetRewardProgramSummaryBatch");
        System.out.println(severalOrganisationSummaryRequest.body().prettyPrint());
    }
}
