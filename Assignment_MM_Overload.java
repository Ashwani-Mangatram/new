package basics_two;

public class Assignment_MM_Overload //assignment 22 main method overloading by making sure other main methods are non static
{
public void main(int a , int b) 
{
	
	int sum = a+b;
	System.out.println(sum);
}
public void main(String name) 
{
	System.out.println("A1234z");
}
public void main(double a, int b) 
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
