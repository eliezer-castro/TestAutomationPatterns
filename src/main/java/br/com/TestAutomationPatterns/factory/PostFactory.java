package br.com.TestAutomationPatterns.factory;

import br.com.TestAutomationPatterns.builders.PostBuilder;
import com.github.javafaker.Faker;




public class PostFactory {


    private static final Faker faker = new Faker();

    public static PostBuilder withDefaultValues() {
        return new PostBuilder()
                .withTitle("My Title")
                .withBody("My Body")
                .withUserId(1);
    }

    public static PostBuilder withRandomValues() {
        return new PostBuilder()
                .withTitle(faker.lorem().sentence())
                .withBody(faker.lorem().paragraph())
                .withUserId(faker.number().numberBetween(1, 100));
    }

    public static PostBuilder withEmptyValues() {
        return new PostBuilder()
                .withTitle("")
                .withBody("")
                .withUserId(1);
    }

    public static PostBuilder withLongContent() {
        return new PostBuilder()
                .withTitle(faker.lorem().paragraph())
                .withBody(faker.lorem().paragraphs(5).toString())
                .withUserId(1);
    }

    public static PostBuilder withSpecialCharacters() {
        return new PostBuilder()
                .withTitle("!@#$%^&*()")
                .withBody("çãéêîõ")
                .withUserId(1);
    }


}
