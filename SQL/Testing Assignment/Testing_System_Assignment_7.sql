-- Testing System 7

USE Testing_System_2;

-- Question 1: Prevent user from adding group with create date older than 1 year

DROP TRIGGER IF EXISTS 	trig_no_group_1_year;

DELIMITER //
	CREATE TRIGGER trig_no_group_1_year
    BEFORE INSERT ON `Group`
    FOR EACH ROW
    BEGIN
		IF	(NEW.CreateDate < DATE_SUB(CURRENT_DATE(), INTERVAL 1 YEAR)) THEN 
        SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'Cannot add group created for one year or previous';
        END IF;
    END//
DELIMITER ;
    
    
-- Question 2: Prevent adding account from department sale
    
DROP TRIGGER IF EXISTS trig_no_sale_account;

DELIMITER //
	CREATE TRIGGER trig_no_sale_account
	BEFORE INSERT ON `Account`
	FOR EACH ROW
	BEGIN
		IF (NEW.DepartmentID = 2) THEN
		SIGNAL SQLSTATE '12345'
		SET MESSAGE_TEXT = 'Department "Sale" cannot add more user';
		END IF;
END//
DELIMITER ;


-- Question 3: Set groups' maximum #members to 5

DROP TRIGGER IF EXISTS trig_groupmem_max5;

DELIMITER //
	CREATE TRIGGER trig_groupmem_max5
    BEFORE INSERT ON `GroupAccount`
    FOR EACH ROW 
    BEGIN
		IF 	  ( SELECT COUNT(AccountID) 
				FROM `GroupAccount`
				GROUP BY GroupID
                HAVING COUNT(AccountID) >= 5 ) THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'Cannot add more user. Maximum users in a group is "5"' ;
        END IF;
    END//
DELIMITER ;
    

-- Question 4: Set exam's maximum #question to 10

DROP TRIGGER IF EXISTS trig_examq_max10;

DELIMITER //
	CREATE TRIGGER trig_examq_max10
    BEFORE INSERT ON `ExamQuestion`
    FOR EACH ROW 
    BEGIN
		IF 	  ( SELECT COUNT(QuestionID) 
				FROM `GroupAccount`
				GROUP BY ExamID
                HAVING COUNT(QuestionID) > 10 ) THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'Cannot add more user. Maximum users in a group is "5"' ;
        END IF;
    END//
DELIMITER ;


-- Question 5: Prevent user from deleting admin account

DROP TRIGGER IF EXISTS trig_no_del_admin;

DELIMITER //
	CREATE TRIGGER trig_no_del_admin
    BEFORE DELETE ON `Account`
    FOR EACH ROW 
    BEGIN
		IF (OLD.Email = 'admin@gmail.com') THEN
        SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'Cannot delete an admin account';
        END IF;
	END//
DELIMITER ;


-- Question 6: Configure default departmentName = waiting room

DROP TRIGGER IF EXISTS trig_default_dept_waiting;

DELIMITER //
    CREATE TRIGGER trig_default_dept_waiting
    BEFORE INSERT ON `Account`
    FOR EACH ROW
    BEGIN
		 DECLARE WaitingDepartmentID TINYINT UNSIGNED;
			SELECT DepartmentID INTO WaitingDepartmentID
            FROM Department
            WHERE DepartmentName = 'Phòng chời';
		IF NEW.DepartmentID IS NULL 
        THEN SET NEW.DepartmentID = WaitingDepartmentID;
		END IF;
	END//
DELIMITER ;


-- Question 7: Configure maximum answers for each question = 4 and maximum correct answers = 2

DROP TRIGGER IF EXISTS trig_ques_and_ans;

DELIMITER //
	CREATE TRIGGER trig_ques_and_ans
	BEFORE INSERT ON Answer
    FOR EACH ROW
    BEGIN
		IF (SELECT COUNT(AnswerID) 
			FROM Answer
			GROUP BY QuestionID
			HAVING COUNT(AnswerID) >= 4) THEN
        SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'Cannot add more answer. Maximum number of answers for each question is 4';
        END IF;
        IF (SELECT COUNT(AnswerID)
			FROM Answer
            WHERE isCorrect = '1'
            GROUP BY QuestionID
            HAVING COUNT(AnswerID) >= 2) THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'Cannot add more correct answer. Maximum number of answers for each question is 2';
        END IF;
	END//
DELIMITER ;
 
 
-- Question 8: Update gender

DROP TRIGGER IF EXISTS trig_update_gender;

DELIMITER //
	CREATE TRIGGER trig_update_gender
	BEFORE INSERT ON `Account`
    FOR EACH ROW 
    BEGIN
		IF NEW.gender = 'Male' THEN
        SET NEW.gender = 'M';
        ELSEIF NEW.gender = 'Female' THEN
        SET NEW.gender = 'F';
        ELSEIF NEW.gender = 'Unknow' THEN
        SET NEW.gender = 'U';
        END IF;
    END//
DELIMITER ;


-- Question 9: No delete exam created for the last 2 days 

DROP TRIGGER IF EXISTS trig_no_del_exam_2days;

DELIMITER //
	CREATE TRIGGER trig_no_del_exam_2days
	BEFORE DELETE ON Exam
    FOR EACH ROW
    BEGIN
		IF OLD.CreateDate > DATE_SUB((NOW()), INTERVAL 2 DAY) THEN
        SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'Can not delete exam created for the last 2 days';
        END IF;
	END//
DELIMITER ;

DELETE FROM Exam WHERE ExamID = 11;