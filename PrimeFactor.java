class PrimeFactor
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Positive No.");
		int a=s.nextInt();
		
		for(int i=2;i<a||i<b;i++)  //2,3,4,5......a=60..30..15..5
		{
			while(a%i==0&&b%i==0)     //0.. 
			{
				System.out.println(i);//2..2...3
				a=a/i;
				b=b/i;	//30..15..5
			}
		}
		
		if(a>2||b>2)
		System.out.println(a);	//5
	
	}
	
}	