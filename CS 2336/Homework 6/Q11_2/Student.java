/*
    Krithika Kannan
    CS 2336.501
    Homework 6 - Question 11.2
    10/17/20
*/

/*
    The Student class creates a student object. Student is a subclass of person. 
*/
public class Student extends Person 
{
    //Instance Variables
	private int status;
	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 3;
	public final static int JUNIOR = 2;
	public final static int SENIOR = 4;
    
    //Constructor
	public Student(String name, String address,  
		String phone, String email, int status) 
	{
		super(name, address, phone, email);
		this.status = status;
	}

	//mutator method 
	//set the status
	public void setStatus(int status) 
	{
		this.status = status; 
	}

	//Accessor method 
	//get the status
	public String getStatus() 
	{
		switch (status) 
		{
			case 1 : return "freshman"; 
			case 2 : return "sophomore"; 
			case 3 : return "junior"; 
			case 4 : return "senior";
			default : return "Unknown"; 
		}
	}

	//toString()
	public String toString() 
	{
		return super.toString() + "\nStatus: " + getStatus();
	}
}