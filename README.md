# 🧑‍🎓 Student Management System

## ✅ Objective

This project implements a Student Management System using Java classes and objects, packages for organizing code, arrays for data storage, loops and switch-case for control flow, bubble sort and linear search, and JavaDoc for method documentation.

## 📁 Project Structure

```plaintext
StudentManagement/  
├── mainapp/  
│   └── Main.java  
├── models/  
│   ├── Student.java  
│   └── Course.java  
└── services/  
    └── EnrollmentManager.java  
```

## 💡 System Features

- Add Student: Add a new student with ID and name  
- Add Course: Add a new course with code and title  
- Enroll Student to Course: Enroll a student in a specific course  
- List Students: Display all added students  
- List Courses: Display all added courses  
- List Enrollments: Show which students are enrolled in which courses  
- Search Student by ID: Find a student by exact ID using linear search  
- Search Course by Code: Find a course by exact code using linear search  
- Sort Students by Name: Sort students alphabetically using bubble sort  

## 🚀 How to Run the Program

### Prerequisites  
- Java 8 or above  
- Terminal or IDE 
- Git (if not available download the repository as a zip file and extract, skip the step 1)

1. **Clone the Repository**  
   Open your terminal or command prompt and run the following command:  
   ```bash 
   git clone https://github.com/Nimsara-Jayarathna/Student-Management-System.git
   ``` 

2. **Navigate into the Project Folder**   
   ```
   cd Student-Management-System
   ```

3. **Compile the Java Files**  
   Make sure you are in the root directory (where `mainapp`, `models`, and `services` folders are visible), then run:  
   ```
   javac mainapp/Main.java models/*.java services/*.java
   ```

4. **Run the Application**  
   After successful compilation, run the program using:  
   ```
   java mainapp.Main
   ```


## 📝 JavaDoc Documentation

All public methods and classes are documented using JavaDoc comments.

To generate JavaDoc:  
```
javadoc -d docs models/*.java services/*.java 
``` 

Then open `docs/index.html` in your browser.

## 🧑‍💻 Developer Information

- **Name**: Nimsara Jayarathna  
- **GitHub Username**: [@Nimsara Jayarathna](https://github.com/Nimsara-Jayarathna)  
- **Project**: Student Management System (Java)  
- **Technologies**: Java, OOP, Packages, Control Structures, JavaDoc  
- **Original Academic Submission**: SE2031 – Java Programming (SLIIT, 2025)


