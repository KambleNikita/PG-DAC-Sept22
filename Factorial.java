//Factorial of number

import java.util.Scanner;
class Factorial{
   public static void main(String[] args)
   {
    System.out.println("Enter a number : "); 
    Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
	int i,fact=1;
	if(num==0)
	{
		System.out.println("Fcatorial of gven number 1");
	}
	else{
	for(i=1;i<=num;i++)
	 {
	  fact=fact*i;
	 }
	System.out.println("Fcatorial of gven number "+num+" is "+fact);
    }
   }
}