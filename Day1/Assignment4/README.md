# Assignment 4 - Microservices Architecture Design

## Services
- User Service
- Restaurant Service
- Search Service
- Cart Service
- Order Service
- Payment Service
- Delivery Service
- Notification Service
- Review Service

## Database per Service
Each service has its own database.

## API Communication
- API Gateway
- REST APIs

## Kafka Usage
- Order → Payment
- Payment → Notification
- Order → Delivery

## High Scaling Services
- Search
- Order
- Delivery

## Business Critical Services
- Payment
- Order
- User

## Failure Handling
- Retry
- Circuit Breaker
- Logging

## Architecture Diagram
  architecture.png
