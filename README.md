# Data-Entry-System
Console Based Data Entry System 
Java Data Entry System

This is a simple console-based Java application demonstrating fundamental OOP principles. It allows users to enter details (name, age, city, country) for multiple people, stores the data in custom objects, and optionally displays a summary of all entries.

Core Concepts Illustrated

This project demonstrates several key Java concepts:

Object-Oriented Programming (OOP): The application is built around objects.

Classes and Objects: Defines Person and Address classes and creates instances at runtime.

Composition (Aggregation): Shows a "has-a" relationship, with Person containing an Address instance.

Constructors: Used in both classes to initialize new objects.

static Variables: Uses static int count to track the total number of Person and Address objects created.

static Methods: The main class uses static helper methods (displayArray, AssignData, AssignAddresses) to organize logic.

Arrays: Uses arrays to store primitive data and objects (Person[], Address[]).

User Input: Uses java.util.Scanner to read console input.

Methods: Employs methods like displayInfo() to encapsulate object behavior.

Potential Applications

This program's structure is a foundation for more complex applications:

Basic Data Entry Systems: Can be expanded for various data collection tools.

Contact Management: Forms the core logic for a simple address book.

Employee or Student Information Systems: Can be scaled to manage records for organizations.

Foundation for Database Applications: Represents the "model" layer, which can be connected to a database for persistent storage.
