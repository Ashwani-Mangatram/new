package assignments;

public class Number_check_44 
{
	public static void main(String[] args) 
	{
		int v1[] = new int [4];
		v1[0] = 40;
		v1[1] = 61;
		v1[2] = 45;
		v1[3] = 34;
		int numbertocheck = 34;
		
		for(int i=0; i<4; i++)
		{
		if(numbertocheck==v1[i])	
		{
			System.out.println("number " +numbertocheck+ " is part of it " + "and index id " + i);
		}
		}
	}
}
