package assignments;

public class This_kiword_64 
{
    int marks;
    String name;
    
    void student (int marks , String name) 
    {
    	this.marks = marks;
    }
    
    public static void main(String[] args) 
    {
    	This_kiword_64 a1 = new This_kiword_64();
    	a1.student(64, "ashwani");
    	System.out.println(a1.marks);
    	System.out.println(a1.name);
	}
}
