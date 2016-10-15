// Program Header Block
// - J2A10P1
// - Rushi Gandhi
// - October 3, 2016
// - Processing using various math operators.
   import java.util.Scanner;
   
   public class J2A10P1
   {
      public static void main(String[] args)
      
      {
      
      // Step 1 - Declaring variables
      
      Scanner in = new Scanner(System.in);
      
      int firstInteger, secondInteger;
      
      // Step 2 - (Input) Assigning values to variables
      
      System.out.println("Enter the first integer.");

      firstInteger = in.nextInt();
      
      System.out.println("Enter the second integer.");
      
      secondInteger = in.nextInt();
      
      // Step 3 - Processing and Output
      
      System.out.println("The sum of the two integers is " + (firstInteger+secondInteger) + ".");
      
      System.out.println("The difference of the two integers is " + (firstInteger-secondInteger)+ ".");
      
      System.out.println("The product of the two integers is " + (firstInteger*secondInteger)+ ".");
      
      System.out.println("The quotient of the two integers is " + (firstInteger/secondInteger)+ ".");
      
      System.out.println("The modulus of the two integers is " + (firstInteger%secondInteger)+ ".");
     
      }
      
}