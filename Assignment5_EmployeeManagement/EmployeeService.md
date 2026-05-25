# Employee Service

## APIs

POST /employees
Request:
{
  "id": 1,
  "name": "Ayushi",
  "department": "IT",
  "salary": 70000
}

GET /employees

PUT /employees/{id}

DELETE /employees/{id}

---

## Stream Example

employees.stream()
.filter(e -> e.getSalary() > 50000)
.forEach(System.out::println);

---

## Optional Usage

Optional.ofNullable(employee.getName())
.orElse("No Name");
