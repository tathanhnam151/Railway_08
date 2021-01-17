-- Testing Assignment 5
USE Testing_System_2;


-- Question 1: Return view of sale employees

DROP VIEW IF EXISTS sale_employees;

CREATE VIEW sale_employees AS
SELECT 
	`Account`.AccountID, `Account`.FullName, Department.DepartmentName AS Department
FROM
	`Account`
LEFT JOIN	
	Department ON `Account`.departmentID = Department.DepartmentID
WHERE 
	`Account`.DepartmentID = '2';

SELECT * FROM sale_employees;


-- Question 2: Return view of accounts participate in most groups

DROP VIEW IF EXISTS acc_max_grp;

CREATE VIEW acc_max_grp AS
SELECT
	GroupAccount.AccountID, `Account`.FullName, 
    COUNT(GroupAccount.GroupID) AS 'Number of groups joined'
FROM
	GroupAccount
RIGHT JOIN
	`Account` ON GroupAccount.AccountID = `Account`.AccountID
GROUP BY
	GroupAccount.AccountID
HAVING
	COUNT(GroupAccount.GroupID) = (	SELECT MAX(CountGrp) 
									FROM (	SELECT COUNT(AccountID) AS CountGrp
											FROM GroupAccount
                                            GROUP BY AccountID) AS Namtadeptrai);
                                            
SELECT * FROM acc_max_grp;


-- Question 3: Return view of questions with long contents (more than 300 words) and delete it

-- Create view of long questions

DROP VIEW IF EXISTS long_question;
CREATE VIEW long_question AS
SELECT
	QuestionID, Content, 
    (LENGTH(Content) - LENGTH(REPLACE(Content, " ", "")) + 1) AS `Word Count`
FROM 
	Question
GROUP BY
	QuestionID
HAVING
	(LENGTH(Content) - LENGTH(REPLACE(Content, " ", "")) + 1) > 300;

SELECT * FROM long_question;

-- Delete long questions

DELETE FROM
	Question
WHERE
	Question.QuestionID = (	SELECT
								QuestionID
							FROM
								long_question);
                                

-- Question 4: Return view of department with the most employees

DROP VIEW IF EXISTS max_mem;
CREATE VIEW max_mem AS
SELECT 
	Department.DepartmentID, Department.DepartmentName,
    COUNT(`Account`.AccountID) AS Members
FROM 
	`Account`
LEFT JOIN
	Department ON Department.DepartmentID = `Account`.DepartmentID
GROUP BY
	DepartmentID
HAVING
	COUNT(`Account`.AccountID) = (SELECT MAX(CountMem) FROM (	SELECT COUNT(AccountID) AS CountMem
																FROM
																	`Account`
																GROUP BY 
																	DepartmentID) AS MaxMem);
                                                                    
SELECT * FROM max_mem;
																

-- Question 5: Return view of questions made by user with family name = Nguyen

DROP VIEW IF EXISTS Nguyen;
CREATE VIEW Nguyen AS
SELECT
		Question.QuestionID, Question.Content, `Account`.FullName
FROM
	Question
LEFT JOIN
	`Account` ON Question.CreatorID = `Account`.AccountID
WHERE
	substring(`Account`.Fullname, 1, 6) = 'Nguyen';

SELECT * FROM Nguyen;

