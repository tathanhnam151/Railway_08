USE Fresher;

-- Question 2: Return the list of trainees pass the test and sorted by months of birth date

SELECT 
    TraineeID, Full_Name, VTI_Account, Birth_Date, Gender, Training_Class, Evaluation_Notes
FROM
    Trainee
WHERE 
	(ET_IQ + ET_GMath) >= 20
AND 
	ET_IQ >= 8
AND 
	ET_GMATH >= 8
AND 
	ET_English >= 18
ORDER BY
	Month_of_Birthdate;
    

-- Question 3: Return the information of trainee who has the longest name

SELECT
	TraineeID, Full_name, VTI_Account, Birth_Date, Gender, Training_Class, Evaluation_Notes
FROM
	Trainee
WHERE
	LENGTH(Full_Name) = (SELECT MAX(LENGTH(Full_Name)) FROM Trainee);
    
    
-- Question 4: Return the list of trainees pass the test

SELECT 
    TraineeID, Full_Name, VTI_Account, Birth_Date, Gender, Training_Class, Evaluation_Notes
FROM
    Trainee
WHERE 
	(ET_IQ + ET_GMath) >= 20
AND 
	ET_IQ >= 8
AND 
	ET_GMATH >= 8
AND 
	ET_English >= 18;
    
    
-- Question 5: Delete the record of trainee with ID = 3

DELETE FROM 
	Trainee
WHERE 
	TraineeID = 3;


-- Question 6: Update the trainee with ID = 5 to classID = 2

UPDATE 
	Trainee
SET
	Training_Class = 2
WHERE
	TraineeID = 5;