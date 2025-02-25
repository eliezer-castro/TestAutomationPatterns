package br.com.TestAutomationPatterns.facade;

import br.com.TestAutomationPatterns.dto.PostDto;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PostFacade {
    private static final String BASE_URI = "https://jsonplaceholder.typicode.com";

     public PostFacade() {
         RestAssured.baseURI = BASE_URI;
         RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
     }

     public Response createPost(PostDto post) {
         return given()
                 .contentType("application/json")
                 .body(post)
                 .when()
                 .post("/posts")
                 .then()
                 .extract()
                 .response();
     }
}
