/*
    Krithika Kannan
    CS 2336.501
    HW 7 - Q13_9
    10/24/2020
*/

/*
    Tester class
*/
public class Q13_9
{
	public static void main(String[] args) 
	{
		//Circle Objects
		Circle c1 = new Circle(1, "blue", true);
		Circle c2 = new Circle(1, "yellow", false);
		Circle c3 = new Circle(8, "yellow", false);

		//Comparing the circles
		System.out.println("Circle 1's  radius: " + c1.getRadius());
		System.out.println("Circle 2's radius: " + c2.getRadius());
		System.out.println("Circle 3's radius: " + c3.getRadius());
		
		System.out.println("");
        
        if(c1.equals(c2))
        {
            System.out.println("Circle 1 is equal to Circle 2");
        }
        else
        {
            System.out.println("Circle 1 is not equal to Circle 2");
        }
	    
	    if(c2.equals(c3))
        {
            System.out.println("Circle 2 is equal to Circle 3");
        }
        else
        {
            System.out.println("Circle 2 is not equal to Circle 3");
        }
    
        if(c1.equals(c3))
        {
            System.out.println("Circle 1 is equal to Circle 3");
        }
        else
        {
            System.out.println("Circle 1 is not equal to Circle 3");
        }
	}
}