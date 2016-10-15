// Program Header Block
// - AreaOfTriangle
// - Rushi Gandhi
// - September 29, 2016
// - Calculates the area of a triangle given the dimensions

import javax.swing.*;

public class J2A9AreaOfTriangle
{
   public static void main (String[] args)
   {
      // Step 1 - Declaring variables
      
      String strBase, strHeight;
      double dblBase, dblHeight, dblArea;
   
      // Step 2 - (Input) Assigning values to variables
      
      strBase = JOptionPane.showInputDialog("Enter the triangle's base: ");
      strHeight = JOptionPane.showInputDialog("Enter the triangle's height: ");
   
      // Step 3 - Processing
      
      dblHeight = Double.parseDouble(strHeight);
      dblBase = Double.parseDouble(strBase);
      dblArea = dblHeight*dblBase/2;
   
      // Step 4 - Output
      
      JOptionPane.showMessageDialog (null, "A triangle with base " + dblBase +
         " units\nand height " + dblHeight +
         " units\nhas an area of " + dblArea + " square units");
   
   }
}