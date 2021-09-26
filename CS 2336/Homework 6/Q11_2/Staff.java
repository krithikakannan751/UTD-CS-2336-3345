/*
    Krithika Kannan
    CS 2336.501
    Homework 6 - Question 11.2
    10/17/20
*/

/*
    The staff class creates a staff object. Staff is a subclass of employee.
*/
public class Staff extends Employee 
{
	//Instance field
	private String title;

	//Constructor
	public Staff(String name, String address, String phone,  
		String email, int office, double salary, String title)
	{
		super(name, address, phone, email, office, salary);
		this.title = title;
	}
    
    //accessor method
	//gets title
	public String getTitle() 
	{
		return title;
	}

	//mutator method
	//sets title
	public void setTitle(String title) 
	{
		this.title = title;
	}

	//toString()
	public String toString()
	{
		return super.toString() + "\nTitle: " + title;
	}
}