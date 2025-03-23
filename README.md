This is a springboot application designed to register students. Once the registration is complete , it automatically send an email to particular student's email. This is a maven project. HI!!! I'm Tharindu Ruwasanka. Task is to Develop rest API to register students, once the student registration is complete send email to the student. The application must containerized.

#Database credentials!!!!

Used port: 8081
Database name: student-db
Database username: root
Database password: root
#Email service credentials!!!

host: smtp.gmail.com
port: 587
username: tharinduruwasanka@gmail.com
password: csan uomn yula nqrr
#Steps

Initialize spring file using spring initializer. **Spring boot version: 3.4.4 **Java version: 17 **Packaging: Java
Create entity package(Model layer) under that create student.java class.
Create Controller Layer under that create StudentController.java class. It maps incoming requests to methods that handle the registration form. It sends the student data to the Service Layer and redirects or returns a view.
Create Service Layer under that: ** UserService (Interface): Defines the contract for services related to student registration. ** UserServiceImpl (Implementation): Implements the business logic and calls the Repository Layer to persist data.
Create Repository Layer. The Repository Layer is responsible for interacting with the database. ** UserRepo: Extends JpaRepository and provides methods for interacting with the database. It doesn't need to be explicitly implemented because Spring Data JPA automatically generates the implementation at runtime.
Create View Layer (HTML Templates). The View Layer is responsible for rendering the user interface. ** Register.html: This file contains the form that users will fill out to register. When the user submits the form, it sends a POST request to the controller to register the student. ** success.html: A page that confirms the student has been successfully registered.
#Test

Open project with Intelij Idea and run the project
To accesses the registration page of the application via the browser go to http://localhost:8081/
