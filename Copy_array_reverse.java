package array_problems;

import java.util.Arrays;

public class Copy_array_reverse 
{
 public static void main(String[] args) 
 {
	    int marks_1 [] = new int [4];
	    
	    marks_1 [0] = 12;
	    marks_1 [1] = 73;
	    marks_1 [2] = 61;
	    marks_1 [3] = 57;
	    
	    int marks_2 [] = new int [4];
	    
	    for (int i =0, k = 3; i<4; i++, k--) 
	    {
	        marks_2 [k] = marks_1 [i];
	    }
	           
	     System.out.println(Arrays.toString(marks_2));
	    
	    
}
}
