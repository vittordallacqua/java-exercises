# 🏦 Bank Management System in Java

A simple Java banking system project using Object-Oriented Programming principles and MySQL database integration via JDBC.

---

## 🧩 Project Overview

**Purpose:**  
Simulate basic banking operations such as account creation, deposit, withdrawal, and balance checking with data persisted in a relational database.

**Technologies Used:**
- **Language:** Java  
- **Paradigm:** Object-Oriented Programming (OOP)  
- **Database:** MySQL (via JDBC)  

---

## 🗂️ Project Structure

```
BankJavaSQL/
├── src/
│ ├── model/
│ │ └── Account.java
│ ├── dao/
│ │ └── AccountDAO.java
│ ├── service/
│ │ └── BankService.java
│ └── Main.java
├── resources/
│ └── db.properties
├── lib/
│ └── mysql-connector-java-x.x.x.jar
└── README.md
```

### 💠 Main Components

- **`model/Account.java`**  
  Defines the `Account` class with fields like account number, owner name, and balance.

- **`dao/AccountDAO.java`**  
  Handles database operations (CRUD) using JDBC.

- **`service/BankService.java`**  
  Contains the core business logic and mediates between DAO and the user interface.

- **`Main.java`**  
  Application entry point with a simple console interface.

- **`resources/db.properties`**  
  Configuration file for JDBC connection (URL, username, password).

---

## 🔧 Features

- Create a new bank account
- Make deposits
- Perform withdrawals
- Check account balance
- List all accounts

---

## 🧪 Running the Project

### 1. Setup Database

Create a MySQL database named `bankdb`.
Execute the following SQL to create the `accounts` table:

```sql
CREATE TABLE accounts (
    id INT PRIMARY KEY AUTO_INCREMENT,
    owner_name VARCHAR(100) NOT NULL,
    balance DOUBLE NOT NULL
);
```
### 2. Configure Connection

Edit the `db.properties` file with your database credentials:

```properties 

db.url=jdbc:mysql://localhost:3306/bankdb
db.user=root
db.password=yourpassword
```

### 3. Compile and Run

Make sure `mysql-connector-java` is in your classpath.

Compile:

```bash
javac -cp lib/mysql-connector-java-x.x.x.jar src/**/*.java
````
Run:

```bash
java -cp .:lib/mysql-connector-java-x.x.x.jar src/Main
```
```Note: On Windows, use ; instead of : for classpath separation.```

---

# 📌 Technical Notes
- OOP Principles: Encapsulation, abstraction, separation of concerns.

- JDBC Integration: All SQL operations use the Java Database Connectivity API.

- Error Handling: Proper exception handling with try-catch blocks to manage SQL and connection errors.

---

# 📎 License
This project is licensed under the MIT License.
