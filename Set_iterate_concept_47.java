package assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_iterate_concept_47 
{
    public static void main(String[] args) 
    {
		Set a1 = new HashSet();
		a1.add(21);
		a1.add(32);
		a1.add(45);
		
		       Iterator a2 = a1.iterator();
		       
		       while (a2.hasNext()) 
		       {
		    	   System.out.println(a2.next());
		       }
	}
}
