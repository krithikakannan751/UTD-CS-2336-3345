/*
    Krithika Kannan
    CS 2336.501
    HW 7 - Q13_10
    10/24/2020
*/

/*
    Tester class
*/
public class Q13_10
{
	public static void main(String[] args) 
	{
		//rectangle objects
		Rectangle r1 = new Rectangle(8, 7, "yellow", true);
		Rectangle r2 = new Rectangle(7, 8, "orange", false);
		Rectangle r3 = new Rectangle(6.2, 7, "yellow", true);
        
        //compare
		System.out.println("Rectangle 1's Area: " + r1.getArea());
		System.out.println("Rectangle 2's Area: " + r2.getArea());
		System.out.println("Rectangle 3's Area: " + r3.getArea());

		System.out.println("");
        
        if(r1.equals(r2))
        {
            System.out.println("Rectangle 1 is equal to Rectangle 2");
        }
        else
        {
            System.out.println("Rectangle 1 is not equal to Rectangle 2");
        }
	    
	    if(r2.equals(r3))
        {
            System.out.println("Rectangle 2 is equal to Rectangle 3");
        }
        else
        {
            System.out.println("Rectangle 2 is not equal to Rectangle 3");
        }
    
        if(r1.equals(r3))
        {
            System.out.println("Rectangle 1 is equal to Rectangle 3");
        }
        else
        {
            System.out.println("Rectangle 1 is not equal to Rectangle 3");
        }
	}
}