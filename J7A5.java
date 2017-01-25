// Assignment: J7A5
// Description: This program find the largest and smallest values in an array using the method Arrays.sort();
//
// Author: Rushi Gandhi
//
// Date Start: January 11, 2017
// Date Completed: January 11, 2016
//
// Completion time: 1 period
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from no one in designing and debugging my program.
//*********************************************************
import java.util.Arrays;
class J7A5 {
      public static void main(String[] args){
      
      int[] marks = {63, 33, 58, 90, 74, 80, 76, 58, 67, 80,
                     86, 78, 79, 62, 20, 70, 63, 82, 62, 85,
                     60, 50, 74, 77, 92, 65, 83, 71, 78, 55, 45, 58};
                    
      Arrays.sort(marks);
      System.out.println(Arrays.toString(marks));
      
      System.out.println("The minimum number is: " + marks[0]);
      System.out.println("The maximum number is: " + marks[marks.length-1]);
                                 
      }
      
      }
      
      