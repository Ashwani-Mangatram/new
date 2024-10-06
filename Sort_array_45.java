package assignments;

import java.util.Arrays;

public class Sort_array_45 
{
    public static void main(String[] args) 
    {
		int marks [] = new int [3];
		marks [0] = 6;
		marks [1] = 7;
		marks [2] = 5;

		String a    = Arrays.toString(marks);
		System.out.println("Before sorting " +a);
		
		Arrays.sort(marks);
		System.out.println("After sorting " + Arrays.toString(marks));
	}
}
