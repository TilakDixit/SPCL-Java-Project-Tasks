# Employee Management RESTful API

A CRUD (Create, Read, Update, Delete) API for managing employee records built using Spring Boot and MySQL.  

## Features
- Add a new employee
- Retrieve all employees or a specific employee by ID
- Update employee details
- Delete an employee record
- Input validation (e.g., salary must be positive)

## Technologies Used
- **Java**  
- **Spring Boot** (Web, Data JPA, Validation)  
- **MySQL**  
- **Jakarta Validation**  

---

## Setup Instructions


### Prerequisites
1. JDK 17 or higher  
2. MySQL installed and running  
3. Maven or your preferred build tool installed
### Update the database configuration in the src/main/resources/application.properties file:
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
### The following dependencies are used in the pom.xml file:
<dependencies>
    <!-- Spring Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Data JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- MySQL Driver -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
    </dependency>

    <!-- Jakarta Validation -->
    <dependency>
        <groupId>jakarta.validation</groupId>
        <artifactId>jakarta.validation-api</artifactId>
        <version>3.0.2</version>
    </dependency>

    <!-- Spring Boot Starter Test (optional for testing) -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>

### 
Here’s an updated README.md file that includes the dependencies used in your project:

markdown
Copy code
# Employee Management RESTful API

A CRUD (Create, Read, Update, Delete) API for managing employee records built using Spring Boot and MySQL.  

## Features
- Add a new employee
- Retrieve all employees or a specific employee by ID
- Update employee details
- Delete an employee record
- Input validation (e.g., salary must be positive)

## Technologies Used
- **Java**  
- **Spring Boot** (Web, Data JPA, Validation)  
- **MySQL**  
- **Jakarta Validation**  

---

## Setup Instructions

### Prerequisites
1. JDK 17 or higher  
2. MySQL installed and running  
3. Maven or your preferred build tool installed  

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/employee-management-api.git
   cd employee-management-api
Update the database configuration in the src/main/resources/application.properties file:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Build and run the application:

bash
Copy code
mvn clean install
mvn spring-boot:run
The application will be accessible at http://localhost:8080.

API Endpoints
Base URL
bash
Copy code
http://localhost:8080/api/employees
Endpoints
HTTP Method	Endpoint	Description	Example Request Body
POST	/	Create a new employee	{ "name": "John Doe", "position": "Developer", "salary": 60000 }
GET	/	Get all employees	-
GET	/{id}	Get employee by ID	-
PUT	/{id}	Update an employee	{ "name": "Jane Doe", "position": "Manager", "salary": 80000 }
DELETE	/{id}	Delete an employee by ID	-
Input Validation
Name: Cannot be blank
Salary: Must be a positive number
Dependencies
The following dependencies are used in the pom.xml file:

xml
Copy code
<dependencies>
    <!-- Spring Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Data JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- MySQL Driver -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
    </dependency>

    <!-- Jakarta Validation -->
    <dependency>
        <groupId>jakarta.validation</groupId>
        <artifactId>jakarta.validation-api</artifactId>
        <version>3.0.2</version>
    </dependency>

    <!-- Spring Boot Starter Test (optional for testing) -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
## Here are some  result photos included in the repository:
![photo 3](https://github.com/user-attachments/assets/c257c7ce-2674-4afc-9150-0bb3ba539c5c)
![photo4](https://github.com/user-attachments/assets/36d47c49-ccbd-423e-b6b2-5dce94f73787)
![photo 5](https://github.com/user-attachments/assets/6cc4ab27-8c4d-4704-ba1b-55212d81741d)






### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/employee-management-api.git
   cd employee-management-api
   

