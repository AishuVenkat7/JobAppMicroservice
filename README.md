# Microservice Architecture

This project demonstrates a microservice architecture using various technologies to ensure scalability, security, and inter-service communication.

## Features

- **Inter-Service Communication**: Implemented using `RestTemplate` and `OpenFeign` for easy and scalable inter-service communication.
- **API Gateway**: Centralized access to the services through an API gateway for efficient routing, load balancing, and security.
- **PostgreSQL**: Each microservice has its own database, with PostgreSQL being used as the relational database for services that require persistence.
- **Spring Security with Keycloak**: Secured using Spring Security with integration to Keycloak for OAuth2-based authentication and authorization.
- **Messaging Queues**: 
  - **RabbitMQ** for message brokering and event-driven architecture.
  - **Kafka** for distributed streaming and handling real-time data feeds.
- **Docker**: Containerized microservices for consistent and isolated runtime environments.
- **Kubernetes**: Deployed and orchestrated on Kubernetes for scaling, load balancing, and ensuring high availability.

---

## Tech Stack

- **Java** (Spring Boot)
- **PostgreSQL** (Database)
- **RabbitMQ** (Message Broker)
- **Docker** (Containerization)
- **Kubernetes** (Container Orchestration)
- **Spring Cloud Gateway** (API Gateway)
- **OpenFeign & RestTemplate** (Inter-service Communication)
- **Keycloak** (Authentication & Authorization)
- **Kafka** (Event Streaming)

---

## Microservices Overview

1. **Company Service**: Handles user-related operations.
2. **Job Service**: Manages customer orders.
3. **Review Service**: Tracks and manages inventory levels.

---


