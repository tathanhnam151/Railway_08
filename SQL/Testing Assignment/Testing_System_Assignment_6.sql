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








