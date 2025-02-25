package br.com.TestAutomationPatterns.builders;
import br.com.TestAutomationPatterns.dto.PostDto;

public class PostBuilder {

    private final PostDto post = new PostDto();

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

    public PostDto build() {
        return post;
    }

}
