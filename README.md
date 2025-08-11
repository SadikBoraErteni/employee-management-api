# Employee Management API (Spring Boot Backend)

This project is a RESTful API developed for an employee management system. It uses Spring Boot, Spring Data JPA, and PostgreSQL for database operations.

## Features

- **CRUD Operations:** Supports Create, Read, Update, and Delete operations for employee data.
- **RESTful Endpoints:** Accessible API endpoints using HTTP methods (`GET`, `POST`, `PUT`, `DELETE`).
- **CORS Support:** Configured CORS settings to enable seamless communication with a frontend application.

## Technologies

- **Backend:** Spring Boot, Java
- **Database:** PostgreSQL
- **ORM:** Spring Data JPA, Hibernate
- **Build Tool:** Maven

## Prerequisites

- Java 17 or higher
- Maven
- Docker (for PostgreSQL database)

## Getting Started

Follow the steps below to run the project on your local machine:

1.  **Clone the Project:**
    - Open your terminal and run the following commands to clone the project repository:
    ```bash
    git clone [https://github.com/YOUR_GITHUB_USERNAME/calisan-yonetim-web.git](https://github.com/YOUR_GITHUB_USERNAME/calisan-yonetim-web.git)
    cd calisan-yonetim-web
    ```

2.  **Start the Database:**
    - Make sure Docker is running.
    - Start the PostgreSQL database container by running the following command in your terminal:
    ```bash
    docker run --name my-postgres -e POSTGRES_PASSWORD=mysecretpassword -p 5432:5432 -d postgres
    ```

3.  **Run the Application:**
    - Navigate to the project's main directory.
    - Run the Spring Boot application using Maven:
    ```bash
    mvn spring-boot:run
    ```
    The application will start running at `http://localhost:8080`.

## API Endpoints

| HTTP Method | URL | Description |
| :--- | :--- | :--- |
| `GET` | `/api/employees` | Lists all employees. |
| `POST` | `/api/employees` | Adds a new employee. |
| `PUT` | `/api/employees/{id}` | Updates an employee with a specific ID. |
| `DELETE`| `/api/employees/{id}` | Deletes an employee with a specific ID. |
