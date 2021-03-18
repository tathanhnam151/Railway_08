DROP DATABASE IF EXISTS final_javacore;

CREATE DATABASE IF NOT EXISTS final_javacore;
USE final_javacore;

CREATE TABLE ExperienceCandidate (
	firstName 		VARCHAR(50) NOT NULL,
    lastName		VARCHAR(50) NOT NULL,
    phone			INT UNSIGNED UNIQUE,
	email			VARCHAR(50) NOT NULL UNIQUE,
    expInYear		INT UNSIGNED,
    ProSkill 		VARCHAR(50)
);

CREATE TABLE FresherCandidate(
	firstName 		VARCHAR(50) NOT NULL,
    lastName		VARCHAR(50) NOT NULL,
    phone			INT UNSIGNED UNIQUE,
	email			VARCHAR(50) NOT NULL UNIQUE,
    graduationRank	VARCHAR(20)
);