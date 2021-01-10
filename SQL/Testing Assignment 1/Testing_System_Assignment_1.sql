CREATE DATABASE IF NOT EXISTS Testing_System_2;
USE Testing_System_2;


CREATE TABLE Department (
		DepartmentID 		INT AUTO_INCREMENT PRIMARY KEY,
		DepartmentName 		VARCHAR(30)
);

CREATE TABLE `Position` (
		PositionID 			INT AUTO_INCREMENT PRIMARY KEY,
		PositionName 		VARCHAR(50)
);

CREATE TABLE `Account` (
		AccountID 			INT AUTO_INCREMENT PRIMARY KEY,
		Email 				VARCHAR(50),	
		Username 			VARCHAR(20),
		Fullname 			VARCHAR(50),
		DepartmentID 		INT,
		PositionID 			INT,
		CreateDate 			DATE,
		FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
		FOREIGN KEY (PositionID) REFERENCES `Position`(PositionID)
);

CREATE TABLE `Group` (
		GroupID				INT AUTO_INCREMENT PRIMARY KEY,
		GroupName			VARCHAR(20),
		CreatorID 			INT,
		CreateDate 			DATE
);

CREATE TABLE GroupAccount (
		GroupID 			INT,
		AccountID			INT,
		JoinDate			DATE,
		FOREIGN KEY (GroupID) REFERENCES `Group`(GroupID),
		FOREIGN KEY (AccountID) REFERENCES `Account`(AccountID)
);

CREATE TABLE TypeQuestion (
		TypeID 				INT AUTO_INCREMENT PRIMARY KEY,
		TypeName 			ENUM('Essay', 'Multiple Choice')
);
    
CREATE TABLE CategoryQuestion (
		CategoryID 			INT AUTO_INCREMENT PRIMARY KEY,
		CategoryName		VARCHAR(20)
);

CREATE TABLE Question (
		QuestionID  		INT AUTO_INCREMENT PRIMARY KEY,
		Content				VARCHAR(50),
		CategoryID			INT,
		TypeID 				INT,
		CreatorID			INT,
		CreateDate			DATE,
		FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
		FOREIGN KEY (TypeID) REFERENCES TypeQuestion(TypeID)
);

CREATE TABLE Answer (
		AnswerID			INT AUTO_INCREMENT PRIMARY KEY,
		Content 			VARCHAR(50),
		QuestionID			INT,
		isCorrect			BOOLEAN,
		FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

CREATE TABLE Exam (
		ExamID				INT AUTO_INCREMENT PRIMARY KEY,
		`Code`				VARCHAR(10),
		Title				VARCHAR(30),
		CategoryID			INT,
		Duration			INT,
		CreatorID			INT,
		CreateDate 			DATE
);

CREATE TABLE ExamQuestion (
		ExamID				INT,
		QuestionID			INT
);
