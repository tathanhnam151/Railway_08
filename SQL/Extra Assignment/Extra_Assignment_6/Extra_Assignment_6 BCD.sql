-- Question b) remove project finished for more than 3 years

USE Extra_6;

DROP PROCEDURE IF EXISTS Remove_p_3months;

DELIMITER //

CREATE PROCEDURE Remove_p_3months()
BEGIN
	SELECT * FROM project p
    WHERE ((CURRENT_DATE - INTERVAL 3 MONTH) > (ProjectCompletedOn));
	WITH Project3months AS (
		SELECT ProjectID
        FROM Project
        WHERE ((CURRENT_DATE - INTERVAL 3 MONTH) > (ProjectCompletedOn)
        ))
    DELETE FROM Project WHERE projectID = (SELECT * FROM Project3months);
END//

DELIMITER ;


-- Question c)

DROP PROCEDURE IF EXISTS In_progress;

DELIMITER //

CREATE PROCEDURE In_progress()
BEGIN
	SELECT * FROM project module
END//

DELIMITER ;
