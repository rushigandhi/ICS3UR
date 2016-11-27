// Assignment: J5A1
// Description: This program demonstrates while loops.
//
// Author: Rushi Gandhi
//
// Date Start: October 25, 2016
// Date Completed: October 25, 2016
//
// Completion time: 2 periods
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from no one in designing and debugging my program.
//*********************************************************   

class J5A1{
   public static void main(String[] args) {
   
   // Step 1: Declaring Variables
   
   int counterOne;
   int counterTwo;
   int counterThree;
   int counterFour; 
   
   // Step 2: Assigning Values
   
   counterOne = 1;
   counterTwo = 10;
   counterThree = 1;
   counterFour = 30;
      
   // Step 3: Processing and Output
   
   // Part 1
   
   while(counterOne<11) {
   
      System.out.print(counterOne+" ");
   counterOne = counterOne+1;
   
   }
   
   System.out.println();
   
   // Part 2
   
   while(counterTwo>0) {
   
      System.out.print(counterTwo+" ");
   counterTwo = counterTwo - 1;
   
   }
   
   System.out.println();
   
   // Part 3
      
   while(counterThree<26) {
   
   System.out.print(counterThree+" ");
   counterThree = counterThree +3;
   
   }
   
   System.out.println();
   
   // Part 4
   
   while(counterFour>13) {
   
   System.out.print(counterFour+" ");
   counterFour = counterFour - 4;
   
   }
   
   }
}
   