Thomas Travels — Fleet & Driver Analytics System

A modular Core Java console application built in Eclipse to automate driver record management, category validation, and travel distance analytics for Thomas Travels.

Features

Vehicle Category Validation: Checks whether a given driver belongs to a specific vehicle category (e.g., "Car", "Auto", "Lorry").

Driver Search by ID: Retrieves formatted driver profile details including name, vehicle category, and cumulative distance traveled.

Category-Based Filtering & Counting: Calculates total active drivers per vehicle category and returns filtered collections of matching drivers.

Top Distance Analytics: Identifies and returns the driver who has traveled the maximum cumulative distance.

Project Structure

The codebase follows a clean, layered object-oriented package architecture:

ThomasTravels/
└── src/
    ├── com/
    │   ├── model/
    │   │   └── Driver.java      # Entity class with encapsulated driver attributes, constructors, and getters/setters
    │   ├── service/
    │   │   └── Travel.java      # Business logic and fleet analytics methods
    │   └── tester/
    │       └── Test.java        # Main driver class executing test cases and console outputs


Technologies Used

Language: Java (JavaSE-21)

Concepts: Object-Oriented Programming (Encapsulation, Constructors, Method Overloading, toString() Overriding, Package Structuring), Java Arrays, Conditional Logic & Enhanced for Loops

IDE & Version Control: Eclipse IDE, Git, GitHub

How to Run

Clone the repository:

git clone https://github.com/rayabaram-manasa/ThomasTravels.git


Import into Eclipse:

Open Eclipse IDE and go to File → Import → General → Existing Projects into Workspace.

Select the cloned ThomasTravels folder and click Finish.

Run the application:

Open src/com/tester/Test.java, right-click inside the editor, and select Run As → Java Application.

Sample Output

Driver [driverId=1, driverName=Hari, category=Car, totalDistance=300.0]
true
Driver name is: Manasa Belonging to the category Car traveled 200.0 KM so far.
2
Driver [driverId=2, driverName=Manasa, category=Car, totalDistance=200.0]
Driver [driverId=5, driverName=Narayana, category=Car, totalDistance=250.0]
Driver [driverId=3, driverName=Vijaya, category=Auto, totalDistance=300.0]
