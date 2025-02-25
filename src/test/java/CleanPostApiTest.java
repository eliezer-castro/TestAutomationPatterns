import br.com.TestAutomationPatterns.facade.PostFacade;
import br.com.TestAutomationPatterns.factory.PostFactory;
import br.com.TestAutomationPatterns.dto.PostDto;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class CleanPostApiTest {
    private static PostFacade postFacade;

    @BeforeAll
    public static void setup() {
        postFacade = new PostFacade();
    }

    @Test
    public void testCreatePost() {
        PostDto post = PostFactory.
                withDefaultValues()
                .build();

        postFacade.createPost(post).then().statusCode(201);
    }
}
