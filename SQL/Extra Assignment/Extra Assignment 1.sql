CREATE DATABASE Fresher;

USE Fresher;


CREATE TABLE Trainee (
		TraineeID			INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
        Full_Name			VARCHAR(30),
		Birth_Date			DATE,
		Gender				ENUM('male', 'female', 'unknown'),
        ET_IQ				TINYINT UNSIGNED NOT NULL, 
        ET_Gmath			TINYINT UNSIGNED NOT NULL,
		ET_English			TINYINT UNSIGNED NOT NULL,
        Training_Class		INT NOT NULL,
        Evaluation_Notes	TEXT,
        VTI_Account			VARCHAR(50) NOT NULL UNIQUE, 
        Month_of_birthdate 	TINYINT	UNSIGNED NOT NULL
);

CREATE TABLE Excercise_2 (
		ID					INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
        `Name`				VARCHAR(30) NOT NULL,
        CODE				VARCHAR(5) NOT NULL,
        ModifiedDate		DATETIME
);

CREATE TABLE Excercise_3 (
		ID					INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
        `Name`				VARCHAR(30) NOT NULL,
        Birth_Date			DATE,
        Gender 				BIT,
        IsDeletedFlag		BIT NOT NULL
);



    
    
        