package basics_two;
import java.util.Scanner;
public class Addtion_scanner   
{
public static void main(String[] args) //addition of two numbers
{
	Scanner s1 = new Scanner(System.in);
	//System.out.println("print your name");
	           //String name    = s1.next();
	System.out.println("enter the number");
	int a = s1.nextInt();
	System.out.println("enter the number");
	int b = s1.nextInt();
	int sum = a+b;
	System.out.println("Addition - " + sum);
	     
}
}
