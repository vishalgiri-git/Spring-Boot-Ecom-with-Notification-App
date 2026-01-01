# 🛒 EcomApplication

A Spring Boot-based e-commerce application that demonstrates a simple backend architecture using Spring Boot, Spring Data JPA, MySQL, and RESTful APIs.

---

## 🚀 Features

- RESTful APIs for product and user management
- MySQL database integration using Spring Data JPA
- HikariCP connection pool
- Auto-restart support with Spring DevTools
- Maven-based project structure
- Environment-specific configurations

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Spring Web**
- **MySQL**
- **HikariCP**
- **Maven**

---

## 🏗️ Project Structure


---

## ⚙️ Getting Started

### 📦 Prerequisites

- Java 17+
- Maven 3.6+
- MySQL or compatible DB

### 🔧 Configuration

Update your database settings in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecomdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
