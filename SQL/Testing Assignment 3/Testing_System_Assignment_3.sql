USE Testing_system_2;

-- Insert values to table Department:

INSERT INTO Department
VALUES
					(1,			'Marketing'),
                    (2,			'Sale'),
                    (3,			'Logistics'),
                    (4, 		'Human Resource'),
                    (5, 		'Technical'),
                    (6, 		'Production'),
                    (7, 		'Research and Development'),
                    (8, 		'Purchasing'),
                    (9, 		'Accounting and Finance'),
                    (10, 		'Security');


-- Insert values to table Position:

INSERT INTO `Position`
VALUES                 
					(1, 		'Excecutive'),
                    (2,			'Manager'),
                    (3,			'Assistant'),
                    (4,			'Office Manager'),
                    (5, 		'Officer'),
                    (6, 		'Receptionist'),
                    (7, 		'Foreperson'),
                    (8, 		'Supervisor'),
                    (9, 		'Shipping and Receiving'),
                    (10, 		'Trainee');
         
         
-- Insert values to table Account:

INSERT INTO `Account`
VALUES	 	
					(1,			'nam123@gmail.com',			'nam123',		'Ta Thanh Nam',			5,		1,		'2018-09-22'),
                    (2,			'trung456@gmail.com',		'trung123',		'Nguyen Van Trung',		2,		2,		'2018-03-05'),
                    (3,			'van789@gmail.com',			'van789',		'Pham Thai Van',		3,		4,		'2018-11-12'),
                    (4,			'dtdao145@gmail.com',		'dao145',		'Duong Thu Dao',		2,		3,		'2018-12-05'),
                    (5,			'quan689@gmail.com',		'quang689',		'Pham Minh Quan',		1,		5,		'2019-01-31'),
                    (6,			'thanh151@gmail.com',		'thanh151',		'Tran Xuan Thanh',		4,		6,		'2019-05-17'),
                    (7,			'hoang3701@gmail.com',		'hoang3701',	'Nguyen The Hoang',		7,		8,		'2019-12-12'),
                    (8,			'hien898@gmail.com',		'hien898',		'Nguyen Van Hien',		3,		9,		'2020-02-24'),
                    (9,			'xuantruong04@gmail.com',	'truong04',		'Luong Xuan Truong',	6,		7,		'2020-07-27'),
                    (10,		'dat202@gmail.com',			'dat202',		'Nguyen Cong Dat',		10,		8,		'2020-11-19');
         
                  
-- Insert values to table Group:

INSERT INTO `Group`
VALUES
					(1,			'Group A',			1,			'2019-02-12'),
                    (2,			'Group B',			2,			'2019-03-24'),
                    (3,			'Group C',			3, 			'2019-03-27'),
                    (4,			'Group D',			4,			'2019-04-14'),
                    (5,			'Group E',			4,			'2019-07-25'),
                    (6,			'Group F',			5,			'2019-09-06'),
                    (7,			'Group G',			3,			'2019-10-20'),
                    (8,			'Group H',			3,			'2020-01-11'),
                    (9,			'Group I',			1,			'2020-03-12'),
					(10,		'Group X',			2,			'2020-04-23');


-- Insert values to table GroupAccount:

INSERT INTO GroupAccount
VALUES	
					(1,			1,			'2019-02-13'),
                    (2,			2,			'2019-03-25'),
                    (3,			3, 			'2019-03-28'),
                    (4,			4,			'2019-04-15'),
                    (5,			4,			'2019-07-26'),
                    (6,			5,			'2019-09-07'),
                    (7,			3,			'2019-10-21'),
                    (8,			3,			'2020-01-12'),
                    (9,			1,			'2020-03-13'),
					(10,		2,			'2020-04-24');
	
    
-- Insert values to table TypeQuestion:

INSERT INTO TypeQuestion
VALUES
					(1,			'Essay'),
                    (2,			'Multiple Choice');
                    
                    
-- Insert values to table CategoryQuestion:

INSERT INTO CategoryQuestion(CategoryName)
VALUES
					('Java'			),
					('ASP.NET'		),
					('ADO.NET'		),
					('SQL'			),
					('Postman'		),
					('Ruby'			),
					('Python'		),
					('C++'			),
					('C Sharp'		),
					('PHP'			);
        
        
-- Insert values to table Question:

INSERT INTO Question(Content, CategoryID, TypeID, CreatorID, CreateDate )
VALUES
					('Java Questions',		1,			1,			2,			'2020-04-05'),
					('PHP Questions',		10,			2,   		2,			'2020-04-05'),
					('C# Questions',		9,   		2,   		3,			'2020-04-06'),
					('Ruby Questions',		6,   		1,   		4,			'2020-04-06'),
					('Postman Questions',	5,   		1,   		5,			'2020-04-06'),
					('ADO.NET Questions',	3,   		2,   		6,			'2020-04-06'),
					('ASP.NET Questions',	2,   		1,   		7,			'2020-04-06'),
					('C++ Questions',		8,   		1,   		8,			'2020-04-07'),
					('SQL Questions',		4,   		2,   		9,			'2020-04-07'),
					('Python Questions',	7,   		1,   		10,			'2020-04-07');


-- Insert values to table Answer:

INSERT INTO Answer(Content, QuestionID, isCorrect	)
VALUES
					('Trả lời 01',			1,			0),
					('Trả lời 02', 			1,			1),
                    ('Trả lời 03',   		1,			0),
                    ('Trả lời 04',   		1,			1),
                    ('Trả lời 05',   		2,			1),
                    ('Trả lời 06',   		3,			1),
                    ('Trả lời 07',   		4,			0),
                    ('Trả lời 08',   		8,			0),
                    ('Trả lời 09',   		9,			1),
                    ('Trả lời 10',   		10,			1);
                    

-- Insert values to table Exam:

INSERT INTO Exam(`Code`, Title, CategoryID, Duration, CreatorID, CreateDate )
VALUES
					('VTIQ001'		, 'Đề thi C#'			,	1			,	60		,   '5'			,'2019-04-05'),
					('VTIQ002'		, 'Đề thi PHP'			,	10			,	60		,   '2'			,'2019-04-05'),
                    ('VTIQ003'		, 'Đề thi C++'			,	9			,	120		,   '2'			,'2019-04-07'),
                    ('VTIQ004'		, 'Đề thi Java'			,	6			,	60		,   '3'			,'2020-04-08'),
                    ('VTIQ005'		, 'Đề thi Ruby'			,	5			,	120		,   '4'			,'2020-04-10'),
                    ('VTIQ006'		, 'Đề thi Postman'		,	3			,	60		,   '6'			,'2020-04-05'),
                    ('VTIQ007'		, 'Đề thi SQL'			,	2			,	60		,   '7'			,'2020-04-05'),
                    ('VTIQ008'		, 'Đề thi Python'		,	8			,	60		,   '8'			,'2020-04-07'),
                    ('VTIQ009'		, 'Đề thi ADO.NET'		,	4			,	90		,   '9'			,'2020-04-07'),
                    ('VTIQ010'		, 'Đề thi ASP.NET'		,	7			,	90		,   '10'		,'2020-11-20');


-- Insert values to table ExamQuestion:

INSERT INTO ExamQuestion
VALUES
					(	1	,		5		),
					(	2	,		10		), 
					(	3	,		4		), 
					(	4	,		3		), 
					(	5	,		7		), 
					(	6	,		10		), 
					(	7	,		2		), 
					(	8	,		10		), 
					(	9	,		9		), 
					(	10	,		8		); 