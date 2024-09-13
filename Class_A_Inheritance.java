package basics_two;

class C //multilevel inheritance in single class program_assignment 21
{
	static void sum() 
	{
		int a = 1;
		int b = 2;
		int c = a+b;
		System.out.println(c);
	}   
}
class B extends C
{
	static void sub() 
	{
		int a = 1;
		int b = 2;
		int c = a-b;
		System.out.println(c);
	}
}

public class Class_A_Inheritance extends B
{
	static void mul() 
	{
		int a = 1;
		int b = 2;
		int c = a*b;
		System.out.println(c);
	}

public static void main(String[] args) 
{
	sum();
	sub();
	mul();	
}
}
