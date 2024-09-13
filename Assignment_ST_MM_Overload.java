package basics_two;

public class Assignment_ST_MM_Overload 
{

public static void main(int a , int b) 
{
	
	int sum = a+b;
	System.out.println(sum);
}
public static void main(String name) 
{
	System.out.println("A1234z");
}
public static void main(double a, int b) 
{
	double sub = a-b;
	System.out.println(sub);
}
public static void main(String[] args) 
{
	System.out.println("Ashwani");
	Assignment_MM_Overload n1 = new Assignment_MM_Overload();
	n1.main(2, 10);
	n1.main("z");
	n1.main(1.1, 2);
	
}
}
