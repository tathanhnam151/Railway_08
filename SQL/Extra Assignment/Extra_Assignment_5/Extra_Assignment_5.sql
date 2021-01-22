-- Extra Assignment 5
USE adventureworks;

-- Excercise 1: Subquerry
-- Question 1:

SELECT `Name`
FROM Product p
WHERE p.productsubcategoryID = (SELECT productsubcategoryID 
                                FROM Productsubcategory 
                                WHERE `Name` = 'Saddles');
    
    
-- Question 2:

SELECT `Name`
FROM Product p
WHERE p.ProductSubcategoryID IN (	SELECT productsubcategoryID 
									FROM Productsubcategory 
									WHERE `Name` LIKE 'Bo%');


-- Question 3:

SELECT p.`Name`, p.ListPrice
FROM Product p
JOIN productsubcategory ps ON p.ProductSubcategoryID = ps.ProductSubcategoryID
WHERE ps.ProductSubcategoryID = 3 
AND ListPrice = (	SELECT MIN(ListPrice) 
					FROM Product p
					JOIN productsubcategory ps ON p.ProductSubcategoryID = ps.ProductSubcategoryID
					WHERE ps.ProductSubcategoryID = 3);

-- Excercise 2: JOIN 
-- Question 1:

SELECT c.`Name`, s.`Name`
FROM countryregion c
JOIN stateprovince s ON c.CountryRegionCode = s.CountryRegionCode;


-- Question 2:

SELECT c.`Name`, s.`Name`
FROM countryregion c
JOIN stateprovince s ON c.CountryRegionCode = s.CountryRegionCode
WHERE c.`name` IN ('Germany', 'Canada');


-- Question 3:

SELECT sh.SalesOrderID, sh.OrderDate, sh.SalesPersonID, sp.salespersonID AS BusinessEntityID, sp.Bonus, sp.SalesYTD
FROM Salesorderheader sh
JOIN Salesperson sp ON sh.salespersonID = sp.salespersonID;


-- Question 4:

SELECT sh.SalesOrderID, sh.OrderDate, em.Title, sp.Bonus, sp.SalesYTD
FROM Salesorderheader sh
JOIN Salesperson sp ON sh.salespersonID = sp.salespersonID					
JOIN Employee em ON sh.salespersonID = em.employeeID;	
	
