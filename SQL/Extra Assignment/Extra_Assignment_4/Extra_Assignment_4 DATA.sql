-- Extra Assignment 4's Data

USE Extra_Assignment_4;

-- Insert data to Department Table:

INSERT INTO
	Department(Department_Name)
VALUES
	('Marketing'),
	('Sale'),
	('Bảo vệ'),
	('Nhân sự'),
	('Kỹ thuật'),
	('Tài chính'),
	('Phó giám đốc'),
	('Giám đốc'),
	('Thư kí'),
	('Bán hàng');
    

-- Insert data to Employee_Table

INSERT INTO 
	Employee_Table(Employee_Name, Department_Number)
VALUES
	('Nguyen Hai Dang'		,   '5'	),
	('Nguyen Chien Thang2'	,   '1'	),
    ('Nguyen Van Chien'		,   '2'	),
    ('Duong Do'				,   '3'	),
    ('Nguyen Chien Thang1'	,   '4'	),
    ('Ngo Ba Kha'			,   '6'	),
    ('Bui Xuan Huan'		,   '7'	),
    ('Nguyen Thanh Tung'	,   '8'	),
    ('Duong Van Huu'		,   '9'	),
    ('Nguyen Thanh Trung'	,   '1'	),
    ('Nguyen Cong Dat'		,   '1'	),
    ('Cristiano Ronaldo'	,   '2'	),
    ('Nguyen Tuan Huy'		,   '3'	),
    ('Hoang Minh Giam'		,   '4'	),
    ('Ho Tung Mau'			,   '4'	),
    ('Tran Duy Hung'		,   '4'	),
    ('Le Van Minh'			,   '6'	),
    ('Vi Ti Ai'				,   '10');
    
-- Insert data to Employee_Skill_Table

INSERT INTO
	Employee_Skill_Table(Employee_Number, Skill_Code, Date_Registered)
VALUES
	(1,			'Java',			'2020-01-02'),
    (3,			'Java',			'2020-01-02'),
    (4,			'Java',			'2020-01-02'),
    (5,			'Java',			'2020-01-03'),
    (3,			'ASP.NET',		'2020-01-03'),
    (1,			'ASP.NET',		'2020-01-03'),
    (3,			'ADO.NET',		'2020-01-04'),
    (5,			'SQL',			'2020-01-06'),
    (6,			'Postman',		'2020-01-06'),
    (2,			'Postman',		'2020-01-06'),
    (7,			'Ruby',			'2020-01-07'),
    (8,			'Python',		'2020-01-08'),
    (4,			'Python',		'2020-01-08'),
    (10,		'C++',			'2020-01-09'),
    (9,			'C Sharp',		'2020-01-12'),
    (10,		'PHP',			'2020-01-13');
	
    