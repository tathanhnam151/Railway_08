USE Testing_system_2;

-- Question 2: Show departments

SELECT 
	(DepartmentName)
FROM
    Department;


-- Question 3: Show Sale's Department ID:

SELECT
	DepartmentID
FROM
	Department
WHERE
	DepartmentName = 'Sale';
    
    
-- Question 4: Show account of whom has the longest name 

SELECT 
	*
FROM
	`Account`
WHERE
	LENGTH(Fullname) = (SELECT MAX(LENGTH(Fullname)) FROM `Account`);
    
    
-- Question 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id = 3    
SELECT 
	Email, Username, Fullname, length(Fullname)
FROM
	`Account`
WHERE
	DepartmentID = 3
AND
	LENGTH(Fullname) = (SELECT MAX(LENGTH(Fullname)) FROM `Account`
						WHERE DepartmentID = 3);
    

-- Question 6:

SELECT 
	GroupName
FROM
	`Group`
WHERE
	CreateDate < '2019-12-20';


-- Question 7:

SELECT
	QuestionID
FROM
	Answer
GROUP BY
	QuestionID
HAVING
	COUNT(AnswerID) > 3;
    
    
-- Question 8:
    
SELECT 
	ExamID, Title, CreateDate
FROM
	Exam
WHERE
	Duration > 60
AND
	CreateDate < '2019-12-20';


-- Question 9:

SELECT 
	*
FROM
	`Group`
ORDER BY CreateDate DESC
LIMIT 5;


-- Question 10:

SELECT 
    Fullname
FROM
    `Account`
WHERE
    (SUBSTRING_INDEX(FullName, ' ', - 1)) LIKE 'D%o';
    

-- Question 11:

SELECT 
    Fullname
FROM
    `Account`
WHERE
    (SUBSTRING_INDEX(FullName, ' ', - 1)) LIKE 'D%o';
    
-- Question 12:

-- DELETE FROM Exam 
-- WHERE
--   CreateDate < '2019-12-20';
    


-- Question 14: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn

UPDATE 		
	`Account` 
SET 		
	Fullname 	= 	'Nguyễn Bá Lộc', 
	Email 		= 	'loc.nguyenba@vti.com.vn'
WHERE 		
	AccountID = 5;
    
-- Question 15
    
UPDATE `GroupAccount` 
SET 
    GroupID = 4
WHERE
    AccountID = 5;
	
