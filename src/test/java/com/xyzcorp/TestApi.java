package com.xyzcorp;

import io.restassured.http.ContentType;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class TestApi {


    //  {"description":"Tropical fruit","name":"Pineapple"}]
    @Test
    public void testGetZucchini() {
        given()
                .relaxedHTTPSValidation()
                .accept(ContentType.JSON)
                .when()
                .get("https://staging.tiered-planet.net/mild-temper/fruits")
                .then()
                .assertThat()
                .body("[2].name", equalTo("Zucchini"));
    }
}
