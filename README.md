# Employee Management System

A backend application for managing employee records, developed using Spring Boot. It supports CRUD operations, advanced search, and user authentication. The system also includes thorough API testing with Postman.

## Features

- Add, view, update, and delete employee records.
- Retrieve employee data based on various criteria such as phone, email, name, address, designation, and salary.
- User authentication with name and password.
- Advanced search by salary ranges.
- API testing with Postman.

## Technologies

- **Backend**: Spring Boot
- **Database**: JPA (Hibernate), MySQL/PostgreSQL
- **Testing**: JUnit, Mockito, Postman
- **Build Tool**: Maven

## Getting Started

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/employee-management-system.git
   cd employee-management-system
2. **Build and run the application:**
mvn clean install
mvn spring-boot:run
3. **Access the application at http://localhost:8080**



# Employee CRUD Operations API Endpoints

## Create Employee
- POST /employee/save
- POST /employee/saveAll

## Read Employee
- GET /employee/findById
- GET /employee/find/phone
- GET /employee/find/email
- GET /employee/findAll
- GET /employee/find/name
- GET /employee/find/address
- GET /employee/find/designation
- GET /employee/login

## Delete Employee
- DELETE /employee/deleteById
- DELETE /employee/delete/email
- DELETE /employee/delete/phone
- DELETE /employee/delete/name
- DELETE /employee/delete/designation
- DELETE /employee/delete/address
- DELETE /employee/delete/all

## Update Employee
- PUT /employee/update
- PATCH /employee/update/phone
- PATCH /employee/update/name
- PATCH /employee/update/email
- PATCH /employee/update/designation
- PATCH /employee/update/salary
- PATCH /employee/update/passwordByID
- PATCH /employee/update/passwordByEmail
- PATCH /employee/update/passwordByPhone

## Advanced Search by Salary
- GET /employee/find/salary/lessthan
- GET /employee/find/salary/greaterthan
- GET /employee/find/salary/between

## API Testing
- Import Postman collection: Download
- Run tests to verify all API endpoints.

## Contributing
- Contributions are welcome! Fork the repository and submit a pull request.
