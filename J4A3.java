// Assignment: J4A3
// Description: This program checks if a mark is a pass or a fail.
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
  
   class J4A3 {
      public static void main(String[] args) {
      
      // Step 1: Declaring Varaibles
      
      Scanner in = new Scanner(System.in);
       
      int num;
      
      final int PASSING_GRADE = 50;
      
      // Step 2: Assigning Values
      
      System.out.println("Please enter a mark out of 100%:");
      
      num = in.nextInt();
      
      // Step 3: Processing and Output
      
      if(num >= PASSING_GRADE){
      
      System.out.println("PASS");
      
      }
      
      else {
      
      System.out.println("FAIL");
      
      }
      
      System.out.println("The end.");
      
      }

}