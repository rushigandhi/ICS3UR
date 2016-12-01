// Assignment: J5A3
// Description: This program is able to mathematically analyze all numbers inputted.
//
// Author: Rushi Gandhi
//
// Date Start: November 4, 2016
// Date Completed: November 4, 2016
//
// Completion time: 1 period
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from no one in designing and debugging my program.
//********************************************************* 

import java.util.Scanner;

   class MoreUsingFor {
   
      public static void main(String[] args) {
      
      Scanner in = new Scanner(System.in);
      
      // Step 1: Declaring Variables
      
      int sum;
      
      int number;
      
      double average;
      
      int max;
            
      int min;
      
      int counter;
      
      
      // Step 2: Assigning Values
           
      min = 2147483647; //Maximum value an int datatype can have
      
      max = -2147483647; //Minimum value an int datatype can have
      
      sum = 0;
      
      
      // Step 3: Processing and Output
      
      for (counter = 1; counter<6; counter = counter + 1) {
      
      System.out.println("Input any integer:");
      
      number = in.nextInt();
     
      sum = sum + number;
      
      min = Math.min(number,min);
      
      max = Math.max(number,max);
               
      }
      
      average = sum/5.0;     
      
      
      System.out.println("The average of those five integers is " + average + ".");
      System.out.println("The largest number was " + max + ".");
      System.out.println("The smallest number was " + min + ".");
      
      
   }
}
      