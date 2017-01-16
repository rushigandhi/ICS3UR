// Assignment: J6A5
// Description: This progrma can do simple calculations using basic operators.
//
// Author: Rushi Gandhi
//
// Date Start: December 13, 2016
// Date Completed: December 15, 2016
//
// Completion time: 3 period
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from no one in designing and debugging my program.
//*********************************************************

import java.util.Scanner;

class Calculator {
   
   public static void main(String[] args) {
         
         // Step 1: Declaring Variables
         
      Scanner in = new Scanner(System.in);
         
      String expression;
      int addition;
      int subtraction;
      int multiplication;
      int division;
      int powerOf;  
         
         
         // Step 2: Assigning Values
         
         System.out.println("What do you want to calculate?");
         
         expression = in.nextLine().trim();
         addition = expression.indexOf('+');
         subtraction = expression.indexOf('-');
         division = expression.indexOf('/');
         multiplication = expression.indexOf('*');
         powerOf = expression.indexOf('^');
         
         // Step 3: Processing and Output
         
         if (powerOf > 0){
          System.out.println(expression + " = " + (Math.pow(Double.parseDouble(expression.substring(0,powerOf).trim()),Double.parseDouble(expression.substring(powerOf+1).trim()))));
         }
         else if (division > 0){
         System.out.println(expression + " = " + (Double.parseDouble(expression.substring(0,division).trim()) / Double.parseDouble(expression.substring(division+1).trim())));
         }
         else if (multiplication > 0){
         System.out.println(expression + " = " + (Double.parseDouble(expression.substring(0,multiplication).trim()) * Double.parseDouble(expression.substring(multiplication+1).trim())));
         }
         else if (addition > 0){
         System.out.println(expression + " = " + (Double.parseDouble(expression.substring(0,addition).trim()) + Double.parseDouble(expression.substring(addition+1).trim())));
         }
         else if (subtraction > 0){
         System.out.println(expression + " = " + (Double.parseDouble(expression.substring(0,subtraction).trim()) - Double.parseDouble(expression.substring(subtraction+1).trim())));
         }
         else {
         System.out.println("Expression is invalid.");
         }
             
   }
         
}
         
         
