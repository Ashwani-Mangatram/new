package assignments;

import java.util.Scanner;

public class Scanner_55 
{
   public static void main(String[] args) 
   {
	   Scanner a1 = new Scanner(System.in);
	   System.out.println("Enter the number");
	   int a = a1.nextInt();
	   System.out.println("Enter the number");
	   int b = a1.nextInt();
	   int c = a+b;
	   System.out.println("Total = " + c);
   }
}
