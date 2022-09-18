class P10{
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
			System.out.print((char)(j+64)+" ");    //printing * with space
		}
	  
	  System.out.println();
	 }	 
   }
}

/*
Output
       E
	  D E
	 C D E
	B C D E
   A B C D E
*/  