-- Database schema for Expense Tracker

CREATE DATABASE expense_tracker;

USE expense_tracker;

CREATE TABLE expenses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    amount DOUBLE NOT NULL,
    category VARCHAR(100),
    description VARCHAR(255),
    date VARCHAR(20)
);
