package basics_two;

import java.util.Scanner;

public class Area_of_circle_scanner 
{
	static double pi = 3.14; //global variable has been taken value of pi will be same always
public static void main(String[] args) 
{
	Scanner s1 = new Scanner(System.in);
	//System.out.println("enter the value of pi");
	              //double a   = s1.nextDouble();
	System.out.println("enter the value of radius");
	long b = s1.nextLong();
	double area = pi*b*b;
	System.out.println("Area of circle - " + area);

	
}
}
