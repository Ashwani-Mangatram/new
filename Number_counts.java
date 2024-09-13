package array_problems;

public class Number_counts 
{
public static void main(String[] args) 
{
	
	        int   count_of_alphabet = 0;
	        String a = "ash12# w ani";
	        char b [] =  a.toCharArray();
	        
	        for (int i = 0; i<a.length(); i++)
	        {  
	        boolean c = Character.isWhitespace(b[i]);
	        //System.out.println(s); 
	        if (c==true) 
	        {
	        	count_of_alphabet++; 
	        }
	        }
	        System.out.println(count_of_alphabet);
}
}
