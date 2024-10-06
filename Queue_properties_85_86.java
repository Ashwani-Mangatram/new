package assignments;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_properties_85_86 
{
    public static void main(String[] args) 
    {		
	Queue a1 = new LinkedList();
	a1.add(12);
	a1.add(31);
	a1.add(73);
	a1.add(57);
	a1.add("ashwani");  //accept duplicate value and hetrogenious value
	a1.add("ashwani");
	a1.add(null);  //accept duplicate null
	a1.add(null);
	              Iterator a2    =  a1.iterator(); //USING ITERATOR WE CAN PRINT IN FORWORD DIRECTION
	              while (a2.hasNext())
	         {
	        	 System.out.println(a2.next()); //List iterator cannot be used	 
	         }     
}
}