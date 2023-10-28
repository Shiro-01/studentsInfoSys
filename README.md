# Students Information System

This is a simple Java project for a Students Information System using Spring Boot. It provides basic functionality to manage student data, including their name, date of birth, and email.

## Prerequisites

Before running this project, you should have the following software installed on your system:

- Java 17
- Maven
- MySQL
- Your favorite Integrated Development Environment (IDE) for Java (e.g., IntelliJ IDEA, Eclipse)

## Project Structure

The project is structured as follows:

- `pom.xml`: This is the project's Maven configuration file, which includes all the dependencies and plugins needed for building and running the project.
- `application.properties`: This file contains the configuration for the Spring Boot application, including the database connection settings.
- `StudentsInfoSysApplication.java`: The main application class, which contains the `main` method to start the Spring Boot application.
- `StudentService.java`: A service class that handles student-related business logic.
- `StudentRepository.java`: An interface that extends the JpaRepository and provides methods for interacting with the database.
- `StudentController.java`: A RESTful controller that defines API endpoints to retrieve student data.
- `StudentConfig.java`: Configuration class that initializes some sample student data in the database.
- `Student.java`: Entity class that represents the student object and is mapped to the database.

## How to Run

1. Clone or download this repository to your local machine.

2. Open the project in your preferred Java IDE.

3. Make sure you have MySQL installed and running. Update the `application.properties` file with your MySQL database connection details.

4. Build the project using Maven:

   ```bash
   mvn clean install

5. Run the Spring Boot application using your IDE or by running the following command:
   ```bash
   mvn spring-boot:run


6. The application will start on port 9090 (as configured in application.properties). You can access the API at http://localhost:9090/api/v1/students.
end

## Authour
This project was created by Abdelrahman Hewala. If you have any questions or need assistance, you can reach out to [eng.abdulrahman.shrief@gmail.com
].
