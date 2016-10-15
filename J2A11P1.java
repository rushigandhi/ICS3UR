// Program Header Block
// - AreaOfTriangle
// - Rushi Gandhi
// - October 11, 2016
// - Calculates the average of four marks

import java.util.Scanner;

public class J2A11P1

{

   public static void main(String[] args)
   
   {
      // Step 1: Declaring variables
      
      Scanner in = new Scanner(System.in);
      String yourName;
      String subject1Name;
      String subject1Mark;
      String subject2Name;
      String subject2Mark;
      String subject3Name;
      String subject3Mark;
      String subject4Name;
      String subject4Mark;
      int average;
      
      // Step 2: Assigning values
      
      System.out.println("What's your name?");
      yourName  = in.nextLine();
      
      System.out.println("What's your first subject?");
      subject1Name = in.nextLine();
      System.out.println("Enter your first subject mark (%).");
      subject1Mark = in.nextLine();
      
      System.out.println("What's your second subject?");
      subject2Name = in.nextLine();
      System.out.println("Enter your second  subject mark (%).");
      subject2Mark = in.nextLine();
      
      System.out.println("What's your third subject");
      subject3Name = in.nextLine();
      System.out.println("Enter your third  subject mark (%).");
      subject3Mark = in.nextLine();
      
      System.out.println("What's your fourth subject");
      subject4Name = in.nextLine();
      System.out.println("Enter your fourth  subject mark (%).");
      subject4Mark = in.nextLine();
      
      // Step 3: Processing
      
      int sub1mark = Integer.parseInt(subject1Mark);
      int sub2mark = Integer.parseInt(subject2Mark);
      int sub3mark = Integer.parseInt(subject3Mark);
      int sub4mark = Integer.parseInt(subject4Mark);
      
      average = (sub1mark+sub2mark+sub3mark+sub4mark)/4;
      
      // Step 4: Output
      
      System.out.println("Name: " + yourName);
      System.out.println(subject1Name + " " + subject1Mark + "%");
      System.out.println(subject2Name + " " + subject2Mark + "%");
      System.out.println(subject3Name + " " + subject3Mark + "%");
      System.out.println(subject4Name + " " + subject4Mark + "%");
      System.out.println("Average: " + average + "%");
      
              
      
      }

}
      
      
      


      
            
      
      
      
            