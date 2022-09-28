//How to check whether number is negative or positive


import java.util.Scanner;
class Positive{
    public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number: ");
	  int num=sc.nextInt();
	  
	  if(num!=0)
	  {
	    if(num>0)
		{
		    System.out.println("The given number "+num+" is Positive number. ");
		}
		else
		{
		    System.out.println("The given number "+num+" is Negative number. ");
		}
		 
	  }
	  else
      {
			System.out.println("The given number is zero. ");
	  }
    } 
}	