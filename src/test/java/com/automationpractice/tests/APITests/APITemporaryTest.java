package com.automationpractice.tests.APITests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.assertj.core.api.SoftAssertions;
import org.json.simple.JSONObject;
import org.junit.Test;

public class APITemporaryTest {
    private String WEB_API_URL = "https://qa.flex.cafe";
    private String FLEX_HOST = "porscheadmin.qa.flex.cafe";
    private String AUTHORIZATION = "Bearer 6d5d85448a674ff8997271bad1d329f9";
    private String CONTENT_TYPE = "application/json";
    private SoftAssertions softAssertions;

    @Test
    public void SeveralOrganisationSummary() {
        JSONObject jsonBody = new JSONObject();
        jsonBody.put( "ClientCode", "PCNA");
        jsonBody.put( "OrgIds", new String[]{"Org-1000652", "Org-1000521"});
        Response severalOrganisationSummaryRequest = RestAssured.given().
                header("flex-host", FLEX_HOST).
                header("Authorization", AUTHORIZATION).
                header("Content-Type", CONTENT_TYPE).
                body(jsonBody).
                get(WEB_API_URL + "/api/v1/RewardProgram/GetRewardProgramSummaryBatch");
//        System.out.println(severalOrganisationSummaryRequest.body().prettyPrint());
        softAssertions = new SoftAssertions();
//        JsonPath jsonPathValidator = Response.jsonPath();
//        List<Object> listOfOrgIds = jsonPathValidator.getList("banks.bic");
//        for (Object i : listOfOrgIds) {
//            softAssertions.assertThat(i != null);
//            softAssertions.assertAll();
//        }
    }
}
