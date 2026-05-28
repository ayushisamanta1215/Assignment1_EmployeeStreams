# MICROSERVICES DEMO PROJECT

Projects:
1. student-service
2. course-service

---

## Requirements:
- Java 17
- Maven

---

## Run Steps:

1. Start Course Service  
   Port: 8083  

2. Start Student Service  
   Port: 8082  

---

## Test APIs:

### Course Service:
GET http://localhost:8083/courses/501  

### Student Service:
GET http://localhost:8082/students/1  

---

## Expected:

Student Service internally calls Course Service  
and returns student enrollment details.

---

## Sample Response:

{
  "studentId": 1,
  "studentName": "Neha",
  "courseName": "Java Microservices",
  "trainer": "Amit Sharma"
}

---

## Flow:

Student Service → calls → Course Service

---

## Concepts:

- Microservices communication  
- REST API  
- Service interaction  
