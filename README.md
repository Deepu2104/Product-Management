#  Product Management REST API with Spring Boot

![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green?logo=spring)
![Java](https://img.shields.io/badge/Java-21-blue?logo=java)

A fully functional **RESTful API** built using **Spring Boot** that allows CRUD operations on products. Follows best practices including DTO usage, layered architecture, validation, and centralized exception handling.

##  Features

-  Full CRUD operations for products
-  DTO pattern implementation for request/response separation
-  Comprehensive field validation with custom error messages
-  Global exception handling with consistent error responses
-  Clean, layered architecture following SOLID principles
-  H2 in-memory database for easy development

## Tech Stack

- **Backend**: Spring Boot 3.x, Spring Web, Spring Data JPA
- **Database**: H2 (in-memory)
- **Validation**: Jakarta Validation
- **Utilities**: Lombok, MapStruct (for mapping)
- **Build Tool**: Maven

##  Project Structure

```bash
com.example.product_api
├── config/                # Configuration classes
├── controller/            # REST controllers
│   └── ProductController.java
├── service/               # Business logic layer
│   ├── ProductService.java
│   └── impl/ProductServiceImpl.java
├── repository/            # Data access layer
│   └── ProductRepository.java
├── dto/                   # Data transfer objects
│   ├── request/ProductRequestDTO.java
│   └── response/ProductResponseDTO.java
├── entity/                # JPA entities
│   └── Product.java
├── exception/             # Exception handling
│   ├── ProductNotFoundException.java
│   └── handler/GlobalExceptionHandler.java
├── mapper/                # Object mapping
│   └── ProductMapper.java
├── validation/            # Custom validations
│   └── ValidPrice.java
└── ProductApiApplication.java  # Main application class


### How to Run the Application
Prerequisites
JDK 17+ installed on your system

Maven or Gradle for building the project

IDE like IntelliJ IDEA or Eclipse (optional)

If you're using a command line, ensure Git and Maven are installed.

Step 1: Clone the repository
git clone https://github.com/your-username/product-api.git
cd product-api

Step 2: Build the project
./mvnw clean install

Step 3: Run the application
./mvnw spring-boot:run

Postman Collection or CURL Commands

1. Create a product (POST /api/products)
curl -X POST http://localhost:8080/api/products \
-H "Content-Type: application/json" \
-d '{"name": "Laptop", "description": "Gaming Laptop", "price": 1499.99}'

Response:

{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 1499.99
}

2. Get all products (GET /api/products)
curl http://localhost:8080/api/products

Response:

[
  {
    "id": 1,
    "name": "Laptop",
    "description": "Gaming Laptop",
    "price": 1499.99
  }
]


3. Get product by ID (GET /api/products/{id})
   curl http://localhost:8080/api/products/1

Response:

{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 1499.99
}


4. Update product (PUT /api/products/{id})
   curl -X PUT http://localhost:8080/api/products/1 \
-H "Content-Type: application/json" \
-d '{"name": "Updated Laptop", "description": "Updated Gaming Laptop", "price": 1299.99}'

Response:

{
  "id": 1,
  "name": "Updated Laptop",
  "description": "Updated Gaming Laptop",
  "price": 1299.99
}

5. Delete product by ID (DELETE /api/products/{id})
curl -X DELETE http://localhost:8080/api/products/1

{
  "message": "Product with ID 1 deleted successfully."
}

6. Handling Invalid Data (Bad Request Example)
 curl -X POST http://localhost:8080/api/products \
-H "Content-Type: application/json" \
-d '{"description": "No name product", "price": 100.00}'

Response:

{
  "timestamp": "2025-04-20T16:00:00",
  "status": 400,
  "error": {
    "name": "must not be blank"
  }
}




