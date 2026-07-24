<h1 align="center">Marketplace - Spring Data</h1>

<p align="center">
  <em>Modular Spring Boot application demonstrating multi-database persistence using DDD and Clean Architecture.</em>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-133eff?style=flat&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/Spring%20Boot-4.1.0-133eff?style=flat&logo=springboot&logoColor=white"/>
  <img src="https://img.shields.io/badge/DDD-Architecture-133eff?style=flat"/>
  <img src="https://img.shields.io/badge/PostgreSQL-133eff?style=flat&logo=postgresql&logoColor=white"/>
  <img src="https://img.shields.io/badge/MySQL-133eff?style=flat&logo=mysql&logoColor=white"/>
  <img src="https://img.shields.io/badge/MongoDB-133eff?style=flat&logo=mongodb&logoColor=white"/>
  <img src="https://img.shields.io/badge/Redis-133eff?style=flat&logo=redis&logoColor=white"/>
  <img src="https://img.shields.io/badge/Docker-133eff?style=flat&logo=docker&logoColor=white"/>
</p>

---

## Table of Contents

- [Overview](#overview)
- [Architecture](#architecture)
- [How to Run](#how-to-run)
    - [Prerequisites](#prerequisites)
    - [Running the Application](#running-the-application)
- [Tests](#tests)
- [License](#license)

---

# Overview

**Marketplace** is an application developed with **Java 17** and **Spring Boot**, focused on demonstrating different persistence strategies within a modular architecture based on **Domain-Driven Design (DDD)**.

Each application context has well-defined responsibilities and can use the most suitable persistence technology according to its domain requirements, maintaining low coupling between layers.

The project is divided into three main bounded contexts:

- **Registration** → customer management;
- **Catalog** → event catalog and metadata management;
- **Ticketing** → seat control, temporary locking, and reservation management.

The technologies used include:

- MySQL
- PostgreSQL
- MongoDB
- Redis

---

# Architecture

The project follows a layered architecture inspired by **DDD** and **Clean Architecture**, separating business rules from infrastructure concerns.

### Context Organization

```text
marketplace
├── registration
├── catalog
└── ticketing
````

Each module can adopt a different persistence strategy according to its requirements:

| Context      | Persistence                 |
| ------------ | --------------------------- |
| Registration | PostgreSQL                  |
| Catalog      | MongoDB                     |
| Ticketing    | Redis + Relational Database |

The project also demonstrates concepts such as:

* Repository Pattern
* Domain and Infrastructure separation
* Redis caching
* Temporary seat locking using TTL
* Event-driven communication between contexts

---

# How to Run

## Prerequisites

Before running the project, make sure you have installed:

* Java 17+
* Docker
* Docker Compose
* Gradle

---

## Running the Application

Clone the repository:

```bash
git clone https://github.com/nataliatsi/marketplace-.git
```

Navigate to the project directory:

```bash
cd marketplace
```

Start the infrastructure services:

```bash
docker compose up -d
```

Run the application:

```bash
./gradlew bootRun
```

---

# Tests

To execute all automated tests:

```bash
./gradlew test
```

---

# License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for more information.

---

<div align="center">

Made with 💙 by [**Natália**](https://github.com/nataliatsi)

</div>


