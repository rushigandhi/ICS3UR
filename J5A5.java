import java.util.Scanner;

class J5A5 {
   
   public static void main(String[] args){
      
      // Step 1: Declaring Variables
      
      Scanner in = new Scanner(System.in);
      
      int randomNum;
      
      int userNum;
      
      int play;
      
      int counter = 0;
      
      // Step 2: Assiging Values
      
      
         play = 1;
       
      
      // Step 3: Processing and Output
         
         do{    
         randomNum = (int)(Math.random()*100+1);
      
         System.out.println("------------NEW GAME------------");
         
         do{
      
         do {
                                 
               System.out.println("Enter a number between 1 and 100");
            
               userNum = in.nextInt();
            
            }while(userNum>100||userNum<1);  
            

         
            if(userNum<randomNum-10){
            
               System.out.println("Too low!");
               
               counter++;
            
            }
             else if(userNum>randomNum+10){
            
               System.out.println("Too high!");

               counter++;
            
            }
                
            else if((userNum>randomNum-11)&&(userNum<randomNum)){
            
               System.out.println("Low but close!");

               counter++;
            
            }
            else if((userNum<randomNum+11)&&(userNum>randomNum)){
            
               System.out.println("High but close!");

               counter++; }
         
          } while(userNum!=randomNum);
      
         System.out.println("You won! It took you " + (counter+1) + " tries.");
         
      
         System.out.println("Do you wanna play again? Enter \"yes\" to continue and \"no\" to end the game.");
         
         in.nextLine();
      
         if(in.nextLine().equalsIgnoreCase("yes"))
         {
            play = 1;
         }
         else
         {
            play = 0;
            
            System.out.println("------------GAME OVER------------");
         }

}while(play==1);

}
}