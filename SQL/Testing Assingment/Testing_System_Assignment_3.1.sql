USE Testing_system_2;

-- Question 2: Return names of all departments

SELECT 
	(DepartmentName)
FROM
    Department;


-- Question 3: Return Sale's Department ID:

SELECT
	DepartmentID
FROM
	Department
WHERE
	DepartmentName = 'Sale';
    
    
-- Question 4: Return account of whom has the longest name 

SELECT 
	*
FROM
	`Account`
WHERE
	LENGTH(Fullname) = (SELECT MAX(LENGTH(Fullname)) FROM `Account`);
    
    
-- Question 5: Return account of whom has the longest name and departmentID = 3    
SELECT 
	Email, Username, Fullname, length(Fullname)
FROM
	`Account`
WHERE
	DepartmentID = 3
AND
	LENGTH(Fullname) = (SELECT MAX(LENGTH(Fullname)) FROM `Account`
						WHERE DepartmentID = 3);
    

-- Question 6: Return groups that joined before 2019-12-20

SELECT 
	GroupName
FROM
	`Group`
WHERE
	CreateDate < '2019-12-20';


-- Question 7: Return questions that have more than 4 answers

SELECT
	QuestionID
FROM
	Answer
GROUP BY
	QuestionID
HAVING
	COUNT(AnswerID) > 3;
    
    
-- Question 8: Return exam codes that have duration more 60 mins and created before 2019-12-20
    
SELECT 
	ExamID, Title, CreateDate
FROM
	Exam
WHERE
	Duration > 60
AND
	CreateDate < '2019-12-20';


-- Question 9: Return the list of 5 most recently created groups

SELECT 
	*
FROM
	`Group`
ORDER BY CreateDate DESC

LIMIT 5; 


-- Question 10: Return numbers of employees who have departmentID = 2

SELECT 
	COUNT(AccountID)
FROM
	`Account`
WHERE 
	DepartmentID = 2;
    

-- Question 11: Return the name of an employee that has name starts with 'D' and ends with 'o'

SELECT 
    Fullname
FROM
    `Account`
WHERE
    (SUBSTRING_INDEX(FullName, ' ', - 1)) LIKE 'D%o';
    
-- Question 12: Delete all the exams that were created before 2019-12-20

DELETE FROM Exam 
WHERE
	CreateDate < '2019-12-20';
    
    
-- Question 13: Delete all the question that starts with 'Câu hỏi'

DELETE FROM Question
WHERE 
	SUBSTRING_INDEX(Title, ' ', 2) = 'Câu hỏi';


-- Question 14: Update the information of account with id = 5 to FullName of "Nguyễn Bá Lộc" and email to loc.nguyenba@vti.com.vn

UPDATE 		
	`Account` 
SET 		
	Fullname 	= 	'Nguyễn Bá Lộc', 
	Email 		= 	'loc.nguyenba@vti.com.vn'
WHERE 		
	AccountID = 5;
    
-- Question 15 Update the information of account with id = 5 to groupID = 4
    
UPDATE `GroupAccount` 
SET 
    GroupID = 4
WHERE
    AccountID = 5;
	
