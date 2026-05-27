# Student Record Management System

A JavaFX CRUD application connected to PostgreSQL database.
Built using JavaFX, SceneBuilder, JDBC, and PostgreSQL.

## Features
- Add new student records
- View all students in a table
- Update selected student record
- Delete selected student record
- Clear input fields

## Technologies Used
- Java 17
- JavaFX 17
- PostgreSQL
- JDBC
- Maven
- SceneBuilder

## Database Setup
1. Open pgAdmin
2. Create database: studentdb
3. Run this query:
CREATE TABLE students (
   id SERIAL PRIMARY KEY,
   name VARCHAR(100),
   course VARCHAR(50),
   year_level VARCHAR(20)
);

## How to Run
1. Clone the repository
2. Open in IntelliJ IDEA
3. Update DBConnection.java with your PostgreSQL password
4. Run MainApp.java

## Developer
- Name: Alexandria S. Parojinog
- Course: BSIT 2-2
