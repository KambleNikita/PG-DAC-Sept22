// Smallest number between 3 numbers

import java.util.Scanner;
class Three{
   public static void main(String args[])
   {
	  System.out.println("Enter three numbers :");
	  Scanner sc = new Scanner(System.in);
	  int n1 = sc.nextInt();
	  int n2 = sc.nextInt();
	  int n3 = sc.nextInt();
	  if(n1<n2 && n1<n3)
	  {
		  System.out.println("The smallest number is "+n1);
	  }
	  else if(n2<n1 && n2<n3)
	  {
		  System.out.println("The smallest number is "+n2);
	  }
	  else
	  {
		  System.out.println("The smallest number is "+n3);		  
	  }
   }
}