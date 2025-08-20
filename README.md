# E-commerce Application with Notification Service


A microservices-based application for a modern e-commerce platform. This repository contains the backend services built with Java and Spring Boot, structured as a monorepo.

The system is composed of two main services:
1.  **E-commerce Service**: Handles core business logic like product management, user authentication, shopping cart, and order processing.
2.  **Notification Service**: A dedicated service for sending notifications (like email or SMS) to users in response to events within the platform.

---
### High-Level Architecture Diagram

<img width="1322" height="576" alt="image" src="https://github.com/user-attachments/assets/e8fb3a8a-1c71-4b4d-8d6c-5bd7e2c497d1" />

---

## ⚡ Performance Optimizations

To enhance the scalability and responsiveness of the application, several optimization techniques have been integrated:

- **Pagination**: Efficiently handles large datasets in APIs by limiting the number of records returned per request.
- **Indexing**: Database indexing applied to frequently queried fields to speed up data retrieval.
- **Redis Cache**: Implements caching layer using Redis to reduce database load and improve response times for commonly accessed data.

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
* **Data**: Spring Data JPA, Hibernate, MySQL
* **Messaging Queue**: Apache Kafka
* **Security**: Spring Security
* **Build Tool**: Maven
* **(Frontend)**: React 

---


