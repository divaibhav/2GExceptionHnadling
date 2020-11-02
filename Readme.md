# Exception Handling Practice

1. Create a custom exception class MyException, this exception is throw when user enter "0" as integer input.

2. A program to demonstrate custom exception.Create an integer array of size 5. And initialize it with some values. Create a public boolean search(int[] arr, int searchElement), this method will return true if searchElement is present in array or else will throw an user defined exception NoElementFoundException.
   
3. A program to demonstrate custom exceptions. Create a com.myname.stuent.Student class with three private fields name, rollNo, & CPI. Create Getter and Setter for all the fields, override the public String toString() method of Object class, to represent Student objects as String.
   Create a com.myname.main.StudentMain class which is the implementation class contains main method and a search() method. main method will create a list of students i.e array and initialize each objects by taking input from user using java.util.Scanner class. This method will also call search method and print the result.
   search() method will accept two arguments first is Student[] list and int rollNo.
   This method will return Student object if rollNo matches with any of the Student object or else it will throw an user defined exception InvalidStudentException.
   com.myname.exception.InvalidStudentException is a class which extends java.lang.Exception class and have one parameterized constructor which accept an argument String message.
   
   
