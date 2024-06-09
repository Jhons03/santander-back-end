# Santander Back-End 2024
Java RESTful API criada para o bootCamp Santander Back-End 2024


## Principais Tecnologias

Java 17

Spring Boot 3

Spring Data JPA

Postgresql

OpenAPI (Swagger)

Railway

## [Link do Figma](https://www.figma.com/file/0ZsjwjsYlYd3timxqMWlbj/SANTANDER---Projeto-Web%2FMobile?type=design&node-id=1421%3A432&mode=design&t=6dPQuerScEQH0zAn-1)
O Figma foi utilizado para a abstração do domínio desta API, sendo útil na análise e projeto da solução.


## [Link do Deploy da API no Railway](https://santander-back-end-2024.up.railway.app/swagger-ui/index.html)
O Railway foi utilizado para fazer o deploy do bd e da api.

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        -String name
        -Account account
        -Card card
        -Feature[] features
        -News[] news
    }

    class Account {
        -String number
        -String agency
        -String balance
        -String limit
    }

    class Card {
        -String number
        -String limit
    }

    class Feature {
        -String icon
        -String description
    }

    class News {
        -String icon
        -String description
    }

    User "1" *--> "1" Account
    User "1" *--> "1" Card
    User "1" *--> "N" Feature
    User "1" *--> "N" News
```
