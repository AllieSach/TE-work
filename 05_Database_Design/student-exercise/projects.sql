 DROP TABLE IF EXISTS department_employee;
 DROP TABLE IF EXISTS project_employee;
 DROP TABLE IF EXISTS projects;
 DROP TABLE IF EXISTS Employees;
 DROP TABLE IF EXISTS departments;
     
 CREATE TABLE departments
        (
                departmentID SERIAL,
                department VARCHAR(160) NOT NULL,
                
                constraint pk_employee_identifier PRIMARY KEY (department_Id)
        );  

 CREATE TABLE employees
        ( 
                employees_Id SERIAL,
                title VARCHAR(160) NOT NULL,
                last_Name VARCHAR(50) NOT NULL,
                first_Name VARCHAR(50) NOT NULL,
                gender VARCHAR(6) NOT NULL,
                date_of_Birth date NOT NULL,
                date_of_Hire date NOT NULL,
                
                constraint pk_employees_Id PRIMARY KEY (employees_Id)   
        );
        
 
 CREATE TABLE department_employee
        (       
                departments_Id int,
                employees_Id int,
                constraint fk_employee_department FOREIGN KEY (employees_Id) references employees (employees_Id),
                constraint fk_departments_identifier FOREIGN KEY (department_Id) references departments (depatrment_Id)
        );

 CREATE TABLE projects
        (
                projects_Id SERIAL,
                projects_Name VARCHAR(160) NOT NULL,
                projects_start_Date date NOT NULL,
                
                constraint pk_projects_Id PRIMARY KEY (projects_Id)
        ); 
 
 CREATE TABLE project_employee
        (
               
                employee_id int NOT NULL,
                project_id int NOT NULL,
                
                
                constraint fk_employee_project FOREIGN KEY (employee_Id) references employee (employee_Id)
                
        );        
