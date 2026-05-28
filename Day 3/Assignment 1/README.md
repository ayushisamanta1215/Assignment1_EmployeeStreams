# MICROSERVICES DEMO PROJECT

Projects:
1. employee-service
2. department-service

---

## Requirements:
- Java 17
- Maven
- IntelliJ / Eclipse

---

## Run Steps:

1. Start Department Service  
   Port: 8081  

2. Start Employee Service  
   Port: 8080  

---

## Test APIs:

### Department Service:
GET http://localhost:8081/departments/101  

### Employee Service:
GET http://localhost:8080/employees/1  

---

## Expected:

Employee Service internally calls Department Service  
and returns combined response.

---

## Sample Response:

```json
{
  "employeeId": 1,
  "employeeName": "Rahul",
  "departmentName": "Engineering",
  "location": "Bangalore",
  "managerName": "Anil Kumar"
}
``
