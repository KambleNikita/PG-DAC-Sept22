// To check given year is leap year or not


import java.util.Scanner;
class Year{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
	System.out.println("Enter the year : ");
	int y = sc.nextInt();
	if(y%4==0)
    {		
		if((y%100==0)||(y%400==0))
	{
	  System.out.println("The given year "+y+" is a Leap year. " );
	}
	}
	else
	{
	  System.out.println("The given year "+y+" is not a Leap year. " );
	}
  }
}