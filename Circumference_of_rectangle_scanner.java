package basics_two;

import java.util.Scanner;

public class Circumference_of_rectangle_scanner 
{
	static int a = 2;
public static void main(String[] args) 
{
	Scanner n1 = new Scanner(System.in);
	System.out.println("Enter the lenth of rectangle");
	long l = n1.nextLong();
	System.out.println("Enter the breadth of rectangle");
	long b = n1.nextLong();
	long Circumference  = a*(l+b);
	System.out.println("Circumference of rectangle - " + Circumference );	
}
}
