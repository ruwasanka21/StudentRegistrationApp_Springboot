This is a springboot application designed to register students. Once the registration is complete , it automatically send an email to particular student's email. This is a maven project. HI!!! I'm Tharindu Ruwasanka. Task is to Develop rest API to register students, once the student registration is complete send email to the student. The application must containerized.

# Database credentials!!!!
1. Used port: 8081
2. Database name: student-db
3. Database username: root
4. Database password: root

# Email service credentials!!!
1. host: smtp.gmail.com
2. port: 587
3. username: tharinduruwasanka@gmail.com
4. password: csan uomn yula nqrr

# Used dependencies
1. Spring Boot DevTools
2. Lombok
3. Spring Web
4. Thymeleaf
5. Spring Data JPA
6. MySQL Driver

# Dockerfile

FROM openjdk:17-jdk-slim

#Set the working directory in the container
WORKDIR /app

#Copy the application JAR file into the container
COPY target/registerStudent-0.0.1-SNAPSHOT.jar app.jar

#Expose the application's port
EXPOSE 8081

#Define the entry point for the container
ENTRYPOINT ["java", "-jar", "app.jar"]


# Steps
1. Initialize spring file using spring initializer. 
      **Spring boot version: 3.4.4
      **Java version: 17
      **Packaging: Java
2. Create entity package(Model layer) under that create student.java class.
3. Create Controller Layer under that create StudentController.java class. It maps incoming requests to methods that handle the registration form. It sends the student data to the Service Layer and   
   redirects or returns a view.
4. Create Service Layer under that:
   ** UserService (Interface): Defines the contract for services related to student registration.
   ** UserServiceImpl (Implementation): Implements the business logic and calls the Repository Layer to persist data.
5. Create Repository Layer. The Repository Layer is responsible for interacting with the database.
   ** UserRepo: Extends JpaRepository and provides methods for interacting with the database. It doesn't need to be explicitly implemented because Spring Data JPA automatically generates the implementation     at runtime.
6. Create View Layer (HTML Templates). The View Layer is responsible for rendering the user interface.
   ** Register.html: This file contains the form that users will fill out to register. When the user submits the form, it sends a POST request to the controller to register the student.
   ** success.html: A page that confirms the student has been successfully registered.
   
# Test
1. Open project with Intelij Idea and run the project
2. To accesses the registration page of the application via the browser go to http://localhost:8081/
