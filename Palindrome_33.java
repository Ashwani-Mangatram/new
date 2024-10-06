package assignments;

public class Palindrome_33 
{
	public static void main(String[] args) 
	{
		String a = "malayalam";
		String b = "";
		
		for(int i = a.length()-1 ; i>=0; i--) 
		{
			char c = a.charAt(i);
					b = b+c;
		}
		   System.out.println(b);
		   
		 
		  if(a.equals(b) == true) 
		  {
		  System.out.println("palindrome");
		  }
		  
		  else 
		  {
			  System.out.println("not a palindrome");

		  }
	}
   
   
   
}
