package com.bookstore.services;

import com.bookstore.utulities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class DeleteBook extends Globals {

    public void deleteFirstBook(){

        Map<String,Object> map = new HashMap<>();
        map.put("isbn",isbnNumbers.get(1));
        map.put("userId",userId);

        response = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer "+token)
                .body(map)
                .when().log().all()
                .delete("/BookStore/v1/Book")
                .prettyPeek();
    }
    public void validateThatTheBookIsDeleted(){
        Assert.assertEquals(response.statusCode(),204);


    }

}
