# spring-jpa-railway
Projeto em springboot, jpa e railway

## Diagramas de classes

```mermaid

classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -Account agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  
  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```
