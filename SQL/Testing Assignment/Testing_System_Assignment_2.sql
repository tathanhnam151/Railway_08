USE Testing_system_2;

-- Insert values to table Department:

INSERT INTO Department(DepartmentName)
VALUES
					('Marketing'),
                    ('Sale'),
                    ('Security'),
                    ('Human_Resource'),
                    ('Technical');


-- Insert values to table Position:

INSERT INTO `Position`(PositionName)
VALUES                 
					('Excecutive'),
                    ('Manager'),
                    ('Assistant'),
                    ('Officer'),
                    ('Trainee');
         
         
-- Insert values to table Account:

INSERT INTO `Account`(Email, Username, Fullname, DepartmentID, PositionID, CreateDate)
VALUES	 	
					('nam123@gmail.com',			'nam123',		'Ta_Thanh_Nam',			5,		1,		'2019-09-22'),
                    ('trung456@gmail.com',		'trung123',		'Nguyen_Van_Trung',		2,		2,		'2019-03-05'),
                    ('van789@gmail.com',			'van789',		'Pham_Thai_Van',		3,		4,		'2019-11-12'),
                    ('hien145@gmail.com',		'hien145',		'Tran_Thu_Hien',		2,		3,		'2019-12-05'),
                    ('quan689@gmail.com',		'quang689',		'Pham_Minh_Quan',		1,		5,		'2020-01-31'),
                    ('dat202@gmail.com',			'dat202',		'Nguyen_Cong_Dat',		4,		2,		'2019-05-19');
         
                  
-- Insert values to table Group:

INSERT INTO `Group`(GroupName, CreatorID, CreateDate)
VALUES
					('Group A',			1,			'2020-02-12'),
                    ('Group B',			2,			'2020-03-24'),
                    ('Group C',			3, 			'2020-03-27'),
                    ('Group D',			4,			'2020-04-14'),
					('Group E',			1,			'2020-04-29');


-- Insert values to table GroupAccount:

INSERT INTO GroupAccount
VALUES	
					(1,			1,			'2020-02-13'),
					(2,			2,			'2020-03-26'),
                    (3,			4,			'2020-03-28'),
                    (4,			6,			'2020-04-18'),
                    (5,			1,			'2020-04-29');
	
    
-- Insert values to table TypeQuestion:

INSERT INTO TypeQuestion
VALUES
					(1,			'Essay'),
                    (2,			'Multiple_Choice');
                    
                    
-- Insert values to table CategoryQuestion:

INSERT INTO CategoryQuestion
VALUES
					(1,			'Behavioral'),
                    (2,			'Competency_Based'),
                    (3,			'Problem_Solving'),
                    (4,			'Situational'),
                    (5,			'Company_Culture');
        
        
-- Insert values to table Question:

INSERT INTO Question
VALUES
					(1,			'Give an example of an occasion when you used logic to solve a problem.',															1,		1,		1,		'2020-05-28'),
                    (2,			'Tell us about a situation where you failed to communicate appropriately. In hindsight, what would you have done differently?',		2,		1,		2,		'2020-05-28'),
                    (3,			'How would you deal with an unanticipated understaffing situation?',																3,		1,		2,		'2020-05-30'),
                    (4,			'If you know your boss is 100% wrong about something how would you handle it?',														4,		1,		3,		'2020-05-30'),
                    (5,			'Choose the best three words that describe our company culture best.',																5,		2,		4,		'2020-06-01');


-- Insert values to table Answer:

INSERT INTO Answer
VALUES
					(1,			'Answer from Dan1',			1,		TRUE),
                    (2,			'Answer from Tom2',			2,		TRUE),
                    (3,			'Answer from Amy3',			3,		FALSE),
                    (4,			'Answer from Lucy4',		4,		FALSE),
                    (5,			'Answer from Lucy5',		5,		TRUE);
                    

-- Insert values to table Exam:

INSERT INTO Exam
VALUES
					(1,			101,		'Question1',		1,			1,			1,			'2020-05-29'),
                    (2,			102,		'Question2',		2,			2,			2,			'2020-05-29'),
                    (3,			103,		'Question3',		3,			3,			3,			'2020-05-31'),
                    (4,			104,		'Question4',		4,			4,			4,			'2020-05-31'),
                    (5,			105,		'Question5',		5,			5,			5,			'2020-06-02');


-- Insert values to table ExamQuestion:

INSERT INTO ExamQuestion
VALUES
					(1,			1),
                    (2,			2),
                    (3,			3),
                    (4,			4),
                    (5,			5);