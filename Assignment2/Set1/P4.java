class P4{
   public static void main(String[] args)
   {
     for(int i=1;i<=5;i++)              //outer loop
	 {
	    for(int j=1;j<=i;j++)           //inner loop
		{
			System.out.print(i+" ");    //printing row number i
		}
	   System.out.println();
	 }	 
   }
}


/* output:
   1
   2 2
   3 3 3
   4 4 4 4
   5 5 5 5 5
*/  