package assignments;

import java.util.Date;

public class Time_37_38_39 
{
public static void main(String[] args) 
{
	Date epoch = new Date();
	//System.out.println(epoch.getTime());
	
	Date curr_time = new Date(epoch.getTime());  //current time
	
	System.out.println(curr_time);
	
    Date future_time = new Date(epoch.getTime() + 1000*24*60*60);  //future time
	
	System.out.println(future_time);
	
    Date past_time = new Date(epoch.getTime() - 1000*24*60*60);  //past time
	
	System.out.println(past_time);
}
}
