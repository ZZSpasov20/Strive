CREATE DATABASE StriveProject
 
USE StriveProject
  
CREATE TABLE Clients(
    [ClientId] INT PRIMARY KEY IDENTITY(1,1),
    [FirstName] NVARCHAR(50) NOT NULL,
    [LastName] NVARCHAR(50) NOT NULL,
	[Username] VARCHAR(65) NOT NULL,
    [EmailAddress] VARCHAR(65) NOT NULL,
    [Password] NVARCHAR(100) NOT NULL,
	[ProfilePicture] VARCHAR(255) NOT NULL, 
    [BirthDate] DATE NOT NULL,
	[DeletedAt] DATE NULL
);


CREATE TABLE Programs(
    [ProgramId] INT PRIMARY KEY IDENTITY(1,1),
    [ClientId] INT NOT NULL,
    [Name] VARCHAR(50) NOT NULL,
	[CreatedAt] DATE NOT NULL,
	[DeletedAt] DATE NULL
);
ALTER TABLE Programs
ADD FOREIGN KEY ([ClientId]) REFERENCES Clients([ClientId]);

CREATE TABLE Days(
    [DayId] INT PRIMARY KEY IDENTITY(1,1),
    [ProgramId] INT NOT NULL,
    [Name] VARCHAR(50) NOT NULL,
	[DeletedAt] DATE NULL
);
ALTER TABLE Days
ADD FOREIGN KEY ([ProgramId]) REFERENCES Programs([ProgramId]);


CREATE TABLE Exercises(
    [ExerciseId] INT PRIMARY KEY IDENTITY(1,1),
    [Name] VARCHAR(50) NOT NULL,
    [Description] VARCHAR(MAX) NOT NULL
);

CREATE TABLE DaysExercises(
    [DayId] INT NOT NULL,
    [ExerciseId] INT NOT NULL,
    [ExerciseOrder] INT NOT NULL,
    [SetNumber] INT NOT NULL,
	[DeletedAt] DATE NULL
    PRIMARY KEY ([DayId],[ExerciseId])
);
ALTER TABLE DaysExercises
ADD FOREIGN KEY ([DayId]) REFERENCES Days([DayId]);
ALTER TABLE DaysExercises
ADD FOREIGN KEY ([ExerciseId]) REFERENCES Exercises([ExerciseId]);

CREATE TABLE Records(
    [RecordId] INT PRIMARY KEY IDENTITY(1,1),
	[DayId] INT NOT NULL,
    [ExerciseId] INT NOT NULL,
    [SetNumber] INT NOT NULL,
    [Reps] INT NOT NULL,
    [Weight] INT NOT NULL,
    [Date] DATE NOT NULL,
	[DeletedAt] DATE NULL
);
ALTER TABLE Records
ADD FOREIGN KEY ([ExerciseId]) REFERENCES Exercises([ExerciseId]);
ALTER TABLE Records
ADD FOREIGN KEY ([DayId]) REFERENCES Days([DayId]);