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
      
      int integerOne;
      int integerTwo;
      int integerThree;
      int integerFour;
      int integerFive;
      
      int counter;
      
      
      // Step 2: Assigning Values
           
      sum = 0;
      integerOne = 0;
      integerTwo = 0;
      integerThree = 0;
      integerFour = 0;
      integerFive = 0;
      
      
      // Step 3: Processing and Output
      
      for (counter = 1; counter<6; counter = counter + 1) {
      
      System.out.println("Input any integer:");
     
      if (counter == 1){
      
      integerOne = in.nextInt();
      }
      else if (counter == 2){
      
      integerTwo = in.nextInt();
      
      }
      else if (counter == 3){
      
      integerThree = in.nextInt();
      
      }
      else if (counter == 4){
      
      integerFour = in.nextInt();
      
      }
      else {
           
      integerFive = in.nextInt();
      
      }   
          
      }
      
      sum = integerOne + integerTwo + integerThree + integerFour + integerFive;      
      
      
      System.out.println("The average of those five integers is " + sum/5.0 + ".");
      System.out.println("The largest number was " + Math.max(Math.max(Math.max(Math.max(integerOne,integerTwo),integerThree),integerFour),integerFive) + ".");
      System.out.println("The smallest number was " + Math.min(Math.min(Math.min(Math.min(integerOne,integerTwo),integerThree),integerFour),integerFive) + ".");
      
      
   }
}
      