USE Testing_system_2;
-- Insert values to table Department:

INSERT INTO Department(DepartmentName)
VALUES
						(N'Marketing'	),
						(N'Sale'		),
						(N'Bảo vệ'		),
						(N'Nhân sự'		),
						(N'Kỹ thuật'	),
						(N'Tài chính'	),
						(N'Phó giám đốc'),
						(N'Giám đốc'	),
						(N'Thư kí'		),
						(N'Bán hàng'	),
                        (N'Phòng chờ'	);


-- Insert values to table Position:

INSERT INTO `Position`
VALUES                 
					(1, 		'Excecutive'),
                    (2,			'Manager'),
                    (3,			'Assistant'),
                    (4,			'Office Manager'),
                    (5, 		'Officer'),
                    (6, 		'Test'),
                    (7, 		'Scrum Master'),
                    (8, 		'Developer'),
                    (9, 		'PM'),
                    (10, 		'Trainee');
         
         
-- Insert values to table Account:

INSERT INTO `Account`(Email, 					Username, 		Fullname, 		DepartmentID, PositionID, CreateDate)
VALUES	 	
					('nam123@gmail.com',		'nam123',		'Ta Thanh Nam',			5,		1,		'2018-09-22'),
                    ('trung456@gmail.com',		'trung123',		'Nguyen Van Trung',		2,		2,		'2018-03-05'),
                    ('van789@gmail.com',		'van789',		'Pham Thai Van',		2,		4,		'2018-11-12'),
                    ('dtdao145@gmail.com',		'dao145',		'Duong Thu Dao',		2,		3,		'2018-12-05'),
                    ('quan689@gmail.com',		'quang689',		'Pham Minh Quan',		1,		5,		'2019-01-31'),
                    ('thanh151@gmail.com',		'thanh151',		'Tran Xuan Thanh',		4,		6,		'2019-05-17'),
                    ('hoang3701@gmail.com',		'hoang3701',	'Nguyen The Hoang',		7,		8,		'2019-12-12'),
                    ('hien898@gmail.com',		'hien898',		'Nguyen Van Hien',		3,		9,		'2020-12-21'),
                    ('xuantruong04@gmail.com',	'truong04',		'Luong Xuan Truong',	2,		7,		'2020-12-27'),
                    ('dat202@gmail.com',		'dat202',		'Nguyen Cong Dat',		10,		8,		'2021-01-19');
         
                  
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
                    (11,		'Group K',			3,			'2020-03-12'),
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
					(10,		2,			'2020-04-24'),
                    (1,			2,			'2020-03-13'),
                    (1,			3,			'2020-03-14'),
                    (2,			5,			'2020-03-15'),
                    (2,			6,			'2020-03-16'),
                    (1,			5,			'2020-03-17');
	
    
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

INSERT INTO Question(     Content, 		CategoryID,   TypeID,   CreatorID,       CreateDate )
VALUES
					('Java Questions',		1,			1,			2,			'2020-04-05'),
					('PHP Questions',		10,			2,   		2,			'2020-04-05'),
					('C# Questions',		9,   		2,   		3,			'2020-04-06'),
					('ASP.NET Questions',	2,   		1,   		7,			'2020-04-06'),
					('Postman Questions',	5,   		1,   		5,			'2020-04-06'),
					('ADO.NET Questions',	3,   		2,   		6,			'2020-04-06'),
					('ASP.NET Questions',	2,   		1,   		7,			'2020-04-06'),
					('C++ Questions',		8,   		1,   		8,			'2020-04-07'),
					('SQL Questions',		4,   		2,   		9,			'2020-04-07'),
					('Python Questions1',	7,   		1,   		10,			'2020-04-07'),
                    ('Python Questions2',	7,   		1,   		10,			'2020-04-07'),
                    ('Python Questions3',	7,   		1,   		8,			'2021-01-07'),
                    ('Python Questions4',	7,   		1,   		8,			'2021-02-07'),
                    ('Python Questions5',	7,   		2,   		8,			'2021-02-08'),
                    ('Python Questions6',	7,   		2,   		7,			'2021-04-09'),
                    ('Python Questions7',	7,   		2,   		6,			'2021-05-11'),
                    ('ASP.NET Questions2',	2,   		1,   		7,			'2020-12-06'),
                    ('Postman Questions2',	5,   		1,   		5,			'2020-12-06'),
                    ('C++ Questions2',		8,   		1,   		8,			'2020-10-07'),
                    ('Java Questions2',		1,			1,			2,			'2020-9-05');


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