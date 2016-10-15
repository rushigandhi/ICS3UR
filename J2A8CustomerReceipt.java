  
   public class J2A8CustomerReceipt{
      public static void main(String[] args){
      
      // Step 1: Declaring and Assigning Variables
      
      String customerName = "Rushi Gandhi";
      String itemName = "Computer Mouse";
      double itemPrice = 36.00;
      final double HARMONIZED_SALES_TAX = 0.13; // Standard Ontario sales tax of 13%
      double totalTax;
      double totalPrice;
      // Step 2: Processing (calculations)
      
      totalTax = itemPrice*HARMONIZED_SALES_TAX;
      totalPrice = totalTax + itemPrice;
      
      
      // Step 3: Printing variables and expressions to the console
      
      System.out.println("Customer Name: " + customerName);
      System.out.println("Item Purchased: " + itemName);
      System.out.println(" ");
      System.out.println("$" + itemPrice + " price");
      System.out.println("$" + HARMONIZED_SALES_TAX*100 + "0" + " HST");
      System.out.println("---------");
      System.out.println("$" + totalPrice + " Total");
      
      }

}
      
      
         