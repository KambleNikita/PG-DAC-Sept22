import java.util.Scanner;

class GCD
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st Positive No.");
		int a=s.nextInt();
		System.out.print("Enter 2nd Positive No.");
		int b=s.nextInt();
		int gcd=0;
		if(a==b)
		{
          System.out.print("G.C.D.= "+a);
		}			
		else if(a<b) 
		{
			for(int i=1;i<=a;i++)
			{
				if(a%i==0&&b%i==0)
				{
					gcd=i;
				}					
			}
			 System.out.print("G.C.D.= "+gcd);	
		}	
        else
		{
			for(int i=1;i<=b;i++)
			{
				if(a%i==0&&b%i==0)
				{
					gcd=i;
				}					
			}
			 System.out.print("G.C.D.= "+gcd);	
		}			
		
		
	}
	
}	


/*Logic :
1)Perform loop till lowest number
2)check a%i==b%i
3)gcd=i
*/