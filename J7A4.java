// Assignment: J7A1
// Description: This program uses different methods to find the sum of numbers in an array.
//
// Author: Rushi Gandhi
//
// Date Start: January 9, 2017
// Date Completed: January 9, 2016
//
// Completion time: 1 period
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from no one in designing and debugging my program.
//*********************************************************
class J7A4 {

   public static void main(String[] args){
   
   // Step 1: Intializing and Declaring
   
      int[] marks = {63, 33, 58, 90, 74, 80, 76, 58, 67, 80,
      86, 78, 79, 62, 20, 70, 63, 82, 62, 85,
      60, 50, 74, 77, 92, 65, 83, 71, 78, 55, 45, 58};
      
      double average;
      int sum = 0;
      int lowestAverage = Integer.MAX_VALUE;
      int highestAverage = Integer.MIN_VALUE;
      
      
      // Step 2: Processing and Output
   
         for(int i = 0; i < marks.length; i++){
         
         sum = sum + marks[i];
         
         }
         
        average = sum/(marks.length*1.0);
        
        
        System.out.println("The average mark is " + average + "%");
        
        for(int i = 0; i < marks.length; i++){
         
         lowestAverage = Math.min(marks[i], lowestAverage);
         highestAverage = Math.max(marks[i], highestAverage);
         }
         
         System.out.println("The mininum mark is " + lowestAverage + "%");
         System.out.println("The maximum mark is " + highestAverage + "%");
}
}
        
        





