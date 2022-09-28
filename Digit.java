//To print digits of given number  //recheck

import java.util.Scanner;
class Digit{
    public static void main(String args[])
	{
	  int digit,reverse=0;
	  System.out.println("Enter any number : ");
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();   //1234
	  while(num != 0)
	   {
        digit = num % 10;
        reverse = reverse*10+digit;
		num=num/10
       }
	   while(reverse!=0)
	   {
		  digit = reverse % 10;
	      System.out.println(digit);
		  reverse=reverse/10;
	   }
  	   
    }
}