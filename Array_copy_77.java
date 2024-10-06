package assignments;

import java.util.Arrays;

public class Array_copy_77 
{
      public static void main(String[] args) 
    {
		 int marks [] = new int [3];
		 marks [0] = 54;
		 marks [1] = 67;
		 marks [2] = 94; 
		 
		 int marks_1 [] = new int [3];
		 
		 for(int i = 0, k = 0; i<=2   ; i++, k++)
		 {
			 marks_1 [k] = marks [i];
		 }
		   System.out.println(Arrays.toString(marks_1));
		 
	}
}
