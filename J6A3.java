// Assignment: J6A3
// Description: This progrma converts the user's last name to all capitals and their first name to all lowercase.
//
// Author: Rushi Gandhi
//
// Date Start: December 9, 2016
// Date Completed: December 9, 2016
//
// Completion time: 1 period
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from no one in designing and debugging my program.
//********************************************************* import java.util.Scanner;

import java.util.Scanner;

   class J6A3 {
   
         public static void main(String[] args) {
         
         // Step 1: Declaring Variables
         
         Scanner in = new Scanner(System.in);
         
         String fullName;
         String lastName;
         String firstName;
         
         // Step 2: Assigning Values
         
         System.out.println("What is your name?");
         
         fullName = in.nextLine();
         
         lastName = fullName.substring(fullName.indexOf(' ')+1, fullName.length());
         
         firstName  = fullName.substring(0, fullName.indexOf(' '));
         
         // Step 3: Processing

         lastName = lastName.toUpperCase();
         
         firstName  = firstName.toLowerCase();
         
         // Step 4: Output
         
         System.out.println(lastName + " " + firstName);
         
         }
         
}