/*
    Krithika Kannan
    CS 2336.501
    Homework 6 - Question 11.2
    10/17/20
*/

/*
    This is a tester class
*/
public class Q11_2
{
	public static void main(String[] args)
	{
	    //Create objects
	    Faculty faculty = new Faculty("Mark", "Costco drive", "7489376353",
			"mark@gmail.com", 101, 5000000, "10pm to 11pm", "Teaching Assistant");
	   	Student student = new Student("Jacob", "Town Street", "7463526789", 
			"jacob@gmail.com", Student.FRESHMAN);
		Person person = new Person("Rohan", "Far Away Street", 
			"3473339999", "rohan@gmail.com");
		Employee employee = new Employee("Krithika", "Left Street", "7463425649",
			"krithika@gmail.com", 470, 60000000);
		Staff staff = new Staff("Sam", "100 Right Street", "8946537289",
			"sam@gmail.com", 12, 18000000, "Teaching Intern");

		//Invoke toString
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}
