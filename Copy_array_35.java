package assignments;

import java.util.Arrays;

public class Copy_array_35 
{
   public static void main(String[] args) 
   
{
	int marks [] = new int [4];
	
	marks [0] = 21;
	marks [1] = 11;
	marks [2] = 27;
	marks [3] = 37; 
	
	int roll_no []= new int [4];
	
	System.out.println(Arrays.toString(marks));
	
	for (int i = 0, k = 0; i<4; i++, k++)
	{
		 roll_no [k] = marks [i];
	}
	
	System.out.println(Arrays.toString(roll_no));
}
}
