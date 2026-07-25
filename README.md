# CampusCore

CampusCore is a Spring Boot based Student Management System built as a hands-on project to learn Backend Development and DevOps from the ground up. The project begins as a monolithic REST API and gradually evolves through containerization, CI/CD, cloud deployment, infrastructure automation, orchestration and monitoring.

The primary goal of this project is not only to build a functional backend application, but also to apply modern DevOps practices throughout its lifecycle.

---

## Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven

### Database
- MySQL

### API Documentation
- Swagger UI (OpenAPI)

### DevOps
- Docker
- Docker Compose
- Jenkins
- AWS EC2
- Terraform
- Kubernetes
- Prometheus
- Grafana

---

## Features

- Student CRUD Operations
- RESTful APIs
- MySQL Integration
- Swagger API Documentation

---

## Project Roadmap

| Version | Milestone | Status       |
|----------|-----------|--------------|
| v1.0.0 | Spring Boot CRUD Application | ✅ Completed |
| v1.1.0 | Dockerize Application | ✅ Completed |
| v1.2.0 | Docker Compose | ✅ Completed  |
| v1.3.0 | Jenkins CI/CD Pipeline | ⏳ Planned   |
| v1.4.0 | Deploy to AWS EC2 | ⏳ Planned   |
| v1.5.0 | Infrastructure with Terraform | ⏳ Planned   |
| v1.6.0 | Kubernetes Deployment | ⏳ Planned   |
| v1.7.0 | Monitoring using Prometheus & Grafana | ⏳ Planned   |

---

## Branch Strategy

| Branch | Purpose |
|---------|---------|
| develop | Main development branch |
| feature/dockerize | Dockerfile and Docker Compose |
| feature/jenkins | Jenkins CI/CD Pipeline |
| feature/aws-ec2 | AWS EC2 Deployment |
| feature/terraform | Infrastructure as Code |
| feature/kubernetes | Kubernetes Deployment |
| feature/prometheus-grafana | Monitoring and Metrics |

---

## Project Structure

```text
CampusCore
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── campuscore
│   │   │               ├── controller
│   │   │               ├── entity
│   │   │               ├── repository
│   │   │               ├── service
│   │   │               └── CampusCoreApplication.java
│   │   │
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   │
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── campuscore
│
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```


---

## Running the Application

Clone the repository

```bash
git clone https://github.com/VamsiK-11/CampusCore.git
```

Navigate into the project

```bash
cd CampusCore
```

Run the application


```bash
mvn spring-boot:run
```

---

## API Documentation

Swagger UI

```
http://localhost:8080/swagger-ui/index.html
```

---

## Learning Objectives

- Spring Boot
- REST API Development
- Spring Data JPA
- Hibernate
- Docker
- CI/CD with Jenkins
- AWS Deployment
- Terraform
- Kubernetes
- Monitoring & Observability
