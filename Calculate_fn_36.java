package assignments;

public class Calculate_fn_36
{
public static void main(String[] args) 
{
	String a = "My 1 is";
	int noofcount_alphbet = 0;
	int noofcount_digit = 0;
	int noofcount_space = 0;
	int noofcount_sp_char = 0;
	
    char [] b = a.toCharArray();
	//System.out.println(b[0]);
	
	for (int i = 0; i<a.length(); i++ ) 
	{
		boolean b1 = Character.isLetter(b[i]);
		boolean c1 = Character.isDigit(b[i]);
		boolean d1 = Character.isWhitespace(b[i]);
		
		
		//System.out.println(b1);
		
		if (b1==true) 
		{
			noofcount_alphbet++;
		}
		if (c1==true) 
		{
			noofcount_digit ++;
		}
		if (d1==true) 
		{
			noofcount_space ++;
		}
		
	}
	System.out.println("alphabet  " + noofcount_alphbet++);
	System.out.println("digits  " + noofcount_digit++);
	System.out.println("digits  " + noofcount_space++);
	System.out.println("digits  " + noofcount_sp_char++);
}
}
