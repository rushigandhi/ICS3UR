// Program Header Block
// - J2A10P3
// - Rushi Gandhi
// - October 3, 2016
// - Converts kilometres to miles.
import java.util.Scanner;

public class J2A10P3{
      public static void main(String[] args){
      
       // Step 1 - Declaring variables
         Scanner in = new Scanner(System.in);
         double distanceKm;
         
         // Step 2 - (Input) Assigning values to variables
         
         System.out.println("Enter the distance in kilometres.");
   
         distanceKm = in.nextDouble();
         
         // Step 3 - Processing and Output
         
         System.out.println("The distance in miles is " + (distanceKm*0.621371) + ".");          
          
     }
      
}