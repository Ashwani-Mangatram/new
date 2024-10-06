package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch_41_42
{
public static void main(String[] args) throws InputMismatchException
{
	try 
	{
	Scanner a1 = new Scanner (System.in);
	System.out.println("enter your age");
	       int age   = a1.nextInt();
	       
	}
	
	catch (InputMismatchException a1)
	{
		System.out.println("does not seem age, re-enter your age");
		Scanner a2 = new Scanner (System.in);
		//System.out.println("enter your age");
		       int age   = a2.nextInt();
	}    
	
}
}
