// Assignment: J3A1P2
// Description: Converts number of minutes to number of days, hours, and minutes
//
// Author: Rushi Gandhi
//
// Date Start: October 13, 2016
// Date Completed: October 14, 2016
//
// Completion time: 2 periods
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from (enter the names of
//   others that helped with the assignment; write no one if
//   you received no help) in designing and debugging my program.
//*********************************************************


   import java.util.Scanner;
   
   class J3A1P2 {
   
   public static void main(String[] args) {
   
   Scanner in = new Scanner(System.in);
   
   // Step 1: Declaring Variables
   
   int totalMins;
   int numberOfDays;
   int numberOfHours;
   int numberOfMins;
   
   // Step 2: Assigning Values
   
   System.out.println("Enter the number of minutes.");
   
   totalMins  = in.nextInt();
   
   // Processing
   
   numberOfDays = totalMins/1440;
   
   numberOfHours = (totalMins-(1440*numberOfDays))/60;
   
   
   numberOfMins = (totalMins-(1440*numberOfDays))%60;
   
   // Output
   
   System.out.println(totalMins + " minutes = " + numberOfDays + " days, " + numberOfHours + " hours and " + numberOfMins + " minutes.");
   
   }
   
}