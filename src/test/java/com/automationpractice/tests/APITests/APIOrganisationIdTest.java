package com.automationpractice.tests.APITests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.assertj.core.api.SoftAssertions;
import org.json.simple.JSONObject;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class APIOrganisationIdTest extends APIBaseTest {
    private String WEB_API_URL = "https://qa.flex.cafe";
    private String FLEX_HOST = "porscheadmin.qa.flex.cafe";
    private String AUTHORIZATION = "Bearer 6d5d85448a674ff8997271bad1d329f9";
    private String CONTENT_TYPE = "application/json";
    private SoftAssertions softAssertions;
    List<String> OrgIds = Arrays.asList(new String[]{"Org-1000652", "Org-1000521"});

    @Test
    public void SeveralOrganisationSummary() {
        JSONObject jsonBody = new JSONObject();
        jsonBody.put("ClientCode", "PCNA");
        jsonBody.put("OrgIds", OrgIds);
        Response severalOrganisationSummaryRequest = RestAssured.given().
                header("flex-host", FLEX_HOST).
                header("Authorization", AUTHORIZATION).
                header("Content-Type", CONTENT_TYPE).
                body(jsonBody).
                get(WEB_API_URL + "/api/v1/RewardProgram/GetRewardProgramSummaryBatch");
        softAssertions = new SoftAssertions();
        JsonPath jsonPathValidator = severalOrganisationSummaryRequest.jsonPath();
        List<Object> jsonPathValidatorList = jsonPathValidator.getList("orgSummaries.rewardProgramParticipation.participatingOrgId");
        for (int i = 0; i < jsonPathValidatorList.size(); i++) {
            softAssertions.assertThat(OrgIds.get(i) == jsonPathValidatorList.get(i));
        }
        softAssertions.assertAll();
    }
}
