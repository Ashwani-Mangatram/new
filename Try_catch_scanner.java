package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch_scanner
{

	public static void main(String[] args) 
	
	{
		
		try {
		Scanner a1 = new Scanner(System.in);
		System.out.println("please enter your age");
		
		   int age = a1.nextInt();     
		
	       }
		catch (InputMismatchException e)
		{
	
			Scanner a2 = new Scanner(System.in);

			System.out.println("please re-enter your age");
		     int age = a2.nextInt(); 
		     
		}

		}
		
		
	
}
