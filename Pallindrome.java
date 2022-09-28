// Number is pallindrome or not

import java.util.Scanner;
class Pallindrome{
    public static void main(String args[])
	{
	   int rem,temp,reverse=0;
		System.out.println("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt(); 
		while(temp!=0)
		{
			rem=temp%10;
			reverse = reverse*10+rem;
			temp=temp/10;
	        System.out.print(reverse);
		}
		if(num==reverse){
		 System.out.println("The number is Pallindrome.");
		}
		else{
		 System.out.println("The number is not Pallindrome.");
		}
	}
}