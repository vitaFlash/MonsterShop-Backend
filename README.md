# MonsterShop-Backend

A Spring Boot backend for managing products and reviews in an online shop.

## Features

- RESTful API for products and reviews
- Data validation and DTO mapping
- JPA/Hibernate integration with SQL database

## Technologies

- Java
- Spring Boot
- Maven
- JPA/Hibernate
- SQL

## Getting Started

### Prerequisites

- Java 17+
- Maven
- SQL database (e.g., PostgreSQL, MySQL)

### Setup

1. Clone the repository: git clone git@github.com:vitaFlash/MonsterShop-Backend.git cd MonsterShop-Backend
2. Configure your database in `src/main/resources/application.properties`.
3. Build and run the application: mvn spring-boot:run

## API Endpoints
### **Gestión de Productos**
`GET /api/products`
`GET /api/products/{id}`
### **Gestión de Reseñas**
`GET /api/reviews/{productId}`
`POST /api/reviews`
### **Gestión del Administrador**
`GET /api/products`
`GET /api/products/{id}`
`POST /api/products`
`PUT /api/products/{id}`
`DELETE /api/products/{id}`

## Project Structure

- `controllers/` — REST controllers
- `dtos/` — Data transfer objects
- `services/` — Business logic
- `entities/` — JPA entities
- `repositories/` — Data access

## License

MIT