📘 Expense Tracker – Java Swing + JDBC

A complete Expense Tracker application using Java Swing, JDBC, MySQL, OOP principles, Collections, and Multithreading.
This README explains how to run the project using the JAR file and includes all required academic details.

-------------------------------------------------------------------

📦 Project Overview

This Expense Tracker includes:

✔ Graphical User Interface (GUI) using Java Swing
✔ Database operations using JDBC + MySQL
✔ Full OOP implementation (Inheritance, Polymorphism, Interfaces, Encapsulation)
✔ Multithreading to prevent GUI freezing
✔ Collections & Generics for managing expense data
✔ DAO (Data Access Object) architecture
✔ Clean, modular folder structure

-------------------------------------------------------------------

🧱 Project Structure

ExpenseTrackerGUI/
│
├── ExpenseTrackerGUI.jar          (final runnable JAR)
├── lib/
│   └── mysql-connector-j-8.1.0.jar
├── Main.java
├── model/
│   └── Expense.java
├── dao/
│   └── ExpenseDAO.java
├── db/
│   └── DBConnection.java
└── ui/
    └── ExpenseGUI.java

-------------------------------------------------------------------

🛠️ Prerequisites (Before Running the JAR)
✔ 1. Install Java (JDK or JRE)

Check if Java is installed:

java -version


If you get an error, install Java (JDK 17 or JDK 21 recommended).

-------------------------------------------------------------------

✔ 2. Install MySQL Server + Workbench

Make sure MySQL Server is running in Services.

-------------------------------------------------------------------

✔ 3. Create the Database

Open MySQL Workbench → run:

CREATE DATABASE expense_tracker;
USE expense_tracker;

CREATE TABLE expenses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    amount DOUBLE,
    date DATE
);

-------------------------------------------------------------------

✔ 4. Check DBConnection settings

Inside:

db/DBConnection.java


Make sure:

conn = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/expense_tracker","root","1234");

🔹 Replace "1234" with your actual MySQL root password.

-------------------------------------------------------------------

🚀 How to Run the Project Using the JAR File

You may have two types of JAR files:

1️⃣ If you have a Fat JAR (JAR with JDBC driver included)

Just double-click:
ExpenseTrackerGUI.jar

or run:

java -jar ExpenseTrackerGUI.jar

The GUI will open.

2️⃣ If you have a Normal JAR (without MySQL connector inside)

You must include the connector manually:

java -cp ExpenseTrackerGUI.jar;lib/mysql-connector-j-8.1.0.jar Main


This will launch the GUI.

--------------------------------------------------------------------

🎨 GUI Features

~ Add new expense
~ View table of expenses
~ Delete selected expense
~ Date selection
~ Auto-refresh using threads
~ No freezing during DB operations

---------------------------------------------------------------------

🧵 Multithreading Used

~ Loading expenses runs in a background thread
~ Prevents UI from freezing
~ Synchronized access to database methods

---------------------------------------------------------------------

🧬 OOP Concepts Implemented

Encapsulation-
All Expense fields are private with getters/setters.

Inheritance-
Common Swing components extended for custom behavior.

Polymorphism-
~ Overridden methods in DAO
~ Listeners and handlers using interface implementation

Interfaces-
DAO interface for database CRUD operations.

Exception Handling-
All DB operations wrapped in try-catch with custom messages.

---------------------------------------------------------------------

📚 Collections & Generics Used

ArrayList<Expense> used to store and display data

Generic DAO methods returning typed results

---------------------------------------------------------------------

🔌 Database Layer (DAO Architecture)
model/

Contains Expense.java (POJO class)

db/

Contains DBConnection.java (JDBC connection provider)

dao/

Contains ExpenseDAO.java (CRUD operations)

ui/

Contains ExpenseGUI.java (Swing-based interface)
---------------------------------------------------------------------
🚧 Future Improvements

~ Add categories (Food, Travel, Shopping, etc.)
~ Add monthly analytics & graphs
~ User login system
~ Dark/Light theme modes