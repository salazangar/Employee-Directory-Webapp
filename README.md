# Employee Management WebApp

### Overview
This project is a web application built with Spring Boot that allows users to add, change, and delete employee names and emails. It is connected to a MySQL database using JPA/Hibernate for data persistence. The user interface is created using Thymeleaf.

### Features
- Add new employees with name and email
- Update existing employee details
- Delete employees
- View a list of all employees

### Technologies Used
- Spring Boot: Framework for building the web application
- JPA/Hibernate: For Object-Relational Mapping (ORM) with MySQL
- MySQL: Database for storing employee information
- Thymeleaf: For server-side rendering of web pages

### Pre-requisites
- Java Development Kit (JDK) 8 or higher
- Maven
- MySQL

### Installation
1. Clone the Repository
```
git clone https://github.com/salazangar/Employee-Directory-Webapp.git
cd Employee-Directory-Webapp
```
2. Set Up MySQL Database
   - run the script present in the 'sql-scripts' folder
   - Update the application.properties file with your MySQL database credentials:
     ```
       spring.datasource.url=jdbc:mysql://localhost:3306/employee_directory
      spring.datasource.username=your_mysql_username
      spring.datasource.password=your_mysql_password
     ```
3. Build and run the application:
   ```
   mvn clean install
   mvn spring-boot:run
   ```
4. Access the application:
- Open your web browser and go to http://localhost:8080.

### Usage
#### Adding an Employee

- In the "Employee Directory" page, click on "Add Employee" button. 
- Enter the employee's name and email.
- Click the "Add" button to save the employee details to the database.

Updating an Employee
- In the "Employee Directory" page, click on the "Update" button next to the employee you want to update.
- Modify the employee's details.
- Click the "Update" button to save changes.

Deleting an Employee
- In the "Employee Directory" page, click on the "Delete" button next to the employee you want to remove.
- Confirm the deletion.

### Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.

### Contact

For any inquiries, please contact sidharthm673@gmail.com










