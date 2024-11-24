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



# Image Gallery
## Here are some  result photos included in the repository:



### Photo 3
![photo 3](https://github.com/user-attachments/assets/6794fb45-7e82-45f0-ac89-6efd877441cf)


### Photo 4
![photo4](https://github.com/user-attachments/assets/20afb9fa-2172-448f-bec8-7844a8bf64ad)


### Photo 5
![photo 5](https://github.com/user-attachments/assets/636cc4db-bf77-40f0-b1eb-6cebbb42f5fe)







### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/employee-management-api.git
   cd employee-management-api
   

