DROP TABLE IF EXISTS Invoice;
DROP TABLE IF EXISTS Pet_Name;
DROP TABLE IF EXISTS VisitDate;
DROP TABLE IF EXISTS PetOwner;
DROP TABLE IF EXISTS InvoiceAmount;
DROP TABLE IF EXISTS ownerAddress;
DROP TABLE IF EXISTS Hospital;
DROP TABLE IF EXISTS surgery;

CREATE TABLE Surgery (
                surgeryID serial primary key,
                surgeryName varchar(100) NOT NULL,
                surgeryCost varchar(75) NOT NULL
);

CREATE TABLE Hospital (
                hospitalID serial primary key,
                hospitalName varchar(100) NOT NULL
);

CREATE TABLE ownerAddress (
                ownerAddressID serial primary key,
                street varchar (25) NOT NULL,
                city varchar (25) NOT NULL,
                state varchar (35) NOT NULL,
                zipcode varchar (20) NOT NULL,
                petowner varchar (100) NOT NULL
);

CREATE TABLE InvoiceAmount (
        amountID serial primary key,
        tax varchar (50),
        surgeryID INT,
 FOREIGN KEY (surgeryID)
 REFERENCES surgery (surgeryID)
 );
 
CREATE TABLE PetOwner (
        ownerID serial primary key,
        firstName varchar (150) NOT NULL,
        lastName varchar (150) NOT NULL,
        phone varchar (15) NOT NULL,
        addressID INT
REFERENCES address (addressID)
FOREIGN KEY (addressID)
 );
    
CREATE TABLE visitDate (
    visitID serial primary key,
    surgeryID INT
REFERENCES surgery (surgeryID),
FOREIGN KEY (surgeryID)
);

CREATE TABLE Pet_name (
        petID serial primary key NOT NULL,
        Name varchar (100) NOT NULL,
        age int,
        animalID varchar (100) NOT NULL,
        ownerID int
REFERENCES petOwner (ownerID),
FOREIGN KEY (ownerID)
);
        
        
 
 
    pk_petID constraint
    pk_visitDate_surgery constraint
    pk_owner constraint 
    pk_invoice_Amount constraint
    pk_ownerAddressID constraint
    pk_hospitalID constraint
    pk_surgery constraint
    fk_invoice_Amount_surgery 
    fk_PetOwner_Address constraint
    fk_ownerID 