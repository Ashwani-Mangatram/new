package basics_two;

import java.util.Scanner;

public class Area_of_Triangle_Scanner 
{
	static double f = 0.5;
public static void main(String[] args) 
{
	Scanner n1 = new Scanner(System.in);
	System.out.println("enter the value of base of triangle");
	   long b        = n1.nextLong();
    System.out.println("enter the value of height of triangle");
       long h        = n1.nextLong();
       double area = f*b*h;
    System.out.println("area of triangle - " + area);   
}
}
