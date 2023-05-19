package com.bookstore.services;

import com.bookstore.utulities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class UpdateBook extends Globals {

    public void updateBookNumber(){
        Map<String,Object> map = new HashMap<>();
        map.put("userId",userId);
        map.put("isbn",isbnNumbers.get(1));

       response = RestAssured.given()
               .accept(ContentType.JSON)
               .contentType(ContentType.JSON)
               .header("Authorization", "Bearer "+token)
               .body(map)
               .when().log().all()
               .put("BookStore/v1/Books/" + isbnNumbers.get(0))
               .prettyPeek();
    }
    public void validateThatTheBookIsUpdated(){
        Assert.assertEquals(response.statusCode(),200);

        Assert.assertEquals(userId,response.path("userId"));
        Assert.assertEquals(userName,response.path("username"));
        Assert.assertEquals(isbnNumbers.get(1),response.path("books.isbn[0]"));

    }
}
