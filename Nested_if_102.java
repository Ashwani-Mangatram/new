package assignments;

public class Nested_if_102 
{
    public static void main(String[] args) 
    {
		char gender = 'm';
		int age = 60;
		
		if(gender == 'm') 
		{
			if (age <=5) 
			{
				System.out.println("free for child");
			}
		   else 
		   {
			  if (age>12) 
			  {
				  System.out.println("half ticket");
			  }
			  else 
			  {
				  if(age>=12 && age<60) 
				  {
					  System.out.println("full ticket");
				  }
				  else 
				  {
					  System.out.println("half ticket");

				  }
			  }
		   }
    } 
		else 
		{
			System.out.println("free for women");
		}
			
	}
}
