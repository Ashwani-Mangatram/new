package assignments;

public class Method_overloading_48 
{
	
	static void abc () 
	{
		System.out.println("1");
	}
	
	static void abc (int a) 
	{	
	System.out.println("2");
	}
	
	static void abc (int a , int b) 
	{
		System.out.println("3");
	}
	
   public static void main(String[] args) 
   {
	    abc();   
	    abc(1); 
	    abc(1,3); 
   }
}
