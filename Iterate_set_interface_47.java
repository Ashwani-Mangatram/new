package assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterate_set_interface_47 
{
	public static void main(String[] args) 
	   {
		
		   Set a1 = new HashSet();
			a1.add(12);
			a1.add(31);
			a1.add(73);
			a1.add(57);
			              Iterator a2    =  a1.iterator(); //USING ITERATOR WE CAN PRINT IN FORWORD DIRECTION
			              while (a2.hasNext())
			         {
			        	 System.out.println(a2.next());
			         }
}
}
