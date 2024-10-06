package assignments;

   class pqs
   {
	   void abc() 
		 {
			 System.out.println("1");
		 }
   }

public class Over_ridding_62_63 extends pqs
{     
	 void abc() 
	 {   
		 super.abc();
		 System.out.println("2");
	 }
      public static void main(String[] args) 
      {
    	  Over_ridding_62_63 a1 = new Over_ridding_62_63();
    	  a1.abc();
	  }
}
