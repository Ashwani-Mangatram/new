package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_list_iterator_79_80_82 
{
	public static void main(String[] args) 
	{
		
	
	ArrayList a1 = new ArrayList();
	a1.add(12);
	a1.add(31);
	a1.add(73);
	a1.add(57);
	              Iterator a2    =  a1.iterator(); //USING ITERATOR WE CAN PRINT IN FORWORD DIRECTION
	              while (a2.hasNext())
	         {
	        	 System.out.println(a2.next());
	         }
	           System.out.println("using list iterator");
	            ListIterator a3      =   a1.listIterator();     //using list iterator
	            
	               while (a3.hasNext()) 
	                {
	                	System.out.println(a3.next());
	                }
	                
	                while (a3.hasPrevious()) 
	                {
	                	System.out.println(a3.previous());
	                }
	}               
}

