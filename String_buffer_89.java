package assignments;

public class String_buffer_89 
{
   public static void main(String[] args) 
   {
	   StringBuffer a1 = new StringBuffer ("Ashwani");
		System.out.println(a1);
		System.out.println(a1.reverse()); //reverse the string 
		System.out.println(a1.length()); //find out the length 
		a1.append(" Kumar");
		System.out.println(a1);
		System.out.println(a1.substring(0, 2)); // Substring will give the value of index 
		System.out.println(a1.substring(2));  //will give the value apart from given index 
		System.out.println(a1.delete(0, 7));
}
}
