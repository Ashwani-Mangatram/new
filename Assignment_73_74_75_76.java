package assignments;

public class Assignment_73_74_75_76 
{
    public static void main(String[] args) 
    {
    	String a1 = "ashwani";   //find out if the string ends with "i"
	     boolean a2     = a1.matches("(.*)i");
	     System.out.println(a2);
	     
	String b1 = "ashwani";               //find out if the string starts with "a"
	     boolean b2     = b1.matches("a(.*)");
	     System.out.println(b2);
	     
	String c1 = "Ashwani";
		boolean c2	 = c1.matches("(.*)s(.*)"); /// find out if the letter is anyplace in the string 
		System.out.println(c2);
		
		String d1 = "ABCD";
		boolean d2 = d1.matches("..."); // number of count in the given string
		System.out.println(d2); 
	}
}
