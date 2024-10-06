package assignments;

public class This_calling_61
{
	
	This_calling_61(String a) 
		{
            System.out.println("constructor ABC");
		}
	  
	This_calling_61() 
		{
		    this("hello");
            System.out.println("constructor pqr");
		}
		
   public static void main(String[] args) 
   {
	   //This_calling a1 = new This_calling(1);
	   This_calling_61 a2 = new This_calling_61();
   }
}
