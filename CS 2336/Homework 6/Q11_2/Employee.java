/*
    Krithika Kannan
    CS 2336.501
    Homework 6 - Question 11.2
    10/17/20
*/

/*
    The Employee class constructs an employee object. Employee is a subclass of 
    Person.
*/
public class Employee extends Person 
{
    //Instance Variables
	private int office;
	private double salary;
	private MyDate dateHired;

	//constructor
	public Employee(String name, String address, String phone, 
		String email, int office, double salary)
	{
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate();
	}
    
    //accessors
	//get office
	public int getOffice() 
	{
		return office;
	}

	// get salary
	public String getSalary()
	{
		return String.format("%.2f", salary);
	}

	//get date hired
	public String getDateHired() 
	{
		return dateHired.getMonth() + "/" + dateHired.getDay() 
				 + "/" + dateHired.getYear();
	}
    
    //mutators
	//set office
	public void setOffice(int office) 
	{
		this.office = office;
	}

	//set salary
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	//set date hired
	public void setDateHired() 
	{
		dateHired = new MyDate();
	}
    
    //toString()
	//return description of class
	public String toString() 
	{
		return super.toString() + "\nOffice: " + office + 
				 "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
	}
}