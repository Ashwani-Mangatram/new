package assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_properties_84 
{
           public static void main(String[] args) 
           {
        	   Set a1   =  new HashSet ();   //set interface does not support duplicates
	           a1.add(11);
	           a1.add(11);
	           a1.add(null);
	           a1.add(23);       //set interface does not follow indexing
	           a1.add("ashwani");
	           a1.add(null);      
	           
	           //support null only once &  it supports hetrogeneous & it is dynamic in nature
	           //we can iterate "set" using iterator, it is applicable for entire collection
	          //listIterator is not applicable for set and it can be done only for iterator
	           System.out.println(a1);
	           
	           Iterator  a2    =     a1.iterator();
	           while (a2.hasNext()) 
	           {
	              System.out.println(a2.next());
	           }      
        	   
		   }
}
