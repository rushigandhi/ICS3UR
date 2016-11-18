// Assignment: J4A6
// Description: This program demonstrates string comparison.
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
      
      class J4A6 {
      
         public static void main(String[] args) {
                  
         // Step 1: Declaring Variables
         
         Scanner in = new Scanner(System.in);
         
         String favouriteFood;
         
         // Step 2: Assigning Values
         
         System.out.println("What is your favourite food?");
         
         favouriteFood = in.nextLine();
         
         // Step 3: Processing and Output
         
         if (favouriteFood.equalsIgnoreCase("pizza")) {
         
         System.out.println("I like pizza too!");
         
         }
           
         else {
         
         System.out.println("I hate " + favouriteFood.toLowerCase() + "!");
         
         }
         
    }
    
}         
         
          