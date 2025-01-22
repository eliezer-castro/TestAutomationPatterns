package br.com.TestAutomationPatterns.builders;
import br.com.TestAutomationPatterns.model.Post;
import com.github.javafaker.Faker;

public class PostBuilder {
        
    private final Post post;
    private final Faker faker = new Faker();

    public PostBuilder() {
        post = new Post();
    }

    public PostBuilder withTitle(String title) {
        post.setTitle(title);
        return this;
    }

    public PostBuilder withBody(String body) {
        post.setBody(body);
        return this;
    }

    public PostBuilder withUserId(int userId) {
        post.setUserId(userId);
        return this;
    }

    public Post build() {
        return post;
    }

}
