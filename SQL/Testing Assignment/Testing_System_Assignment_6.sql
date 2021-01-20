-- Testing System 6

USE Testing_System_2;

-- Question 1: 

DROP PROCEDURE IF EXISTS dept_acc_info;

DELIMITER //

CREATE PROCEDURE dept_acc_info (IN in_dept_name VARCHAR(50))
BEGIN
	SELECT * 
	FROM `Account` a 
	JOIN Department d ON a.departmentID = d.departmentID
	WHERE d.departmentName = in_dept_name;
END//

DELIMITER ;

CALL dept_acc_info('marketing');  


-- Question 2:

DROP PROCEDURE IF EXISTS grp_acc_info; 

DELIMITER //

CREATE PROCEDURE grp_acc_info()
BEGIN
	SELECT g.groupID, g.GroupName, COUNT(a.AccountID) AS Accounts 
    FROM `Account` a
    JOIN `GroupAccount` ga ON a.AccountID = ga.AccountID
    JOIN `Group` g ON g.groupID = ga.groupID
    GROUP BY GroupName
    ORDER BY GroupName;
END//

DELIMITER ;

CALL grp_acc_info;


-- Question 3: 

DROP PROCEDURE IF EXISTS type_quest;

DELIMITER //

CREATE PROCEDURE type_quest()
BEGIN
	SELECT tq.TypeID, tq.TypeName, COUNT(q.QuestionID) AS `Questions`
    FROM typequestion tq
    LEFT JOIN question q ON tq.TypeID = q.TypeID
    WHERE 	MONTH(q.CreateDate) = MONTH(CURRENT_DATE())
		AND YEAR(q.CreateDate) = YEAR(CURRENT_DATE())
    GROUP BY q.TypeID;
END //
 
 DELIMITER ;
 
 CALL type_quest();


-- Question 4:

DROP PROCEDURE IF EXISTS Type_most_ques;

DELIMITER //

CREATE PROCEDURE Type_most_ques()
BEGIN
	SELECT tq.TypeID, COUNT(q.questionID) AS Questions
    FROM Question q
    JOIN TypeQuestion tq ON q.TypeID = tq.TypeID
    GROUP BY q.TypeID
    HAVING COUNT(q.questionID) IN (	SELECT MAX(CountQ) 
									FROM (	SELECT COUNT(QuestionID) AS CountQ
											FROM Question q
                                            GROUP BY TypeID) AS MaxAns);
END//

DELIMITER ;

CALL Type_most_ques;


-- Question 5: 

DROP PROCEDURE IF EXISTS TypeN_most_ques;

DELIMITER //

CREATE PROCEDURE TypeN_most_ques()
BEGIN
	SELECT tq.TypeName, COUNT(q.questionID) AS Questions
    FROM Question q
    JOIN TypeQuestion tq ON q.TypeID = tq.TypeID
    GROUP BY q.TypeID
    HAVING COUNT(q.questionID) IN (	SELECT MAX(CountQ) 
									FROM (	SELECT COUNT(QuestionID) AS CountQ
											FROM Question q
                                            GROUP BY TypeID) AS MaxAns);
END//

DELIMITER ;

CALL TypeN_most_ques;

-- Question 6:

DROP PROCEDURE IF EXISTS grp_user;

DELIMITER //

CREATE PROCEDURE grp_user(IN in_grp_user VARCHAR(50), IN in_select ENUM('Group', 'USER'))
BEGIN
	IF in_select = 'Group' 
    THEN
		SELECT * 
        FROM `group` 
        WHERE groupname LIKE in_grp_user;
	ELSE
		SELECT *
        FROM `Account` 
        WHERE UserName LIKE in_grp_user;
        END IF;   
END//

DELIMITER ;

CALL grp_user('nam123', 'USER');


-- Question 7:

DROP PROCEDURE IF EXISTS insert_account;

DELIMITER //
 
CREATE PROCEDURE insert_account(IN in_fullName VARCHAR(30), IN in_email VARCHAR(30))
BEGIN
	DECLARE Username VARCHAR(20) DEFAULT SUBSTRING_INDEX(in_email, '@', '1');
    DECLARE PositionID TINYINT DEFAULT 8;
    DECLARE DepartmentID TINYINT DEFAULT 11;
    DECLARE CreateDate DATE DEFAULT now();
    INSERT INTO `Account` (Email, UserName, FullName, DepartmentID, PositionID, CreateDate)
    VALUE				(in_email, Username, in_fullname, departmentID, positionID, CreateDate);
	SELECT * 
    FROM `Account` a 
    WHERE a.Username = UserName; 
END//	

DELIMITER ;
	

-- Question 8:

DROP PROCEDURE IF EXISTS longest_content;

DELIMITER //

CREATE PROCEDURE longest_content(IN in_type ENUM('Essay', 'Multiple-Choice'))
BEGIN 
	IF in_type = 'Essay' THEN
		SELECT tq.TypeName, q.QuestionID, q.Content, LENGTH(Content) AS `Length`
		FROM Question q
		JOIN TypeQuestion tq ON q.TypeID = tq.TypeID
		WHERE q.TypeID = 1
		AND LENGTH(content) = (SELECT MAX(LENGTH(Content)) FROM question WHERE q.typeID = 1);
    ELSE
		SELECT tq.TypeName, q.QuestionID, q.Content, LENGTH(Content) AS `Length`
		FROM Question q
		JOIN TypeQuestion tq ON q.TypeID = tq.TypeID
		WHERE q.TypeID = 2
		AND LENGTH(content) = (SELECT MAX(LENGTH(content)) FROM question WHERE q.typeID = 2);
    END IF;
END//

DELIMITER ;


-- Question 9:

DROP PROCEDURE IF EXISTS delete_exam;

DELIMITER //

CREATE PROCEDURE delete_exam(IN in_ID INT)
BEGIN
	DELETE FROM Exam 
    WHERE ExamID = in_ID;
END//

DELIMITER ;


-- Question 10:

DROP PROCEDURE IF EXISTS delete_exam_3;

DELIMITER //

CREATE PROCEDURE delete_exam_3()
BEGIN
	WITH Exam_3yrs AS (
		SELECT ExamID
        FROM Exam
        WHERE (YEAR(NOW()) - YEAR(CreateDate) > 3
        ))
	DELETE FROM Exam WHERE ExamID = (SELECT *
									FROM Exam_3yrs);
END//

DELIMITER ;


-- Question 11:

DROP PROCEDURE IF EXISTS delete_department;

DELIMITER //

CREATE PROCEDURE delete_department(IN in_dept VARCHAR(30))
BEGIN
	UPDATE `Account`
    SET DepartmentID = 11
    WHERE DepartmentID = in_dept;
    DELETE FROM Department WHERE departmentID = in_dept;
END//

DELIMITER ;


-- Question 12:

DROP PROCEDURE IF EXISTS question_each_month;

DELIMITER //

CREATE PROCEDURE question_each_month()
BEGIN
	SELECT MONTH(CreateDate) AS `Month`, COUNT(QuestionID) AS `Number of questions`
    FROM Question
    WHERE YEAR(CreateDate) = YEAR(NOW())
    GROUP BY `month`;    
END//

DELIMITER ;


-- Question 13:

DROP PROCEDURE IF EXISTS CountQuesPrev6Month;

DELIMITER //

CREATE PROCEDURE CountQuesPrev6Month()
BEGIN
	SELECT cqp.MONTH, COUNT(QuestionID) AS `COUNT`
    FROM
	(	SELECT MONTH(CURRENT_DATE - INTERVAL 5 MONTH) AS MONTH
		UNION
        SELECT MONTH(CURRENT_DATE - INTERVAL 4 MONTH) AS MONTH
        UNION
        SELECT MONTH(CURRENT_DATE - INTERVAL 3 MONTH) AS MONTH
        UNION
        SELECT MONTH(CURRENT_DATE - INTERVAL 2 MONTH) AS MONTH
        UNION
        SELECT MONTH(CURRENT_DATE - INTERVAL 1 MONTH) AS MONTH
        UNION
        SELECT MONTH(CURRENT_DATE - INTERVAL 0 MONTH) AS MONTH
	)
    AS cqp
    LEFT JOIN question ON cqp.MONTH = MONTH(CreateDate)
    GROUP BY cqp.MONTH
    ORDER BY cqp.MONTH ASC;
END//

DELIMITER ;
