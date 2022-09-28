// Addition without using arithmetic operator

import java.util.Scanner;
class Addition{
   public static void main(String args[])
   {
    int i,result=0,a;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers : ");
	int num1 = sc.nextInt();
    int num2= sc.nextInt();
	a=num1;
    for(i=0;i<=num2;i++)
	{
	    	result=num1++;		
	}		
    System.out.println("Addition of two numbers "+a+" and "+num2+" is "+result);
   }
}