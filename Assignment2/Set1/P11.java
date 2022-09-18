class P11{
   public static void main(String[] args)
   {
     for(int i=1;i<=5;i++)              //outer loop
	 {
	    for(int k=5;k>i;k--)           //loop for space
		{
			System.out.print(" ");    
		}
	 
	    for(int j=1;j<=(2*i-1);j++)           //inner loop
		{
			System.out.print("*");    //printing * with space
		}
	  
	  System.out.println();
	 }	 
   }
}