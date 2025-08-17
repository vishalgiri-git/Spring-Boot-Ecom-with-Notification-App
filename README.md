# E-commerce Application with Notification Service


A microservices-based application for a modern e-commerce platform. This repository contains the backend services built with Java and Spring Boot, structured as a monorepo.

The system is composed of two main services:
1.  **E-commerce Service**: Handles core business logic like product management, user authentication, shopping cart, and order processing.
2.  **Notification Service**: A dedicated service for sending notifications (like email or SMS) to users in response to events within the platform.

---
### High-Level Architecture Diagram

![Architecture Diagram](images/img.png)


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
