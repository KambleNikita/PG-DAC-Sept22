class P5{
   public static void main(String[] args)
   {
     for(int i=1;i<=5;i++)              //outer loop
	 {
	    for(int j=1;j<=i;j++)           //inner loop
		{
			System.out.print((char)(i+64)+" ");    //printing * with space
		}
	   System.out.println();
	 }	 
   }
}

/*
Output:
A 
B B
C C C
D D D D
E E E E E

*/