class J7A3
  {
    public static void main ( String[] args )
    {
	  int[] valA = { 13, -22, 82, 17};
	  int[] valB = {-12, 24, -79, -13};
	  int[] sum = { 13+(-12), -22+24, 82+(-79), 17+(-13)};
	  
	  System.out.println( "sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
	  
	  //
	  // Now repeat the process above using a for loop.
	  //
	  int[] sumL = new int[4];
	  
	  System.out.println( "index -- sum");
	  for ( int i = 0; i < sumL.length ; i++)
	  {
	    sumL[i] = valA[i] + valB[i]; 
	    System.out.println( i + " -- " + sumL[i] );
	  }
	}
}