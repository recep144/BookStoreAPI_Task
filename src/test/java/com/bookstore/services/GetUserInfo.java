package com.bookstore.services;

import com.bookstore.utulities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

public class GetUserInfo extends Globals {

    public void getUserInformation(){
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer " + token)
                .when().log().all()
                .get("/Account/v1/User/" + userId)
                .prettyPeek();

    }

    public void validateThatUserInformationIsCorrect(){
        Assert.assertEquals(response.statusCode(),200);

        Assert.assertEquals(userId,response.path("userId"));
        Assert.assertEquals(userName,response.path("username"));
        Assert.assertEquals(isbnNumbers.get(0),response.path("books.isbn[0]"));

    }


}
