class P12{
   public static void main(String[] args)
   {
     for(int i=1;i<=5;i++)              //outer loop
	 {
	    for(int k=1;k<=5-i;k++)           //loop for space
		{
			System.out.print(" ");    
		}
	 
	    for(int j=1;j<=i;j++)           //inner loop
		{
			System.out.print(i+" ");    //printing * with space
		}
	  
	  System.out.println();
	 }	 
   }
}


/*
Output:
        1
       2 2
	  3 3 3
	 4 4 4 4
	5 5 5 5 5