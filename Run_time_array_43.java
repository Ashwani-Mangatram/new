package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Run_time_array_43 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner (System.in);
		double  marks [] = new double [4];
		
		for(int i = 0; i<marks.length ; i ++) 
		{
		      
		        marks [i]     = s1.nextDouble();
		}   
		
	    System.out.println(Arrays.toString(marks));
	     s1.close();
	}
}
