package com.bookstore.services;

import com.bookstore.utulities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class GenerateToken extends Globals {

    public void generateToken(){

        Map<String,String> map = new HashMap<>();
        map.put("userName", userName);
        map.put("password", password);

        response = RestAssured
                .given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(map)
                .when().log().all()
                .post("/Account/v1/GenerateToken")
                .prettyPeek();
    }

    public void validateThatTheTokenIsGenerated(){
        Assert.assertEquals(response.statusCode(),200);
        Assert.assertNotNull(response.path("token"));
        Assert.assertEquals(response.path("status"),"Success");
        Assert.assertEquals(response.path("result"), "User authorized successfully.");
        token = response.path("token");
    }

}