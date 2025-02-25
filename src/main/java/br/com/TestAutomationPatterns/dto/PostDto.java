package br.com.TestAutomationPatterns.dto;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PostDto {
   private String title;
   private String body;
   private int userId;
}