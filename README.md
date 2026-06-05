
# Challenge Management System — REST API

> A beginner-friendly CRUD REST API built with **Java** and **Spring Boot** for managing daily challenges and tracking progress.

![Java](https://img.shields.io/badge/Java-☕-orange?style=flat-square)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-🌱-6db33f?style=flat-square)
![Maven](https://img.shields.io/badge/Maven-📦-c71a36?style=flat-square)
![REST API](https://img.shields.io/badge/REST-API-378ADD?style=flat-square)
![Postman](https://img.shields.io/badge/Tested%20with-Postman-FF6C37?style=flat-square)

---

## Overview

The Challenge Management System is a Spring Boot REST API demonstrating real-world CRUD operations. It helps you create, view, update, and delete daily challenges while learning backend development fundamentals.

---

## Features

- Create new challenges
- Retrieve all challenges
- Retrieve a challenge by day number
- Update existing challenges
- Delete challenges
- Clean Controller–Service architecture

---

## Tech Stack

| Technology   | Purpose               |
|--------------|-----------------------|
| Java         | Programming Language  |
| Spring Boot  | Backend Framework     |
| Maven        | Dependency Management |
| REST API     | Communication Layer   |
| Postman      | API Testing           |

---

## Project Structure

```
src/main/java/com/rohith/ChallegeApp/
├── ChallegeAppApplication.java   # Entry point
├── Challenge.java                # Entity model
├── ChallengeController.java      # REST controller
└── ChallengeService.java         # Business logic
```

---

## Challenge Object

```json
{
  "id": 1,
  "title": "Water Goal",
  "description": "Drink 5 liters of water daily",
  "dayNumber": 2,
  "completed": true
}
```

---

## API Reference

Base URL: `http://localhost:8080`

| Method   | Endpoint                     | Description                  |
|----------|------------------------------|------------------------------|
| `GET`    | `/challenges`                | Retrieve all challenges      |
| `GET`    | `/challenges/{dayNumber}`    | Get challenge by day number  |
| `POST`   | `/challenges`                | Create a new challenge       |
| `PUT`    | `/challenges/{id}`           | Update an existing challenge |
| `DELETE` | `/challenges/{id}`           | Delete a challenge           |

---

## Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/ROHITHELAYARAJA/challenge-management-system-rest-api.git
```

### 2. Open the project

Open with IntelliJ IDEA, Eclipse, or Spring Tool Suite.

### 3. Run the application

Run `ChallegeAppApplication.java`. The server starts at:

```
http://localhost:8080
```

---

## Postman Testing Guide

**Step 1 — Create a challenge**

```http
POST http://localhost:8080/challenges
```
```json
{
  "title": "Learn Spring Boot",
  "description": "Complete REST API Tutorial",
  "dayNumber": 5,
  "completed": false
}
```

**Step 2 — View all challenges**

```http
GET http://localhost:8080/challenges
```

**Step 3 — View by day number**

```http
GET http://localhost:8080/challenges/5
```

**Step 4 — Update a challenge**

```http
PUT http://localhost:8080/challenges/1
```
```json
{
  "id": 1,
  "title": "Learn Spring Boot Advanced",
  "description": "Complete CRUD Operations",
  "dayNumber": 5,
  "completed": true
}
```

**Step 5 — Delete a challenge**

```http
DELETE http://localhost:8080/challenges/1
```

---

## Learning Outcomes

By building this project you will learn:

- Spring Boot fundamentals
- REST API design and development
- CRUD operations (GET, POST, PUT, DELETE)
- `@RequestBody`, `@PathVariable`, `ResponseEntity`
- Dependency injection and service layer architecture
- API testing with Postman

---

## Author

**Rohith E** — AI & Data Science Student, VSB Engineering College

- GitHub: [ROHITHELAYARAJA](https://github.com/ROHITHELAYARAJA)
- Interests: Java · Spring Boot · REST APIs · DSA · Backend Development

---

## Support

If you found this project helpful:

- ⭐ Star the repository
- 🍴 Fork and build on it
- 📢 Share with other developers

---

> *"Success is no accident. It is hard work, perseverance, learning, studying, sacrifice, and most of all, love of what you are doing."*

🚀 Keep Coding · Keep Building · Keep Improving · **SIUUUUUUUUUU** ⚽🔥
