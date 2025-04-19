# 🛠️ Product Management REST API with Spring Boot

This project is a fully functional **RESTful API** built using **Spring Boot** that allows users to perform CRUD operations on a collection of products. It follows best practices including DTO usage, layered architecture, validation, and centralized exception handling.

---

## ✨ Features

- ✅ Create, Read, Update, and Delete products.
- 🔐 Uses DTOs to separate internal models from external requests/responses.
- 📏 Field-level validation using annotations and custom validators.
- ⚠️ Global exception handling with descriptive, structured error responses.
- 🧼 Clean and scalable codebase following layered architecture.

---

## 📦 Tech Stack

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 Database (in-memory)
- Lombok
- Jakarta Validation


com.example.product_api
│
├── controller           # REST controllers handling API requests
│   └── ProductController.java
├── service              # Business logic and service layer
│   └── ProductService.java
│   └── ProductServiceImpl.java
├── repository           # Spring Data JPA repositories
│   └── ProductRepository.java
├── dto                  # Data Transfer Objects (Request/Response)
│   └── ProductRequestDTO.java
│   └── ProductResponseDTO.java
├── entity               # JPA Entity classes (representing DB tables)
│   └── Product.java
├── exception            # Custom exceptions and global error handling
│   └── ProductNotFoundException.java
│   └── GlobalExceptionHandler.java
├── utils                # Utility classes like Mappers
│   └── ProductMapper.java
├── ProductApiApplication.java # Main class to run the Spring Boot application
└── resources
    ├── application.properties


🚀 How to Run the Application
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




