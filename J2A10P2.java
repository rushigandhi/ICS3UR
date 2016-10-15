// Program Header Block
// - J2A10P2
// - Rushi Gandhi
// - October 3, 2016
// - Calculates the circumference and area of a circle.
   import java.util.Scanner;
   
   
   public class J2A10P2
   {
      public static void main(String[] args)
      
      {
      
      // Step 1 - Declaring variables
      
      Scanner in = new Scanner(System.in);
      double radius;
      
      // Step 2 - (Input) Assigning values to variables
      
      System.out.println("Enter the radius of the circle.");

      radius = in.nextDouble();
      
      // Step 3 - Processing and Output
      
      System.out.println("The circumference of the circle is " + ((radius*2)*Math.PI) + ".");
      
      System.out.println("The area of the circle is " + ((radius*radius)*(Math.PI)) + ".");           
     
     }
      
}