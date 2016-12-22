// Assignment: J6A4
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

   class J6A4 {
   
         public static void main(String[] args) {
         
         // Step 1: Declaring Variables
         
         Scanner in = new Scanner(System.in);
         
         String word;
         char checker;
         int vowel;
         int consonant;
         int loopCounter;
         int play;
         
         // Step 2: Assigning Values
                  
         consonant = 0;
         
         vowel = 0;
         
         do {
         
         System.out.print("Enter your word: ");
         
         word  = in.nextLine();
         
         word  = word.toLowerCase();
         
         // Step 3: Processing
         
         for (loopCounter = 0; loopCounter< word.length(); loopCounter++){
         
         checker = word.charAt(loopCounter);
         
         if ((checker == 'a')||(checker == 'e')||(checker == 'i')||(checker == 'o')||(checker == 'u')){
         
         vowel++;
                  
         }
         
         else {
         
         consonant++;
         
         }
         
         }
         
         // Step 4: Output
         
         System.out.println("Result: " + vowel +" vowels " + consonant + " consonants");
         
         System.out.println("Try again?");
         
         if(in.nextLine().equalsIgnoreCase("stop")){

         play = 0;

         }
         
         else {
         
         play = 1;
         
         }         
         
         }while(play==1);

         System.out.println("THE END");
                  
         }
         
   }
         
         
         
         
