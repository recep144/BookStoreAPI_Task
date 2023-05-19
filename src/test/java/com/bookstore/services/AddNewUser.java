package com.bookstore.services;

import com.bookstore.utulities.Globals;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class AddNewUser extends Globals {

    Faker faker = new Faker();

    public void addNewUser(){
        userName = faker.name().fullName();
        password = "Abc.!1"+ faker.internet().password();

        Map<String,String> map = new HashMap<>();
        map.put("userName",userName);
        map.put("password",password);

        response = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(map)
                .when().log().all()
                .post("/Account/v1/User")
                .prettyPeek();
    }

    public void validateThatUserIsAdded(){
        Assert.assertEquals(response.statusCode(),201);

        Assert.assertNotNull(response.path("userID"));

        Assert.assertEquals(userName,response.path("username"));

        userId = response.path("userID");

    }

}
