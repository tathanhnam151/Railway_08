-- Extra Assignment 4 Querries

-- Question 3: Return employees with skill code Java

SELECT
	Employee_Table.Employee_Number, Employee_Table.Employee_Name, Department.Department_Name, employee_skill_table.Skill_Code
FROM
	Employee_Table
LEFT JOIN	
	Department ON Employee_table.Department_Number = Department.Department_Number
LEFT JOIN
	Employee_Skill_Table ON Employee_Table.Employee_Number = Employee_Skill_Table.Employee_Number
WHERE
	Employee_Skill_Table.Skill_Code = 'Java';
    
    
-- Question 4: Return departments with more than 3 members:

SELECT
	Department.Department_Number, Department.Department_Name,
    COUNT(Employee_Table.Employee_Number) AS Members
FROM
	Employee_Table
JOIN
	Department ON Department.Department_Number = Employee_Table.Department_Number
GROUP BY
	Employee_Table.Department_Number
HAVING
	Members > 3;

-- Question 5: List of employees in each department

SELECT
	Department.Department_Number, Department.Department_Name, Employee_Table.Employee_Number, Employee_Table.Employee_Name
FROM
	Employee_Table
JOIN
	Department ON Department.Department_Number = Employee_Table.Department_Number
ORDER BY
	Department_Number;


-- Question 6: List of employee have more than 1 skill code

SELECT
	Employee_Table.Employee_Number, Employee_Table.Employee_Name, department.Department_Name,
    COUNT(Employee_Skill_Table.Skill_Code) AS 'Number of skill codes'
FROM
	Employee_Table
JOIN
	Department ON Employee_Table.Department_Number = Department.Department_Number
JOIN
	Employee_Skill_Table ON Employee_Table.Employee_Number = Employee_Skill_Table.Employee_Number
GROUP BY
	Employee_Table.Employee_Number
HAVING
	COUNT(Employee_Skill_Table.Skill_Code) > 1;