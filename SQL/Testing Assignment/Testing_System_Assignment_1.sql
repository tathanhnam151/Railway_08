DROP DATABASE testing_system_2;

CREATE DATABASE IF NOT EXISTS Testing_System_2;
USE Testing_System_2;


CREATE TABLE Department (
		DepartmentID 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
		DepartmentName 		VARCHAR(30) NOT NULL UNIQUE 
);

CREATE TABLE `Position` (
		PositionID 			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
		PositionName 		VARCHAR(50) NOT NULL UNIQUE 
);

CREATE TABLE `Account` (
		AccountID 			INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
		Email 				VARCHAR(50) NOT NULL UNIQUE,	
		Username 			VARCHAR(20) NOT NULL UNIQUE, 
		Fullname 			VARCHAR(50) NOT NULL,
		DepartmentID 		TINYINT UNSIGNED,
		PositionID 			TINYINT UNSIGNED,
		CreateDate 			DATE,
		FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID) ON DELETE CASCADE,
		FOREIGN KEY (PositionID) REFERENCES `Position`(PositionID) ON DELETE CASCADE
);

CREATE TABLE `Group` (
		GroupID				TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
		GroupName			VARCHAR(20),
		CreatorID 			INT UNSIGNED NOT NULL,
		CreateDate 			DATE,
        FOREIGN KEY (CreatorID) REFERENCES `Account`(AccountID)
);

CREATE TABLE GroupAccount (
		GroupID 			TINYINT UNSIGNED NOT NULL,
		AccountID			INT UNSIGNED NOT NULL,
		JoinDate			DATE,
		FOREIGN KEY (GroupID) REFERENCES `Group`(GroupID) ON DELETE CASCADE,
		FOREIGN KEY (AccountID) REFERENCES `Account`(AccountID) ON DELETE CASCADE,
        PRIMARY KEY (GroupID, AccountID)
);

CREATE TABLE TypeQuestion (
		TypeID 				TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
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
		TypeID 				TINYINT UNSIGNED,
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
		Duration			TINYINT UNSIGNED,
		CreatorID			INT,
		CreateDate 			DATE
);

CREATE TABLE ExamQuestion (
		ExamID				INT,
		QuestionID			INT,
        FOREIGN KEY (ExamID) REFERENCES Exam(ExamID) ON DELETE CASCADE,
        FOREIGN KEY (QuestionID) REFERENCES	Question(QuestionID) ON DELETE CASCADE
);
