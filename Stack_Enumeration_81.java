package assignments;

import java.util.Enumeration;
import java.util.Stack;

public class Stack_Enumeration_81 
{
   public static void main(String[] args) 
   {
	     Stack a1 = new Stack ();
	    a1.add(12);
	 	a1.add(31);
	 	a1.add(73);
	 	a1.add(57);
	 	a1.add("ashwani");  //accept duplicate value and hetrogenious value
	 	a1.add("ashwani");
	 	a1.add(null);  //accept duplicate null
	 	a1.add(null);
	 	
	 	System.out.println(a1); 
	 	
	 	Enumeration e1          = a1.elements();
	 	while (e1.hasMoreElements()) 
	 	{
	 		System.out.println(e1.nextElement());
	 	}
   }
}
