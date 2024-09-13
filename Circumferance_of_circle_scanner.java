package basics_two;

import java.util.Scanner;

public class Circumferance_of_circle_scanner 
{
       static int a = 2;
       static double pi = 3.14;
       
public static void main(String[] args) 
{
	Scanner n1 = new Scanner(System.in);
	System.out.println("enter the radius of circle");
	long r = n1.nextLong();
	double circumferance = a*pi*r;
	System.out.println("Circumferance of circle - " + circumferance);	
}
}
