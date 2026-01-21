# Secure Microservices Communication with Eureka, OpenFeign and JWT

## 📌 Overview

This repository is a **progressive learning project** designed to understand how microservices communicate using **Spring Cloud Eureka** and **OpenFeign**, and how to **secure that communication properly** without breaking the architecture.

Instead of jumping directly to a “final” solution, the project evolves through **multiple security levels**, highlighting:
- What works
- What breaks
- Why it breaks
- How to design it correctly

The goal is to reach a **clean, maintainable, and secure microservices architecture**.

---

## 🎯 Objectives

- Understand **service discovery** with Eureka
- Implement **inter-service communication** using OpenFeign
- Learn how **Spring Security affects microservices**
- Apply **JWT authentication** progressively
- Design a **secure and scalable architecture**
- Avoid common anti-patterns in microservices security

---

## 🧱 Tech Stack

- Java 21
- Spring Boot 3.3.x
- Spring Cloud 2023.x
- Eureka Server
- OpenFeign
- Spring Security
- JWT
- Spring Cloud Gateway

---

## 🏗️ Architecture (Final Target)

Client/
├── API Gateway (Authentication & JWT Validation)
├── User Service
├── Order-Service
├── User Service (via OpenFeign)

- **Eureka**: Service discovery
- **Feign**: Inter-service communication
- **Gateway**: Single entry point + security
- **JWT**: Stateless authentication

---

## 🚀 Project Levels

### 🔹 Level 0 – No Security
- Eureka Server
- User Service
- Order Service
- OpenFeign communication
- No authentication or authorization

👉 Goal: Validate service discovery and Feign communication

---

### 🔹 Level 1 – Basic Spring Security
- Spring Security enabled on services
- Basic authentication

👉 Goal: Observe how security breaks Feign calls

---

### 🔹 Level 2 – Distributed JWT
- Each service validates JWT
- Token forwarded via Feign

👉 Goal: Understand limitations of distributed JWT validation

---

### 🔹 Level 3 – API Gateway + Centralized Security (Recommended)
- Authentication handled by Gateway
- JWT validated once
- Services trust the Gateway

👉 Goal: Implement a clean and professional design

---

### 🔹 Level 4 – Inter-Service Security (Advanced)
- Secure internal service-to-service calls
- JWT internal tokens or service credentials

👉 Goal: Protect against bypassing the Gateway

---

## 📂 Project Structure

microservices-security-lab/
├── 🛰️ eureka-server/     # Service Discovery (Annuaire des services)
├── 🚪 api-gateway/       # Point d'entrée unique & Validation JWT
├── 👤 user-service/      # Gestion des comptes & Serveur d'authentification
├── 🛒 order-service/     # Logique métier & Client OpenFeign
├── 📂 docs/              # Documentation approfondie
│   ├── architecture.md       # Schémas et flux de données
│   └── security-decisions.md  # Choix techniques liés à la sécurité
└── 📝 README.md          # Guide principal du projet


---

## 🧠 Key Learnings

- Why securing microservices is not trivial
- Why **security must be designed, not patched**
- How to avoid tight coupling between services
- How to balance security and maintainability

---

## 📚 Documentation

Each level includes:
- Configuration changes
- Security decisions
- Observed issues
- Final conclusions

See `docs/security-decisions.md` for detailed analysis.

---

## 🏁 Status

🚧 **Work in progress**  
The project is built incrementally, level by level.

---

## 👤 Author

**Ait Abd Saad Eddine**  
Engineering Student – Computer Science & Software Engineering

---

## 📜 License

This project is for educational purposes.
