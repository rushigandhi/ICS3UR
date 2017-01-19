class J7A2
 {
   public static void main ( String[] args )
   {
     int[] val = {13, -4, 82, 17};
     int[] twice;
     twice = new int[4];
     twice[0] = 26;
     twice[1] = -8;
     twice[2] = 164;
     twice[3] = 34;
     System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
     System.out.println( "New Array: " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
     //
     // Now repeat the process above using a for loop.
     //
     int[] twiceL = new int[4];
     System.out.println( "index -- Original -- New Array");
     for ( int i = 0; i < val.length; i++)
     {
       twiceL[i] = val[i]*2; 
       System.out.println( i + " -- " + val[i] + " -- " + twiceL[i] );
      }
   }
 }
