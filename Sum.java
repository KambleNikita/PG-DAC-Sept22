// To find sum of digits of given number

import java.util.Scanner;
class Sum{
   public static void main(String args[])
   {
     int temp,sum=0,rem;
	  System.out.println("Enter any number : ");
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt(); 	  //1234
	  temp=num;
	  while(temp!=0)
	  {
		  rem=temp%10;  //123%10=3   2    1
		  sum=sum+rem; //3          5    6
		  temp=temp/10;  //12         1
	  }  
	  
	  System.out.println("The sum of digits of given number "+num+" is "+sum);
   }
}