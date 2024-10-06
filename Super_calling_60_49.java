package assignments;

   class abc 
   {
	   abc(int a, int b)
	   {
		   System.out.println(1);
	   }
   }

   class xyz extends abc
   {
	   xyz(int c , int d)
	   {   
		   super (1,1);
		   System.out.println(2);
	   }
   }

public class Super_calling_60_49 extends xyz
{
	Super_calling_60_49(int c)
	{
		   super(1,1);
		   System.out.println(3);
	}
	
   public static void main(String[] args) 
   {
	   new Super_calling_60_49(2);
   }
}
