package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterate_list_interface_46 
{
   public static void main(String[] args) 
   {
	
	   List a1 = new ArrayList();
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
