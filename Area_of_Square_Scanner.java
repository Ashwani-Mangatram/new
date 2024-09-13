package basics_two;

import java.util.Scanner;

public class Area_of_Square_Scanner 
{
public static void main(String[] args) 
{
	Scanner n1 = new Scanner(System.in);
	System.out.println("enter the lenth of arm of square");
	           long a  = n1.nextLong();
	           long area = a*a;
    System.out.println("area of square - "  + area);	           
}
}
