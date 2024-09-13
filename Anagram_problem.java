package array_problems;

import java.util.Arrays;

public class Anagram_problem 
{
public static void main(String[] args) 

{
	String a1 = "arm";
	String a2 = "ram";
	       
	     char[] b1 =     a1.toCharArray();
	         char []  b2    =     a2.toCharArray();
	         
	         System.out.println(b1[0]); // toCharArray converts string into char of array
	       System.out.println(b2[2]);
	         
	         
	               String c1   = Arrays.toString(b1); //gives result in Array format
	               String c2   = Arrays.toString(b2);
	               
	               System.out.println(c1); 
	               System.out.println(c2);
	               
	                 Arrays.sort(b1);  //sorting
	                 Arrays.sort(b2);
	                 System.out.println(b1);
	                 System.out.println(b2);
	                 
	            boolean a =    Arrays.equals(b1, b2);
	            System.out.println(a);

}

}
