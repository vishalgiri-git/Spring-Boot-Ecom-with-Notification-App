
-----

```markdown
# E-commerce Application with Notification Service

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Maven](https://img.shields.io/badge/Maven-3.8-red)
![License](https://img.shields.io/badge/License-MIT-yellow)

A microservices-based application for a modern e-commerce platform. This repository contains the backend services built with Java and Spring Boot, structured as a monorepo.

The system is composed of two main services:
1.  **E-commerce Service**: Handles core business logic like product management, user authentication, shopping cart, and order processing.
2.  **Notification Service**: A dedicated service for sending notifications (like email or SMS) to users in response to events within the platform.

---

## 🚀 Features

### E-commerce Service (`/Ecom`)
* 👤 **User Authentication & Authorization**: Secure user registration and login using Spring Security.
* 📦 **Product Catalog**: Functionality to add, update, view, and delete products.
* 🛒 **Shopping Cart**: Manage items in a user's cart.
* 💳 **Order Management**: End-to-end order placement and tracking workflow.
* 📢 **Event-Driven**: Publishes events (e.g., `ORDER_PLACED`) to a Kafka topic.

### Notification Service (`/Notification`)
* 📧 **Email Notifications**: Consumes events from Kafka to send timely emails.
* 📄 **Templated Messages**: Uses templates for different notification types (e.g., Order Confirmation, Shipping Update).
* 🔄 **Decoupled Architecture**: Operates independently of the main E-commerce service, ensuring reliability.

---

## 🛠️ Tech Stack

* **Backend**: Java 17, Spring Boot 3
* **Data**: Spring Data JPA, Hibernate, PostgreSQL / MySQL
* **Messaging Queue**: Apache Kafka
* **Security**: Spring Security
* **Build Tool**: Maven
* **(Frontend)**: React (as indicated by the original project name)

---

## 📦 Project Structure

This is a monorepo containing two independent Spring Boot applications.

```

.
├── Ecom/             \# The core E-commerce Spring Boot application
│   ├── src/
│   └── pom.xml
└── Notification/     \# The Notification Service Spring Boot application
├── src/
└── pom.xml

````

---

## 📋 Prerequisites

Before you begin, ensure you have the following installed on your system:
* **Java Development Kit (JDK)**: Version 17 or later.
* **Apache Maven**: Version 3.8 or later.
* **Database**: An instance of PostgreSQL or MySQL running.
* **Apache Kafka**: A running instance of Kafka and Zookeeper.
* **IDE**: IntelliJ IDEA or VS Code.

---

## ⚙️ Getting Started

### 1. Clone the Repository
```bash
git clone [https://github.com/your-username/Ecom-with-Notification-App.git](https://github.com/your-username/Ecom-with-Notification-App.git)
cd Ecom-with-Notification-App
````

### 2\. Configure Services

You will need to configure the database connection for the E-commerce service and the Kafka connection for both services.

**A. E-commerce Service Configuration**
Open `Ecom/src/main/resources/application.properties` and set your database and Kafka properties:

```properties
# Database Configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce_db
spring.datasource.username=your_db_user
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update

# Kafka Producer Configuration
spring.kafka.producer.bootstrap-servers=localhost:9092
```

**B. Notification Service Configuration**
Open `Notification/src/main/resources/application.properties` and set your Kafka properties:

```properties
# Kafka Consumer Configuration
spring.kafka.consumer.bootstrap-servers=localhost:9092
spring.kafka.consumer.group-id=notification_group
spring.kafka.consumer.auto-offset-reset=earliest

# Add Email configuration if needed (e.g., Spring Mail)
spring.mail.host=smtp.example.com
spring.mail.port=587
spring.mail.username=your_email_user
spring.mail.password=your_email_password
```

### 3\. Build the Applications

Build each microservice using Maven.

```bash
# Build the E-commerce Service
cd Ecom
mvn clean install

# Build the Notification Service
cd ../Notification
mvn clean install
cd ..
```

### 4\. Run the Applications

You can run the services from your IDE by finding the main application class (e.g., `EcomApplication.java`) and running it.

Alternatively, use the command line:

```bash
# Run the E-commerce Service in one terminal
java -jar Ecom/target/ecom-service-0.0.1-SNAPSHOT.jar

# Open a new terminal and run the Notification Service
java -jar Notification/target/notification-service-0.0.1-SNAPSHOT.jar
```

Your services should now be running\! The E-commerce application will likely be available at `http://localhost:8080`.

-----

## 🤝 How It Works

1.  A user performs an action in the E-commerce application (e.g., places an order).
2.  The `Ecom` service processes the request, saves the data to the database, and publishes an `ORDER_PLACED` event to a specific Kafka topic.
3.  The `Notification` service, which is listening to that topic, consumes the event.
4.  Upon receiving the event, the `Notification` service formats and sends a confirmation email to the user.

-----

## 📄 License

This project is licensed under the MIT License.

```
```