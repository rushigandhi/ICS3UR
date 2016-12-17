// Assignment: J6A5
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

   class J6A5 {
   
         public static void main(String[] args) {
         
         // Step 1: Declaring Variables
         
         Scanner in = new Scanner(System.in);
         
         String expression;
         char checker;
         char operator;
         double firstNum;
         double secondNum;
         boolean playAgain;
         int counter;
         int operatorCounter;
         
         
         // Step 2: Assigning Values
         
         
         operator = ' ';
         firstNum = 0;
         secondNum = 0;
         operatorCounter = 0;
               
         System.out.println("What do you want to calculate?");
         
         expression = in.nextLine();
         
         for (counter = 0; counter < expression.length(); counter++){
         
         checker = expression.charAt(counter);
         
         
                  
         if (checker=='+')
         {
         operator = '+';
         operatorCounter++;
         }
         else if (checker=='-')
         {
         operator = '-';
         operatorCounter++;
         }
         else if (checker=='*')
         {
         operator = '*';
         operatorCounter++;
         }
         else if (checker=='/')
         {
         operator = '/';
         operatorCounter++;
         }
         else if (checker=='^')
         {
         operator = '^';
         operatorCounter++;
         }
         }
         
         if(operatorCounter>1){
         
         
         
          secondNum = Double.parseDouble(expression.substring(expression.indexOf(operator), expression.length()));
         
         
         
         }
         
         else if(operatorCounter==1){      
         firstNum = Double.parseDouble(expression.substring(0, expression.indexOf(operator)));
                          
         secondNum = Double.parseDouble(expression.substring(expression.indexOf(operator)+1, expression.length()));
         }
                                   
         // Step 3: Processing and Output
                  
         if (operator=='+'){
         
         System.out.println(firstNum + " " + operator + " " + secondNum + " = " + (firstNum+secondNum));
         
         }
         else if (operator=='-'){
         
         System.out.println(firstNum + " " + operator + " " + secondNum + " = " + (firstNum-secondNum));
         
         }
         else if (operator=='*'){
         
         System.out.println(firstNum + " " + operator + " " + secondNum +  " = " + (firstNum*secondNum));
         
         }
         else if (operator=='/'){
         
         System.out.println(firstNum + " " + operator + " " + secondNum +  " = " + (firstNum/secondNum));
         
         }
         else if (operator=='^'){
         
         System.out.println(firstNum + " " + operator + " " + secondNum +  " = " + (Math.pow(firstNum,secondNum)));
         
         }
         else {
         System.out.println("Only supports + - * / ^ operators");
                  
         }
         
         }
         
         }
         
         
