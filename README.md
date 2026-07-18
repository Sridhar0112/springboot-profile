# Student Management System

**Enterprise Spring Boot Application with Multi-Environment Profiles**

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.3-brightgreen)
![Maven](https://img.shields.io/badge/Maven-3.9-orange)
![License](https://img.shields.io/github/license/Sridhar0112/springboot-profile)
![Last Commit](https://img.shields.io/github/last-commit/Sridhar0112/springboot-profile)
![Repo Size](https://img.shields.io/github/repo-size/Sridhar0112/springboot-profile)

---

## Table of Contents

- [Overview](#overview)
- [Key Features](#key-features)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
- [Profiles Configuration](#profiles-configuration)
- [Project Structure](#project-structure)
- [API Endpoints](#api-endpoints)
- [Production Setup](#production-setup)
- [Author](#author)

---

## Overview

A robust **Student CRUD Management System** built with Spring Boot 3, demonstrating enterprise best practices for **configuration management using Spring Profiles**.

The application supports different runtime environments (Development, QA, UAT, Staging, and Production) with clean separation of concerns, profile-specific beans, and production-ready logging using SLF4J.

---

## Key Features

- Multi-environment configuration using Spring Boot Profiles
- Profile-specific YAML configurations and `@Profile` beans
- Structured JSON logging with SLF4J + Logback
- Conditional data seeding for non-production environments
- Flyway database migrations
- Email service integration
- Externalized configuration ready for Docker/Kubernetes

---

## Tech Stack

- **Java**: 17
- **Framework**: Spring Boot 3.5.3
- **Database**: H2 (Dev/QA/UAT) | PostgreSQL (Staging/Prod)
- **Migration**: Flyway
- **Logging**: SLF4J + Logback + Logstash Encoder
- **Build Tool**: Maven
- **Others**: Lombok, Validation, Spring Mail, AOP

---

## Getting Started

### Clone & Run

```bash
git clone https://github.com/Sridhar0112/springboot-profile.git
cd springboot-profile
```

**Development (Default)**
```bash
./mvnw spring-boot:run
```

**Specific Profile**
```bash
./mvnw spring-boot:run -Dspring.profiles.active=qa
./mvnw spring-boot:run -Dspring.profiles.active=prod
```

---

## Profiles Configuration

| Profile    | Database       | Log Level | Data Seeding | Purpose                     |
|------------|----------------|-----------|--------------|-----------------------------|
| `dev`      | H2 In-memory   | DEBUG     | Yes          | Local Development           |
| `qa`       | H2             | INFO      | Yes          | Quality Assurance           |
| `uat`      | H2             | INFO      | Yes          | User Acceptance Testing     |
| `staging`  | PostgreSQL     | INFO      | No           | Staging / Pre-Production    |
| `prod`     | PostgreSQL     | INFO      | No           | Production                  |

---

## Project Structure

```
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
├── application.yml
├── application-dev.yml
├── application-qa.yml
├── application-uat.yml
├── application-staging.yml
├── application-prod.yml
├── logback-spring.xml
└── db/
    └── migration/
```

---

## API Endpoints

**Base URL**: `http://localhost:8080`

**Student APIs** (`/api/v1/students`)
- `POST /add` — Create a new student
- `GET /getstudent` — Get all students
- `GET /getstudent/{id}` — Get student by ID
- `PUT /update/{id}` — Update student
- `DELETE /delete/{id}` — Delete student

---

## Production Setup

Use the following environment variables for `staging` and `prod`:

```env
DB_HOST=localhost
DB_PORT=5432
DB_NAME=studentdb
DB_USERNAME=postgres
DB_PASSWORD=your_secure_password
```

---

## Author

<table>
<tr>
<td>
<strong>Sridhar</strong><br/>
Java Spring Boot Backend Developer &nbsp;•&nbsp; 1.5+ Years Experience<br/>
<a href="https://github.com/Sridhar0112">GitHub</a>
</td>
</tr>
</table>

---

<div align="center">

### If this project helped you, consider giving it a star ⭐

</div>

---

<div align="center">

**Focus:** Spring Profiles · Environment-Specific Configuration · SLF4J Logging · Enterprise Best Practices

</div>
