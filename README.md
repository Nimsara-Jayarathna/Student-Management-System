# 🧑‍🎓 Student Management System – Java Practical 2

**Course**: SE2031 – Object Oriented Analysis and Design
**Institution**: Sri Lanka Institute of Information Technology (SLIIT)  
**Semester**: 2, 2025  
**Practical**: 2 – Classes, Packages, Control Structures, and JavaDoc

## ✅ Objective

This project implements a Student Management System using Java classes and objects, packages for organizing code, arrays for data storage, loops and switch-case for control flow, bubble sort and linear search, and JavaDoc for method documentation.

## 📁 Project Structure

StudentManagement/  
├── mainapp/  
│   └── Main.java  
├── models/  
│   ├── Student.java  
│   └── Course.java  
└── services/  
    └── EnrollmentManager.java  

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

1. **Clone the Repository**  
   Open your terminal or command prompt and run the following command:  
   ```git clone https://github.com/SLIIT-FacultyOfComputing/se2012-2025-s2-practical-02-NimsaraJayarathnaWA.git```

2. **Navigate into the Project Folder**  
   Type:  
   ```cd se2012-2025-s2-practical-02-NimsaraJayarathnaWA```

3. **Compile the Java Files**  
   Make sure you are in the root directory (where `mainapp`, `models`, and `services` folders are visible), then run:  
   ```javac mainapp/Main.java models/*.java services/*.java```

4. **Run the Application**  
   After successful compilation, run the program using:  
   ```java mainapp.Main```


## 📝 JavaDoc Documentation

All public methods and classes are documented using JavaDoc comments.

To generate JavaDoc:  
javadoc -d docs models/*.java services/*.java  

Then open docs/index.html in your browser.

## 📌 Author & Credits

- Student Name: Nimsara jayarathna 
- Index Number: IT24103464

