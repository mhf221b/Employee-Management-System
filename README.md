# Employee-Management-System

This is my first ever Java project which I have worked on. It is an Employee Management System.
I have coded it fully on java and used intellij IDEA for coding. Also used JavaFX for a GUI which is 
short for Graphical User Interface. Here the GUI is used for only taking inputs but the output will be 
shown on the Compiler.

To use this system I'd suggest installing Intellij IDEA (Though any compiler supportig javafx should work!)
and run it on Java 8 as I have done this work on Java 8 (JDK 8/ JDK 1.8) as well.

Features - (Class names and their short Description):

1. Abstract Class Employee: This is an abstract class which will be inherited later by other employee classes.
   Here, I have three common private attributes for all the employees that is name, id and designation. It will have getter and setters for all
   those private attributes and will also have two abstract methods getSalary and increaseSalary for implementing later on. And finally it will
   have a display method for displaying all informations.

2. Class CommissionEmployee: This class will be one of the child classes of Employee. Here, I will have two new attributes Commission and Sale.
   It will also implement previous abstract methods which are getSalary and increaseSalary. This class will be used for taking informations of 
   commissioned employees and also to calculate their commission.

3. Class HourlyEmployee: This class is also one of the child classe of Employee. Here, I will have two new attributes hourlyRate and hourWorked.
   It will also implement previous abstract methods which are getSalary and increaseSalary. This class will be used for taking informations of Hourly
   Employees and it will calculate their rate according to hours worked.

4. Class SalariedEmployee: This class is also one of the child classes of Employee. Here, I will have one new attribute monthlySalary. It will also
   implement previous abstract methods which are getSalary and increaseSalary. This class will be used for taking informtions of Salaried Employees.

5. Class Main: In this class I have designed our GUI and what action leads to what result.

6. Class UapCse: In this class,  I have writen the main method and how this whole system will be executed.



Thank you so much for taking your time and going through my basic Employee Management System with Java and Javafx!