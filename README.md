# University Management System

## Overview

This Java project demonstrates the implementation of the Factory Pattern in the context of a University Management System. The system includes classes and interfaces representing students, universities, and a simple factory mechanism for creating instances of these entities.

## Project Structure

- **Interfaces:**
  - `IStudent`: Defines the basic behavior of a student.

- **Concrete Classes:**
  - `Undergraduate`: Represents an undergraduate student.
  - `Graduate`: Represents a graduate student.
  - `UniversityStudent`: Implements the `Student` interface and represents a university student.
  - `HarvardUniversity`: Represents Harvard University and implements the `University` interface.
  - `MIT`: Represents the Massachusetts Institute of Technology and implements the `University` interface.

- **Factories:**
  - `StudentFactory`: Creates instances of the `UniversityStudent` class based on input parameters.
  - `UniversityFactory`: Creates instances of universities (Harvard or MIT) based on input parameters.

- **Main Class:**
  - `Main`: Contains the main method for demonstrating the usage of the Factory Pattern in the context of university management.

## Factory Pattern Usage

The Factory Pattern is employed to create instances of `Student` and `University` objects. The `StudentFactory` and `UniversityFactory` provide a flexible and extensible way to instantiate different types of students and universities, respectively.

## How to Use

1. Clone the repository: `git clone https://github.com/your-username/university-management-system.git`
2. Compile the Java files: `javac main/*.java`
3. Run the main class: `java main.Main`

Feel free to explore and modify the code to suit your needs. This project serves as a practical example of how the Factory Pattern can be applied for object creation in a university management system.
