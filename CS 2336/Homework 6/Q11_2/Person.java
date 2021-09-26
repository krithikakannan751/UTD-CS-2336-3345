/*
    Krithika Kannan
    CS 2336.501
    Homework 6 - Question 11.2
    10/17/20
*/

/*
    The Person class creates a person object.
*/
public class Person
{
    //Instance variables
	private String name;
	private String address;
	private String phone;
	private String email;

    //Default constructor
	public Person() 
	{
		this("Unknown","Unknown","Unknown","Unknown");
	}

	//overloaded contructor
	public Person(String name, String address, String phone, String email) 
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	} 
    
    //accessor methods
	// returns name
	public String getName()
	{
		return name;
	}

	//returns address
	public String getAddress()
	{
		return address;
	}

	// returns phone
	public String getPhone()
	{
		return phone;
	}

	//returns email
	public String getEmail()
	{
		return email;
	}
    
    //mutator methods
	//sets name
	public void setName(String name)
	{
		this.name = name;
	}

	//sets address
	public void setAddress(String address)
	{
		this.address = address;
	}

	//sets phone number
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	//sets email
	public void setEmail(String email)
	{
		this.email = email;
	}

	//toString
	public String toString() 
	{
		return "\nName: " + name + "\nAddress: " + address + 
				 "\nPhone number: " + phone + "\nEmail address: " + email;
	}
}