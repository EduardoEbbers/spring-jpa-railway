# spring-jpa-railway
Projeto em springboot, jpa e railway

## Diagramas de classes

```mermaid

classDiagram
  class User {
    -Long id
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -Long id
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -Long id
    -String icon
    -String description
  }

  
  class Card {
    -Long id
    -String number
    -Number limit
  }

  class News {
    -Long id
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```
