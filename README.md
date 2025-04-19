📚 Library Management System
A Java-based web application for managing library operations (books, members, borrowing).

 (Replace with actual screenshot)

✨ Features
Admin Panel: Add/edit/delete books and members.

User Authentication: Login for librarians and members.

Borrow/Return: Track book loans and due dates.

Search: Filter books by title, author, or category.

Reports: Generate lists of overdue books or active loans.

🛠️ Tech Stack
Category	Technologies Used
Frontend	JSP, HTML, CSS, Bootstrap
Backend	Java Servlets
Database	MySQL
Server	Apache Tomcat
Build Tool	Maven
⚙️ Setup Guide
Prerequisites
Java JDK 17+

Apache Tomcat 9+

MySQL 8.0+

Maven 3.6+

1. Clone the Repository
bash
Copy
Download
git clone https://github.com/nimesh-manusha/library-management-system.git
cd library-management-system
2. Database Setup
Create a MySQL database:

sql
Copy
Download
CREATE DATABASE library_db;
Import the schema (check if your repo has a sql/ folder with .sql files).

Update database credentials in src/main/resources/db.properties.

3. Build & Deploy
bash
Copy
Download
mvn clean package                   # Build WAR file
cp target/library.war /opt/tomcat/webapps/  # Deploy to Tomcat
Access the app at: http://localhost:8080/library

📂 Project Structure
Copy
Download
library-management-system/
├── src/
│   ├── main/
│   │   ├── java/          # Servlets, DAO, Models
│   │   ├── webapp/        # JSP, CSS, JS
│   │   └── resources/     # DB configs
├── sql/                   # Database scripts (if any)
├── pom.xml                # Maven dependencies
└── README.md
🖥️ Usage
Librarian Login:

Default credentials: admin@example.com / admin123 (update if different)

Add books/members, manage loans.

Member Login:

Browse books, check loan status.

🤝 Contributing
Fork the repo.

Create a branch (git checkout -b feature/new-feature).

Commit changes (git commit -m "Add feature").

Push to the branch (git push origin feature/new-feature).

Open a Pull Request.
