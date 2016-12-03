// Assignment: J5A4
// Description: This program allows the user to find the factorial of any integer that can be stored within an int datatype.
//
// Author: Rushi Gandhi
//
// Date Start: November 11, 2016
// Date Completed: November 12, 2016
//
// Completion time: 2 periods
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from no one in designing and debugging my program.
//********************************************************* 
import java.util.Scanner;

   class J5A4 {
   
   public static void main(String[] args) {
   
   // Step 1: Declare Variables
      
   Scanner in = new Scanner(System.in);
   
   int num;
   int count;
   int result;
   
   // Step 2: Assigning Values
   
   System.out.println("Enter any integer:");
   
   num = in.nextInt();
   result = 1;
   
   // Step 3: Processing and Output
  
   if(num==0){
   
   System.out.println("0! = 0");
   
   }
   else {
   
   System.out.print(num+"! = 1");  
   
   for(count = 2; count<(num+1); count++){
   
   System.out.print("x" + count);
   
   result = result*count;
     
   }
   
   System.out.print(" = " + result);
   
   }
   
   }
   
}
   