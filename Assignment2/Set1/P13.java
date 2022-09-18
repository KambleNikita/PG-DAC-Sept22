class P13{
  public static void main(String[] args)
  {
   for(int i=1;i<=5;i++)
   {
	 for(int j=1;j<=5-i;j++)
      {
         System.out.print(" ");
      }   
     for(int j=1;j<=i;j++)
      {
         System.out.print((char)(i+64)+" ");
      }   
        System.out.println();
   }

  }
}

/*
Output
        A
       B B
	  C C C
	 D D D D
	E E E E E