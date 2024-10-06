package assignments;

public class Reverse_stng_32 
{
public static void main(String[] args) 
{
	String a1 = "Ashwani";
	String a2 = "";
	
	for (int i = a1.length()-1 ; i>=0; i--)
	{
		char a3 = a1.charAt(i);
			 a2 = a2+a3;
	}
	System.out.println(a2);
}
}
