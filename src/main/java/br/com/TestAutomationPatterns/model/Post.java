package br.com.TestAutomationPatterns.model;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Post {
   private String title;
   private String body;
   private int userId;
}