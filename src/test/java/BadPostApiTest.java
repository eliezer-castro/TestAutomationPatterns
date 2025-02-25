import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class BadPostApiTest {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void testCreatePost() {
        JsonObject post = new JsonObject();
        post.addProperty("title", "title");
        post.addProperty("body", "lorem ipsum");
        post.addProperty("user", 1);

        given().contentType("application/json")
                .body(post.toString())
                .when()
                .post("/posts")
                .then()
                .statusCode(201);
    }
}