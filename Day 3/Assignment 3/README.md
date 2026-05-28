# MICROSERVICES DEMO PROJECT

Projects:
1. patient-service
2. doctor-service

---

## Requirements:
- Java 17
- Maven

---

## Run Steps:

1. Start Doctor Service  
   Port: 8085  

2. Start Patient Service  
   Port: 8084  

---

## Test APIs:

### Doctor Service:
GET http://localhost:8085/doctors/201  

### Patient Service:
GET http://localhost:8084/patients/1  

---

## Expected:

Patient Service internally calls Doctor Service  
and returns appointment details.

---

## Sample Response:

{
  "patientName": "Amit",
  "doctorName": "Dr. Rajesh",
  "specialization": "Cardiologist"
}

---

## Flow:

Patient Service → calls → Doctor Service

---

## Concepts:

- Microservice communication  
- REST API  
- Service interaction  
