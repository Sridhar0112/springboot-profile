# Student Management System

**Enterprise Spring Boot Application with Multi-Environment Profiles**

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.3-brightgreen)
![Maven](https://img.shields.io/badge/Maven-3.9-orange)
![License](https://img.shields.io/badge/License-MIT-green)

---

## Overview

A robust **Student CRUD Management System** built with Spring Boot 3, demonstrating enterprise-grade practices for configuration management using **Spring Profiles**.

This project showcases how to handle different environments (Development, QA, UAT, Staging, and Production) with clean, maintainable, and secure configurations.

---

## Key Features

- **Multi-Environment Support** using Spring Boot Profiles (`dev`, `qa`, `uat`, `staging`, `prod`)
- **Profile-Specific Configurations** (YAML) and conditional beans (`@Profile`)
- **Structured Logging** with SLF4J + Logback (JSON output, MDC, correlation ID)
- **Environment-Aware Data Initialization**
- **Flyway Database Migrations**
- **Email Service Integration**
- **Externalized Secrets** ready for Docker, Kubernetes, and Cloud platforms

---

## Tech Stack

| Technology              | Version      |
|-------------------------|--------------|
| Java                    | 17           |
| Spring Boot             | 3.5.3        |
| Spring Data JPA         | -            |
| Database                | H2 / PostgreSQL |
| Migration Tool          | Flyway       |
| Logging                 | SLF4J + Logback + Logstash Encoder |
| Build Tool              | Maven        |
| Other                   | Lombok, Validation, Spring Mail |

---

## Quick Start

### 1. Clone the Repository

git clone https://github.com/Sridhar0112/springboot-profile.git
cd springboot-profile

### 2. Run the Application


# Development (Default)
./mvnw spring-boot:run

# Specific Environment
./mvnw spring-boot:run -Dspring.profiles.active=qa
./mvnw spring-boot:run -Dspring.profiles.active=prod

---

## Profiles Configuration

| Profile    | Database       | Log Level | Data Seeding | Use Case                     |
|------------|----------------|-----------|--------------|------------------------------|
| `dev`      | H2 In-memory   | DEBUG     | Yes          | Local Development            |
| `qa`       | H2             | INFO      | Yes          | Quality Assurance            |
| `uat`      | H2             | INFO      | Yes          | User Acceptance Testing      |
| `staging`  | PostgreSQL     | INFO      | No           | Pre-Production               |
| `prod`     | PostgreSQL     | INFO      | No           | Production                   |

**Configuration Files**:
- `application.yml` — Common settings
- `application-{env}.yml` — Environment overrides
- `logback-spring.xml` — Logging configuration
- `db/migration/` — Flyway versioned scripts

---

## API Endpoints

**Base URL**: `http://localhost:8080`

**Student APIs** (`/api/v1/students`)

- `POST /add` — Create student
- `GET /getstudent` — List all students
- `GET /getstudent/{id}` — Get student by ID
- `PUT /update/{id}` — Update student
- `DELETE /delete/{id}` — Delete student

---

## Project Structure


src/main/java/com/sridhar/springboot/
├── Config/
│   ├── ProductionEnvironmentConfig.java
│   └── StudentDataInitializer.java
├── Controller/
├── Service/
├── Repository/
├── Dto/
├── models/
├── Exception/
├── logging/
└── SpringbootApplication.java

src/main/resources/
├── application*.yml
├── logback-spring.xml
└── db/migration/


---

## Production Configuration

Required environment variables for `staging` and `prod`:

env
DB_HOST=your-db-host
DB_PORT=5432
DB_NAME=studentdb
DB_USERNAME=your-username
DB_PASSWORD=your-secure-password


---

## Author

**Sridhar**  
Java Spring Boot Backend Developer (2+ Years Experience)

---

⭐ **If this project helped you, please give it a star!**

---

**Focus Areas**: Spring Profiles | Environment-Specific Configuration | Production-Grade Logging | Enterprise Best Practices
