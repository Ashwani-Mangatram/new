package assignments;


class a 
{
	static void sub() 
	{
		int a = 1; 
		int b = 2; 
		int c = a-b;
		System.out.println(c);
	}
}
class b extends a
{
	static void sum() 
	{
		int a = 1; 
		int b = 2; 
		int c = a+b;
		System.out.println(c);
	}
}

public class Inhertance_57 extends b
{
	
   public static void main(String[] args) 
   {
	  sum();
	  sub();

   }
}
