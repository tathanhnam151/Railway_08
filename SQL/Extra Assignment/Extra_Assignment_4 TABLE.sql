-- Extra Assignment 4's Tables

DROP DATABASE Extra_Assignment_4;

CREATE DATABASE Extra_Assignment_4;
USE Extra_Assignment_4;

CREATE TABLE Department (
		Department_Number			INT PRIMARY KEY AUTO_INCREMENT,
        Department_Name				VARCHAR(30) NOT NULL
);

CREATE TABLE Employee_Table (
		Employee_Number				INT PRIMARY KEY AUTO_INCREMENT,
        Employee_Name				VARCHAR(30) NOT NULL,
        Department_Number			INT NOT NULL,
        FOREIGN KEY (Department_Number) REFERENCES Department(Department_Number) ON DELETE CASCADE
);
    
CREATE TABLE Employee_Skill_Table (
		Employee_Number				INT NOT NULL,
        Skill_Code					VARCHAR(20) NOT NULL,
        Date_Registered				DATE,
		FOREIGN KEY	(Employee_Number) REFERENCES Employee_Table (Employee_Number) ON DELETE CASCADE
);