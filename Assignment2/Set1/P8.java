class P8{
   public static void main(String[] args)
   {
     for(int i=5;i>=1;i--)              //outer loop
	 {
	    for(int k=i-1;k>=1;k--)           //loop for space
		{
			System.out.print(" ");    
		}
	 
	    for(int j=i;j<=5;j++)           //inner loop
		{
			System.out.print(j+" ");    //printing * with space
		}
	  
	  System.out.println();
	 }	 
   }
}

/*
Output
       5
	  4 5
	 3 4 5
	2 3 4 5
   1 2 3 4 5
*/  