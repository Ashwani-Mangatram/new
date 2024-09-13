package basics_two;

import java.util.Scanner;

public class Circumference_of_Square_Scanner 
{
	static int g = 4;
	
public static void main(String[] args) 
{
	Scanner n1 = new Scanner(System.in);
	System.out.println("Enter the lenth of Square of arm");
	double a = n1.nextDouble();
	double circumference = g*a;
	System.out.println("Circumference of square - " + circumference);	
}
}
