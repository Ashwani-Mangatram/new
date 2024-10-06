package assignments;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_87_88 
{
   public static void main(String[] args) 
   {
	   Map <String, Integer> a1 = new HashMap<String, Integer>();
	   a1.put("abc", 12);
	   a1.put("pqr", 32);
	   a1.put("xyz", 92);
	   a1.put("mno", 14);
	   
	   System.out.println(a1);
	   
	  for (String s1 : a1.keySet()) //for 
	   {
		   System.out.println(s1);
	   }
	   for (int s2 : a1.values()) 
	   {
		   System.out.println(s2);
	  }
	   
	   Set<java.util.Map.Entry<String, Integer>>  s2 = a1.entrySet();
	   Iterator<java.util.Map.Entry<String, Integer>> i1 = s2.iterator();
	   
	   while (i1.hasNext())   //while
	   {
		   System.out.println(i1.next());
	   }
	   
   }
}
