package assignments;

import java.util.Arrays;

public class Anagram_34 
{
public static void main(String[] args) 
{
	String a = "listen";
	String b = "silent";
	
	char []a1 = a.toCharArray(); //change into array of char
	char []b1 = b.toCharArray();
	
	System.out.println(a1[0]);
	System.out.println(b1[0]);
	
	Arrays.sort(a1);
	Arrays.sort(b1);
	
	System.out.println(a1);
	System.out.println(b1);

	String a2 = Arrays.toString(a1); //change string into array format
	String b2 = Arrays.toString(b1);
	
	System.out.println(a2);
	System.out.println(b2);

     boolean d   =Arrays.equals(a1, b1);
     System.out.println(d);

}
}
