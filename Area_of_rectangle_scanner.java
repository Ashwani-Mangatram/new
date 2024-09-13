package basics_two;

import java.util.Scanner;

public class Area_of_rectangle_scanner 
{
public static void main(String[] args) 
{
	Scanner n1 = new Scanner(System.in);
	System.out.println("enter the length of rectangle");
	     long a = n1.nextLong();
	System.out.println("enter the breath of rectangle");
	     long b = n1.nextLong();
	     long Area = a*b;
	System.out.println("Area of the rectangle - " + Area);    
}
}
