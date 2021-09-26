/*
    Krithika Kannan
    CS 2336.501
    Homework 6 - Question 11.2
    10/17/20
*/

//Imports
import java.util.GregorianCalendar; //for calender

/*
    This class deals with getting the date
*/
public class MyDate 
{
	//Instance fields
	private int year;
	private int month;
	private int day;

	//constructor
	MyDate()
	{
		GregorianCalendar calander = new GregorianCalendar();
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	}

	//constructor with elapsed time parameter
	MyDate(long elapsedTime)
	{
		setDate(elapsedTime);
	}

	//constructor with year, month, and dat parameter
	MyDate(int year, int month, int day) 
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}

    //accessor methods
	//returns year
	public int getYear() 
	{
		return year;
	}

	//returns month
	public String getMonth() 
	{
		String m = String.valueOf(month + 1);
		return (month < 10 ? "0" + m : m);
	}

	//returns day
	public String getDay()
	{
		String d = String.valueOf(day);
		return (day < 10 ? "0" + d : d);
	}

	//mutator methods
	//sets new date
	public void setDate(long elapsedTime)
	{
		GregorianCalendar calander = new GregorianCalendar();
		calander.setTimeInMillis(elapsedTime);
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	} 
}