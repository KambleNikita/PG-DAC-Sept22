//Factors of given number


import java.util.Scanner; 
class Factor{
    public static void main(String args[])
	{
	  int i;
	  System.out.println("Enter the number: ");
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  System.out.print("The factors of given number are: ");
	  for(i=1;i<=num;i++)
	  {
	    if(num % i==0)
		System.out.print(i+" "); 
				
	  }

	}
}