USE Testing_System_2;

-- Question 1: Return list of employees and their departments information:

SELECT
	`Account`.Fullname, Department.DepartmentID, Department.DepartmentName
FROM
	`Account`
INNER JOIN
	Department ON `Account`.DepartmentID = Department.DepartmentID;
    
    
-- Question 2: Return information of accounts created after 2020-12-20:

SELECT
	AccountID, Fullname, Email, Username, Department.DepartmentName, `Position`.PositionName, CreateDate
FROM
	`Account`
INNER JOIN
	Department ON `Account`.DepartmentID = Department.DepartmentID
INNER JOIN
	`Position` ON `Account`.PositionID = `Position`.PositionID
WHERE
	CreateDate > '2020-12-20'
ORDER BY
	CreateDate DESC;
    

-- Question 3: Return list of developer:

SELECT
	AccountID, Fullname, Username, Department.DepartmentName, `Position`.PositionName
FROM
	`Account`	
INNER JOIN
	Department ON `Account`.DepartmentID = Department.DepartmentID
INNER JOIN
	`Position` ON `Account`.PositionID = `Position`.PositionID
WHERE
	`Position`.PositionID = 8; 
    

-- Question 4: Return the list of deparments that have more than 3 employees:

SELECT
	`Account`.DepartmentID, Department.DepartmentName
FROM 
	`Account`
INNER JOIN
	Department ON `Account`.DepartmentID = Department.DepartmentID
GROUP BY
	DepartmentID
HAVING
	COUNT(`Account`.DepartmentID) > 3;
    

-- Question 5: Return list of question that used the most in exams:

SELECT 
	ExamQuestion.QuestionID, Question.Content,
    COUNT(ExamQuestion.QuestionID) AS Occurrence
FROM
	ExamQuestion
INNER JOIN
	Question ON ExamQuestion.QuestionID = Question.QuestionID
GROUP BY
	QuestionID
ORDER BY
	Occurrence DESC
LIMIT 1;
   
    
-- Question 6: Return occurrences of each category in all questions
SELECT
	CategoryQuestion.CategoryID, CategoryQuestion.CategoryName, 
	COUNT(Question.QuestionID) AS Occurrence
FROM
	CategoryQuestion
LEFT JOIN 
	Question ON CategoryQuestion.CategoryID = Question.CategoryID
GROUP BY
	CategoryQuestion.CategoryID
ORDER BY
	CategoryID ASC;
       
        
-- Question 7: Return occerrences of each questions in all exams:

SELECT 
	Question.QuestionID, Question.Content , 
    COUNT(ExamQuestion.QuestionID) AS Occurrence
FROM
	ExamQuestion
RIGHT JOIN
	Question ON ExamQuestion.QuestionID = Question.QuestionID
GROUP BY
	ExamQuestion.QuestionID
ORDER BY
	QuestionID ASC;
    

-- Question 8: Return question with most answer:

SELECT
	Answer.QuestionID, Question.Content, 
    COUNT(Answer.QuestionID) AS Occurrence
FROM 
	Answer
LEFT JOIN
	Question ON Question.QuestionID = Answer.QuestionID
GROUP BY
	Answer.QuestionID 
ORDER BY 
	Occurrence DESC
LIMIT 1;


-- Question 9: Return number of accounts in each group

SELECT
	GroupAccount.GroupID, `Group`.GroupName, 
    COUNT(GroupAccount.AccountID) '# of Accounts'
FROM 
	GroupAccount
RIGHT JOIN
	`Group` ON `Group`.GroupID = GroupAccount.GroupID
GROUP BY
	GroupAccount.AccountID
ORDER BY
	GroupAccount.GroupID ASC;


-- Question 10: Find the position with least number of people

SELECT
	`Account`.PositionID, `Position`.PositionName,
    COUNT(`Account`.PositionID) AS Members
FROM
	`Account`
JOIN
	`Position` ON `Position`.PositionID = `Account`.PositionID
GROUP BY
	`Account`.PositionID
ORDER BY
	Members ASC;


-- Question 11: Return how many dev, test, scum master, PM each department has


-- Question 12: Return information of questions

SELECT
	Question.QuestionID, Question.Content, TypeQuestion.TypeName AS `Question Type`, `Account`.FullName AS Creator, Question.CreateDate
FROM
	Question
LEFT JOIN
	`Account` ON Question.CreatorID = `Account`.AccountID
LEFT JOIN
	TypeQuestion ON Question.TypeID = TypeQuestion.TypeID;
    
    
-- Question 13: Return number of questions of each type

SELECT
	TypeQuestion.TypeID, TypeQuestion.TypeName,
    COUNT(Question.QuestionID) AS `# of Questions`
FROM
	TypeQuestion
LEFT JOIN
	Question ON TypeQuestion.TypeID = Question.TypeID
GROUP BY
	TypeID;


-- Question 14 & 15: Return group with no account

SELECT
	`Group`.GroupID, `Group`.GroupName
FROM
	`Group`
LEFT JOIN
	GroupAccount ON `Group`.GroupID = GroupAccount.GroupID
WHERE GroupAccount.GroupID is NULL;


-- Question 16: 

SELECT
	Question.QuestionID, Question.Content
FROM
	Question
WHERE 
	QuestionID NOT IN (SELECT QuestionID FROM Answer)
ORDER BY
	QuestionID ASC;
	