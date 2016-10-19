// Assignment: J3C1
// Description: Calculates change
//
// Author: Rushi Gandhi
//
// Date Start: October 14, 2016
// Date Completed: October 15, 2016
//
// Completion time: 5 hours
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from (enter the names of
//   others that helped with the assignment; write no one if
//   you received no help) in designing and debugging my program.
//*********************************************************

import java.util.Scanner;
class J3C1{
   
   public static void main(String[] args){
      while(true){
      
      // Step 1: Declaring Variables
      
      Scanner in = new Scanner(System.in);
      
      String input;
      double moneyDbl;
      int moneyInt;
      int toonies;
      int loonies;
      int quarters;
      int dimes;
      int nickels;
      int pennies;
      
      // Step 2: Assigning Values
      
      System.out.println("Enter the amount paid.");
      input = in.nextLine();
      
      if (input.length()==5){
      input = input.substring(1, input.length());
      }
      else if(input.length()<5){
      input = input.substring(0, input.length());
      }
      moneyDbl = Double.parseDouble(input);
      moneyDbl = moneyDbl*100;
      moneyInt = (int)Math.round(moneyDbl);
      
      // Step 3: Processing
      
      toonies = moneyInt/200;
      moneyInt %= 200;
      loonies = moneyInt/100;
      moneyInt %= 100; 
      quarters = moneyInt/25;
      moneyInt %= 25;
      dimes  = moneyInt/10;
      moneyInt %= 10;
      nickels = moneyInt/5;
      moneyInt %= 5;
      pennies = moneyInt/1;
   
      // Step 4: Output
      
      if (toonies == 1){
         System.out.print("1 toonie");
      }
      else if (toonies != 1){
         System.out.print(toonies + " toonies");
      }
      if (loonies == 1){
         System.out.print(", 1 loonie");
      }
      else if (loonies != 1){
         System.out.print(", " + loonies + " loonies");
      }
      if (quarters == 1){
         System.out.print(", 1 quarter");
      }
      else if (quarters != 1){
         System.out.print(", " + quarters + " quarters");
      }
      if (dimes == 1){
         System.out.print(", 1 dime");
      }
      else if (dimes != 1){
         System.out.print(", " + dimes + " dimes");
      }
      if (nickels == 1){
         System.out.print(", 1 nickel");
      }
      else if (nickels != 1){
         System.out.print(", " + nickels + " nickels");
      }
      if (pennies == 1){
         System.out.print(", 1 penny");
      }
      else if (pennies != 1){
         System.out.print(", " + pennies + " pennies");
         }
      System.out.println();
      }
   }
}