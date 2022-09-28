

//To check whether given number is even or odd

import java.util.Scanner;
class Numbers{
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number :");
	int num = sc.nextInt();
	if(num % 2 == 0)
	{
	  System.out.println("The given number "+num+" is Even number." );
	}
    else
    {
      System.out.println("The given number "+num+" is Odd number." );
    }
   }

}