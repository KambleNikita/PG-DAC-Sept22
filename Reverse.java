// to reverse a number

import java.util.Scanner;
class Reverse{
	public static void main(String args[])
	{
		int rem;
		System.out.println("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();  //1234
		System.out.println("Number before reversing its digits: "+num);
		System.out.println("Number after reversing its digits: ");
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
	        System.out.print(rem);
		}
		
	}
	
}