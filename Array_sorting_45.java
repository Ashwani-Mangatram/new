package assignments;

import java.util.Arrays;

public class Array_sorting_45 
{
    public static void main(String[] args) 
    {
			
	int a1[] = new int [3];
    a1[0] = 9;
    a1[1] = 7;
    a1[2] = 5;
    
    Arrays.sort(a1);                    //step: first sort the array and then use for loop to print it
      for (int i = 0; i<a1.length; i++) 
      {
	   System.out.println(a1[i]);
      }
         
    }
}