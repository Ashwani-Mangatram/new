package assignments;

class Amazon_login
{
private String username = "ash.mangatram@gmail.com";
	/* public void getun() 
	{	

	}
	*/ 
	public String getun()  //whenever we use return keyword, then make sure  that returntype is not void anymore, it should be same as data type
	{
		return username;
	}
	public void setun(String username) 
	{
		this.username = username;
	}
}
public class Encapsulation_93 
{
   public static void main(String[] args) 
   {
	   Amazon_login a1 = new Amazon_login();
	   a1.setun("ashwani@gmail.com");
	   System.out.println(a1.getun());
   }
}
