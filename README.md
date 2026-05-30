#  Banking Application Backend (Spring Boot)
A scalable and secure backend banking application developed using Spring Boot, implementing real-world financial workflows including user authentication, account management, 
and transaction processing via RESTful APIs, enhanced with JWT-based security and clean architecture principles.
---

## Key Features

-  JWT-based User Authentication (Login/Register)
-  User Profile Management
-  Real-time Account Balance Dashboard
-  Deposit Money
-  Withdraw Money with Insufficient Balance Check
-  Transfer Money Between Accounts
-  View Latest Transactions (Top 3)
-  Complete Transaction History
-  Download Transactions as PDF
-  Change Password (Secure API)
-  Fully Secured APIs using Spring Security

---

##  Tech Stack

- Java 
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Hibernate / JPA
- MySQL
- Maven

---

##  System Design

- **User ↔ Account** → One-to-One Relationship  
- **Account ↔ Transactions** → One-to-Many Relationship  
- DTO-based architecture for clean API design  
- Layered architecture:
  - Controller
  - Service
  - Repository

---

## 📌 API Endpoints

###  Authentication

- `POST /api/user/register` → Register new user  
- `POST /api/auth/login` → Authenticate user & get JWT token  

---

###  User

- `GET /api/users/profile` → Get user details  
- `PUT /api/users/change_password` → Update user password
- `GET /api/users/balance` → To check balance

  

---

###  Dashboard

- `GET /api/users/dashboard` → Get balance + last 3 transactions  

---

### Transactions

- `POST /api/transactions/deposit` → Deposit money  
- `POST /api/transactions/withdraw` → Withdraw money  
- `POST /api/transactions/transfer` → Transfer money
- `GET /api/transactions/transaction` → Provided paginated transaction history with all details( latest 3)  

---

###  Reports

- `GET /api/users/download/statements` → Transaction statement list 

---

##  Security

- JWT-based authentication mechanism  
- All endpoints secured except login/register  
- Token must be included in header:
- Authorization: Bearer<Your_Token>

## Author
Mehak Bhatia 
