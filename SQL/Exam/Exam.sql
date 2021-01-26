-- SQL Exam
-- Ta Thanh Nam
-- Railway 08

-- 1. Create databse "ThucTap"

DROP DATABASE IF EXISTS ThucTap;

CREATE DATABASE ThucTap;
USE ThucTap;

-- Create table "country"
CREATE TABLE country(
	country_id			TINYINT PRIMARY KEY AUTO_INCREMENT,
    country_name		VARCHAR(20)
);

-- Create table "location"
CREATE TABLE location(
	location_id			INT PRIMARY KEY AUTO_INCREMENT,
    street_address		VARCHAR(80),
    postal_code			INT,
    country_id			TINYINT,
    FOREIGN KEY (country_id) REFERENCES country(country_id) ON DELETE CASCADE
);

-- Create table "employee"
CREATE TABLE employee(
	employee_id			INT PRIMARY KEY AUTO_INCREMENT,
    full_name			VARCHAR(30),
    email				VARCHAR(30),
    location_id			INT,
	FOREIGN KEY (location_id) REFERENCES location(location_id) ON DELETE SET NULL
);


-- Insert data
INSERT INTO country(country_name)
VALUES 				('Vietnam'),
					('United States'),
					('England');
                
INSERT INTO location(street_address,				postal_code, 	country_id)
VALUES				('Ngo 192 Yen Hoa',	 			100000,			1),
					('270 Mohegan Ave',				06320,			2),
                    ('London SW7 2AZ',				533625,			3),
                    ('100 W College St, Granville',	43023,			2);
                    
INSERT INTO employee(full_name,		 	email, 							location_id)
VALUES				('Ta Thanh Nam',	'tathanhnam151@gmail.com',		1),
                    ('Lebron James',	'lebronjames23@gmail.com',		2),
                    ('Jamie Vardy',		'jamievardy09@gmail.com',		3),
                    ('Stephen Curry',	'nn03@gmail.com',				4);
                    
                    
-- 2. Querries
-- a) Lấy tất cả các nhân viên thuộc Việt nam

SELECT e.employee_id AS `ID`, e.full_name AS `Full Name`, e.email AS `Email`, l.street_address AS `Address`, l.postal_code AS `Postal Code`, c.country_name AS `Country`
FROM employee e
LEFT JOIN location l ON e.location_id = l.location_id
LEFT JOIN country c ON l.country_id = c.country_id
WHERE e.location_ID = (	SELECT	l.location_id
						FROM location l
                        JOIN country c ON l.country_id = c.country_id
                        WHERE c.country_name = 'Vietnam');
                        
-- b) Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"

SELECT c.country_name AS `Country Name`, e.full_name AS `Full Name`, e.email AS `Email`
FROM employee e
LEFT JOIN location l ON e.location_id = l.location_id
LEFT JOIN country c ON l.country_id = c.country_id
WHERE e.email = 'nn03@gmail.com';

-- c) Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc.

SELECT c.country_id AS `ID`, c.country_name AS `Country`, COUNT(e.employee_id)AS Members
FROM employee e 
JOIN location l ON e.location_id = l.location_id
JOIN country c ON l.country_id = c.country_id
GROUP BY c.country_id
ORDER BY c.country_id ASC;
                
                
-- 3. Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa 10 employee
DROP TRIGGER IF EXISTS trig_max_10_employees;

DELIMITER //
CREATE TRIGGER trig_max_10_employees
AFTER INSERT ON employee
FOR EACH ROW
BEGIN
	IF 10 < ANY(	SELECT COUNT(l.country_id) 
					FROM employee e
                    JOIN location l ON e.location_id = l.location_id
					JOIN country c ON l.country_id = c.country_id
					GROUP BY l.country_id) THEN
	SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT = 'Cannot add more user from this country, maximum users for each country is 10';
    END IF;
END//
DELIMITER ;


-- 4 Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở location đó sẽ có location_id = null
-- FOREIGN KEY (location_id) REFERENCES location(location_id) ON DELETE SET NULL
                    
				