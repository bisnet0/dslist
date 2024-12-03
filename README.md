# API de Jogos - Backend em Java (Spring Boot)

## Descrição

API para gerenciamento de jogos utilizando Spring Boot. A API oferece funcionalidades CRUD (Criar, Ler) para listar jogos com informações resumidas.

## Rotas e Endpoints

### 1. Obter Todos os Jogos (GET)
- **Rota:** `/games`
- **Método:** GET
- **Descrição:** Retorna todos os jogos com informações resumidas.
- **Exemplo de Response:**
  ```json
  [
      {
          "id": 1,
          "title": "The Witcher 3",
          "year": 2015,
          "imgUrl": "https://link-imagem.jpg",
          "shortDescription": "Um RPG épico de mundo aberto."
      },
      {
          "id": 2,
          "title": "Cyberpunk 2077",
          "year": 2020,
          "imgUrl": "https://link-imagem.jpg",
          "shortDescription": "Jogo de ação no mundo futurista."
      }
  ]
  ```

## CRUD

- **GET /games:** Retorna todos os jogos com informações resumidas.

### JSON de Response:
```json
[
    {
        "id": 1,
        "title": "The Witcher 3",
        "year": 2015,
        "imgUrl": "https://link-imagem.jpg",
        "shortDescription": "Um RPG épico de mundo aberto."
    },
    {
        "id": 2,
        "title": "Cyberpunk 2077",
        "year": 2020,
        "imgUrl": "https://link-imagem.jpg",
        "shortDescription": "Jogo de ação no mundo futurista."
    }
]
```

## Dependências

Para executar o projeto, você precisa das seguintes dependências:

- **Spring Boot Starter Web:** Para criar a API REST.
- **Spring Boot Starter Data JPA:** Para interagir com o banco de dados.
- **H2 Database (ou outro banco de dados):** Para armazenar os dados.

### Dependências no `pom.xml`

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
</dependencies>
```

## Como Executar

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/bisnet0/dslist-java.git
   ```

2. **Navegue até o diretório do projeto:**
   ```bash
   cd dslist-java
   ```

3. **Execute a aplicação:**
   ```bash
   mvn spring-boot:run
   ```

A API estará disponível no endereço: [http://localhost:8080/games](http://localhost:8080/games).

## Testando a API

Use ferramentas como Postman ou Insomnia, ou comandos cURL para testar os endpoints.

### Exemplo de cURL para obter todos os jogos:
```bash
curl http://localhost:8080/games
```

## Licença

Este projeto está licenciado sob a licença MIT.
