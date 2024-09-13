package basics_two;

import java.util.Scanner;

public class Area_of_trapezium_scanner 
{
	static double f = 0.5;
public static void main(String[] args) 
{
	Scanner n1 = new Scanner(System.in);
	System.out.println("enter the lenth of 1st base of trapezium");
	long a = n1.nextLong();
	System.out.println("enter the lenth of 2nd base of trapezium");
	long b = n1.nextLong();
	System.out.println("enter the height of trapezium");
	long h = n1.nextLong();
	double area = f*(a+b)*h;
	System.out.println("area of trapezium - " + area);	
}
}
