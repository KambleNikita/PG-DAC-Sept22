class P3{
   public static void main(String[] args)
   {
     for(int i=1;i<=9;i++)              //outer loop
	 {
	    for(int k=9;k>i;k--)           //loop for space
		{
			System.out.print(" ");    
		}
	 
	    for(int j=1;j<=i;j++)           //inner loop
		{
			System.out.print("* ");    //printing * with space
		}
	  
	  System.out.println();
	 }	 
   }
}