package assignments;

import java.util.Scanner;

public class Swtich_56 
{
    public static void main(String[] args) 
    {
		System.out.println("press 1 for add");
		System.out.println("press 2 for sub");
		System.out.println("press 3 for multiply");
		
		Scanner a1 = new Scanner(System.in);
		int input = a1.nextInt();
		
    	switch (input) 
    	{
    	case 1 :
    		Scanner b1 = new Scanner(System.in);
    		System.out.println("enter the number");
    		int a = b1.nextInt();
    		System.out.println("enter the number");
    		int b = b1.nextInt();
    		int c = a+b;
    		System.out.println("total is - " + c);
    		break;
    	case 2 :
    		Scanner b2 = new Scanner(System.in);
    		System.out.println("enter the number");
    		int x = b2.nextInt();
    		System.out.println("enter the number");
    		int y = b2.nextInt();
    		int z = x-y;
    		System.out.println("total is - " + z);
    		break;
    	case 3 :
    		Scanner b3 = new Scanner(System.in);
    		System.out.println("enter the number");
    		int p = b3.nextInt();
    		System.out.println("enter the number");
    		int q = b3.nextInt();
    		int r = p*q;
    		System.out.println("total is - " + r);    		
    		break;
    	default:
    		System.out.println("not a valid input" + "   please enter the valid input");	
	     }
    }
}