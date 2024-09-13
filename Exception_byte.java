package basics_two;

import java.util.Scanner;

public class Exception_byte 
{
public static void main(String[] args) 
{
	Scanner n1 = new Scanner(System.in);
	System.out.println("enter the 5 or 6 digit number");
	    byte a = n1.nextByte();
	    
	    //Result error: InputMismatchException: Value out of range
}
}
