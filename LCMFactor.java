
//LCM by factorization method

import java.util.Scanner;
class LCMFactor{
   public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number 1: ");
	   int num1=sc.nextInt();
	   System.out.println("Enter the number 2: ");
	   int num2=sc.nextInt();
	   int lcm=1;
	   int divisor=2;
	   System.out.println("The LCM of two numbers "+num1+" and "+num2+" is ");
		while(num1>=divisor && num2>=divisor)
		   {
			 if(num1%divisor==0 && num2%divisor==0)
			 {
			   num1=num1/divisor;
			   num2=num2/divisor;
			   lcm=lcm*divisor;
			 }
			 else
			   divisor++;		   
		   }
		lcm=num1*num2*lcm;         //for prime numbers
		System.out.println(lcm);
  
   }

}


