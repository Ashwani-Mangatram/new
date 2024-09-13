package basics_two; //multilevel inheritance in "separate" class_assignment 21


public class Inheritance_Class_1 extends Inheritance_class_2 
{
	static void add() 
	{
		int a = 1;
		int b = 2;
		int c = a+b;
		System.out.println(c);
	}
public static void main(String[] args) 
{
	add();
	Inheritance_Class_1 n1 = new Inheritance_Class_1();
	n1.sub(5, 7);
	n1.name("hello") ;
	  
}
}
