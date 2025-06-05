# 📦 Client Management API - Spring Boot

This is a simple RESTful API built with **Spring Boot** to manage `Client` entities. It supports basic **CRUD operations** (Create, Read, Update, Delete) and includes input validation and exception handling.

---

## 🚀 Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Bean Validation (Jakarta Validation API)
- H2 for testing Database
- REST API (JSON)
- Exception handling with `@ControllerAdvice`

---

## 🧾 Client Entity

The `Client` has the following fields:

| Field      | Type        | Validation                           |
|------------|-------------|--------------------------------------|
| `id`       | `Long`      | Auto-generated <PK>                      |
| `name`     | `String`    | Not blank, min 3 chars               |
| `cpf`      | `String`    | Exactly 11 digits, unique constraint |
| `income`   | `Double`    | Not null                             |
| `birthDate`| `LocalDate` | Must be in the past or present       |
| `children` | `Integer`   | Not null, >= 0                       |

---

## API Endpoints
![sw](https://github.com/user-attachments/assets/45605043-f338-40c0-8586-f71f07f35be3)

### 🔹 POST /clients

**Request Body (JSON):**

```json
{
  "name": "Maria Souza",
  "cpf": "12345678901",
  "income": 4500.00,
  "birthDate": "1985-04-12",
  "children": 2
}
```
Responses:
- 201 Created if successful
- 409 Conflict if CPF already exists
- 422 Unprocessable Entity if validation fails
  
### 🔹 GET All Clients (Paginated) /clients
```bash
GET /clients?page=0&size=10&sort=name
```
Responses:
- 200 OK with paginated results
  
### 🔹 GET By ID /clients/{id}
```bash
GET /clients/{id}
```
Responses:
- 200 OK if found
- 404 Not Found if client doesn’t exist
- 
### 🔹 UPDATE /clients/{id}
```bash
PUT /clients/{id}
```
# Request Body: Same as POST
Responses:
- 200 OK if updated
- 404 Not Found if ID doesn’t exist
- 409 Conflict if new CPF is duplicate

### 🔹 DELETE /clients/{id}
```bash
DELETE /clients/{id}
```
Responses:
- 204 No Content if deleted
- 404 Not Found if ID doesn’t exist
- 409 Conflict if client is referenced elsewhere
  
📌 Exception Handling
Handled globally via @ControllerAdvice with custom error response structure (CustomError, ValidationError, etc.).

Example validation error response:
```json
{
  "error": "Validation exception",
  "status": 422,
  "path": "/clients",
  "timestamp": "2025-06-03T23:55:00Z",
  "errors": [
    {
      "fieldName": "cpf",
      "message": "CPF must be a sequence of 11 digits"
    }
  ]
}
```
### 🔹 How to Run
1. Clone the repository:
```bash
git clone https://github.com/ozysouza/crud-client-java.git
cd crud-client
```
2. Configure your database in application.properties or application.yml.
3. Run the application:
```bash
./mvnw spring-boot:run
```


