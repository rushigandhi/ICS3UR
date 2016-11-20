// Assignment: J4A8
// Description: This program will suggest which team you should join based on your weight and sex.
//
// Author: Rushi Gandhi
//
// Date Start: October 25, 2016
// Date Completed: October 26, 2016
//
// Completion time: 2 periods
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from no one in designing and debugging my program.
//*********************************************************   

import java.util.Scanner;
      
      class J4A8 {
      
         public static void main(String[] args){
         
         // Step 1: Declaring Variables
         
         Scanner in = new Scanner(System.in);
         
         String studentName;
         String studentSex;
         double studentWeight;
         final double WRESTLING_WEIGHT_LIMIT_KG = 85;
         final double GYMNASTICS_WEIGHT_LIMIT_KG = 50;
         
         // Step 2: Assignment Values
         
         System.out.println("What is your name:");
         studentName = in.nextLine();
         
         System.out.println("What is your sex (male or female):");
         studentSex = in.nextLine();
         
         System.out.println("What is your weight(kg):");
         studentWeight  = in.nextDouble();
         
         
         // Step 3: Processing and Output
         
         if((studentSex.equalsIgnoreCase("male"))&&(studentWeight>=WRESTLING_WEIGHT_LIMIT_KG)){
         
         System.out.println(studentName + ", you are " + studentWeight + "kg. Please join the wrestling team.");
         
         }
         
         else if ((studentSex.equalsIgnoreCase("female"))&&(studentWeight<GYMNASTICS_WEIGHT_LIMIT_KG)){
         
         System.out.println(studentName + ", you are " + studentWeight + "kg. Please join the gymnastics team.");
                
         }
         
         else {
          
         System.out.println(studentName + ", you are " + studentWeight + "kg. Please join the debate team.");
                
         }

     }
 
 }