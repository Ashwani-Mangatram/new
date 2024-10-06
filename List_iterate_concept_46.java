package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_iterate_concept_46 
{
     public static void main(String[] args) 
    {
		  List a1 = new ArrayList();
		    a1.add(45);
		    a1.add(41);
		    a1.add(19);
		       
		   Iterator a2    =   a1.iterator();   
		   while (a2.hasNext()) 
		   {
			   System.out.println(a2.next());
		   }
		   
		      ListIterator a3    = a1.listIterator();
		      
		      while(a3.hasPrevious()) 
		      {
				   System.out.println(a3.previous()); 
		      }   
	}
}
