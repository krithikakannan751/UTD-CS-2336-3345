/*
    Krithika Kannan
    CS 2336.501
    Homework 6 - Question 11.2
    10/17/20
*/


/*
    The Faculty class creates a faculty object. Faculty is a subclass of employee.
*/
public class Faculty extends Employee 
{
	//Instance fields
	private String officeHours;
	private String rank;

	// Constructor
	public Faculty(String name, String address, String phone, String email, 
		int office, double salary, String officeHours, String rank) 
	{
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	//Accessor methods
	//returns office hours
	public String getOfficeHours()
	{
		return officeHours;
	}

	//sets new office hours
	public void setOfficeHours(String officeHours) 
	{
		this.officeHours = officeHours;
	}

	//returns rank
	public String getRank() 
	{
		return rank;
	}
    
    //mutator methods
	//sets new rank
	public void setRank(String rank) 
	{
		this.rank = rank;
	}

	//toString()
	public String toString()
	{
		return super.toString() + "\nOffice hours: " + officeHours +
		"\nRank: " + rank;
	}
}