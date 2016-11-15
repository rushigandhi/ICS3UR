// Assignment: J4A4
// Description: This program finds the square root of an integer.
//
// Author: Rushi Gandhi
//
// Date Start: October 25, 2016
// Date Completed: October 25, 2016
//
// Completion time: 1 period
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from no one in designing and debugging my program.
//*********************************************************   

import java.util.Scanner;
  
   class J4A4 {
      public static void main(String[] args) {
      
      // Step 1: Declaring Varaibles
      
      Scanner in = new Scanner(System.in);
       
      double num;
      
      // Step 2: Assigning Values
      
      System.out.println("Please enter any integer:");
      
      num = in.nextDouble();
      
      // Step 3: Processing and Output
      
      if(num < 0){
      
      System.out.println("Negative numbers do not have a square root value.");
      
      }
      
      else {
      
      System.out.println("The square root of that integer is " + Math.sqrt(num));
         
      }
      
      System.out.println("The end.");
      
      }

}