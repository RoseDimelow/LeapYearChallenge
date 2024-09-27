import java.util.Scanner;

public class LeapYearTask 

{

	public static void main(String[] args) 
	
	{
		Scanner userInput = new Scanner (System.in);
		System.out.println("Type in a year!");
		
		int year = userInput.nextInt();
		
		if (year % 4 == 0 & year % 100 != 0 | year % 4== 0 & year % 400 == 0)
		{
			System.out.println("This year is a leap year!  :)");
		}
		
		else
		{
			System.out.println("This year is not a leap year.  :(");
		}
			
	}
//hi there
}
