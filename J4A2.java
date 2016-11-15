// Assignment: J4A2
// Description: This program checks if the number inputted is greater than ten.
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
  
   class J4A2 {
      public static void main(String[] args) {
      
      // Step 1: Declaring Variables
      
      Scanner in = new Scanner(System.in);
       
      int num;
      
      // Step 2: Assigning Values
      
      System.out.println("Please enter an integer number greater than 10:");
      
      num = in.nextInt();
      
      // Step 3: Processing and Output
      
      if(num <= 10){
      
      System.out.println("Your number was not greater than 10!");
      
      }
      
      System.out.println("The end.");
      
      }

}