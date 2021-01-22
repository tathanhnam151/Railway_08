DROP DATABASE IF EXISTS Extra_6;

CREATE DATABASE Extra_6;
USE Extra_6;

CREATE TABLE employee (
	EmployeeID					INT PRIMARY KEY AUTO_INCREMENT,
    EmployeeLastName			VARCHAR(30),
    EmployeeFirstName			VARCHAR(30),
    EmployeeHireDate			DATE,
    EmployeeStatus				VARCHAR(20),
    SupervisorID				INT,
    SocialSecurityNumber		VARCHAR(20),
    FOREIGN KEY (SupervisorID) REFERENCES employee(EmployeeID) ON DELETE CASCADE
);	
	
CREATE TABLE project (	
	ProjectID					INT PRIMARY KEY AUTO_INCREMENT,
    ManagerID					INT,
    ProjectName					VARCHAR(30),
    ProjectStartDate			DATE,
    ProjectDescription			VARCHAR(50),
    ProjectDetail				VARCHAR(50),
    ProjectCompletedOn			DATE,
    FOREIGN KEY (ManagerID) REFERENCES employee(EmployeeID) ON DELETE CASCADE
);

CREATE TABLE project_modules (
	ModuleID					INT PRIMARY KEY AUTO_INCREMENT,
    ProjectID					INT,
    EmployeeID					INT,
    ProjectModulesDate			DATE,
    ProjectModulesCompletedOn	DATE,
    ProjectModulesDescription	VARCHAR(50),
    FOREIGN KEY (ProjectID) REFERENCES project(ProjectID) ON DELETE CASCADE,
    FOREIGN KEY (EmployeeID) REFERENCES employee(EmployeeID) ON DELETE CASCADE
);

CREATE TABLE work_done (
	WorkDoneID					INT PRIMARY KEY AUTO_INCREMENT,
    EmployeeID					INT,
    ModuleID					INT,
	WorkDoneDate				DATE,
	WorkDoneDescription			VARCHAR(50),
    WorkDoneStatus				VARCHAR(30),
    FOREIGN KEY (EmployeeID) REFERENCES employee(EmployeeID) ON DELETE CASCADE,
    FOREIGN KEY (ModuleID) REFERENCES project_modules(ModuleID) ON DELETE CASCADE
);