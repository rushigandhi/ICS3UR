// Assignment: J4A5
// Description: This program checks how many roots a quadratic equation has.
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

   class Discriminant {
   
      public static void main(String[] args) {
      
         // Step 1: Declaring Variables
         
         Scanner in = new Scanner(System.in);
         
         double a;
         double b;
         double c;
         
         // Step 2: Assigning Values
         
         System.out.println("Enter the value of A in the equation Ax^2 + Bx + C = 0:");
         
         a = in.nextDouble();
         
         System.out.println("Enter the value of B in the equation Ax^2 + Bx + C = 0:");
         
         b = in.nextDouble();
         
         System.out.println("Enter the value of C in the equation Ax^2 + Bx + C = 0:");
         
         c = in.nextDouble();
         
         // Step 3: Processing and Output
         
         if((Math.pow(b, 2)-4*a*c) == 0) // checking if the discriminant equals 0
         {
         
         System.out.println("There is only one root.");
         
         }
         
         else if((Math.pow(b, 2)-4*a*c) > 0) // checking if the discriminant is greater than 0
         {
         
         System.out.println("There are two roots.");
         
         }
         
         else {
         
         System.out.println("There are no real roots.");
         
         }    
              
     }
}