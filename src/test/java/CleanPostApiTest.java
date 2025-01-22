import br.com.TestAutomationPatterns.factory.PostFactory;
import br.com.TestAutomationPatterns.model.Post;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class CleanPostApiTest {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void testCreateUser() {
       Post post = PostFactory.withDefaultValues().withUserId(5).build();

       given()
                .body(post)
                .when()
                .post("/posts")
                .then()
                .statusCode(201);
    }

}
