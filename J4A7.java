// Assignment: J4A7
// Description: This program demonstrates string comparison.
//
// Author: Rushi Gandhi
//
// Date Start: October 26, 2016
// Date Completed: October 26, 2016
//
// Completion time: 1 period
//
// Honor Code: I pledge that this program represents my own
// program code. I received help from no one in designing and debugging my program.
//*********************************************************   
import java.util.Scanner;

   class J4A7 {
      public static void main(String[] args) {
      
      // Step 1: Declaring Variables
      
      Scanner in = new Scanner(System.in);
      
      String studentName;
      String studentSchool;
      
      // Step 2: Assigning Values
      
      System.out.println("What is your name:");
      studentName = in.nextLine();
      System.out.println("What school do you go to:");
      studentSchool = in.nextLine();
      
      // Step 3: Processing and Output
      
      if(studentSchool.equalsIgnoreCase("chinguacousy")) {
      
      System.out.println(studentName + "! You should be in class!");
      
      }
      
      else {
      
       System.out.println("Welcome to Chinguacousy " + studentName + "!");
       
       }
       
   }
       
}