
//First approch
class P2{
   public static void main(String[] args)
   {
     for(int i=65;i<=70;i++)              //outer loop
	 {
	    for(char j=65;j<=i;j++)           //inner loop
		{
			System.out.print(j+" ");
		}
	   System.out.println();
	 }	 
   }
}


//Second Approach
class P2{
   public static void main(String[] args)
   {
     for(int i=1;i<=5;i++)              //outer loop
	 {
	    for(int j=1;j<=i;j++)           //inner loop
		{
			System.out.print((char)(j+64)+" ");  //typecasting
		}
	   System.out.println();
	 }	 
   }
}

/* output:
   A
   A B
   A B C
   A B C D
   A B C D E

*/   