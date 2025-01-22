# Test Automation Patterns

Este projeto demonstra a implementação de padrões de projeto para automação de testes de API, focando em boas práticas de desenvolvimento e manutenibilidade do código.

## 🏗 Padrões Implementados

### Builder Pattern
O projeto utiliza o Builder Pattern para criar instâncias de objetos de teste de forma fluente e legível:

```java
Post post = new PostBuilder()
    .withTitle("My Title")
    .withBody("My Body")
    .withUserId(1)
    .build();
```

### Factory Pattern
O Factory Pattern é implementado para fornecer diferentes configurações predefinidas de objetos de teste:

```java
Post defaultPost = PostFactory.withDefaultValues().build();
Post randomPost = PostFactory.withRandomValues().build();
Post emptyPost = PostFactory.withEmptyValues().build();
```

## 📚 Estrutura do Projeto

```
br.com.TestAutomationPatterns/
├── builders/
│   └── PostBuilder.java
├── factory/
│   └── PostFactory.java
├── model/
│   └── Post.java
└── tests/
    ├── BadPostApiTest.java
    └── CleanPostApiTest.java
```

## 🛠 Tecnologias Utilizadas

- Java
- REST Assured
- JUnit Jupiter
- JavaFaker
- Lombok
- Gson

## ✨ Características

- Utilização de builders para criação fluente de objetos
- Factory pattern para diferentes cenários de teste
- Geração de dados aleatórios com JavaFaker
- Demonstração de código "sujo" vs código limpo
- Testes de API com REST Assured

## 🧪 Cenários de Teste

O projeto inclui diferentes configurações de teste através do PostFactory:

- `withDefaultValues()`: Valores padrão para testes básicos
- `withRandomValues()`: Dados aleatórios gerados com JavaFaker
- `withEmptyValues()`: Campos vazios para testes negativos
- `withLongContent()`: Conteúdo extenso para testes de limite
- `withSpecialCharacters()`: Caracteres especiais para testes de validação

## 📝 Exemplos de Uso

### Código Limpo (Recomendado)
```java
@Test
public void testCreateUser() {
    Post post = PostFactory.withDefaultValues()
        .withUserId(5)
        .build();
    
    given()
        .body(post)
        .when()
        .post("/posts")
        .then()
        .statusCode(201);
}
```

### Código "Sujo" (Não Recomendado)
```java
@Test
public void testCreateUser() {
    JsonObject post = new JsonObject();
    post.addProperty("title", "title");
    post.addProperty("body", "lorem ipsum");
    post.addProperty("user", 1);
    
    given()
        .body(post.toString())
        .when()
        .post("/posts")
        .then()
        .statusCode(201);
}
```

## 🚀 Como Executar

1. Clone o repositório
2. Instale as dependências Maven
3. Execute os testes com:
```bash
mvn test
```

## 💡 Benefícios

- Código mais limpo e manutenível
- Reutilização de código
- Facilidade na criação de diferentes cenários de teste
- Melhor organização e estrutura do projeto
- Redução de duplicação de código
- Maior legibilidade dos testes

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.