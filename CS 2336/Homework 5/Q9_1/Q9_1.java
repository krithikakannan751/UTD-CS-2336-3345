/*
    Krithika Kannan
    CS 2336.501
    Homework 5 - Question 9.1
    Q9_1.java
    10/4/20
*/

/*
    This is the test program that compares two different rectangles
*/
public class Q9_1
{
    public static void main(String[] args) 
    {
		//Rectangle with width 4 and height 40
		Rectangle rectangle1 = new Rectangle(4, 40);

		//Rectangle with width 3.5 and height 35.9
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);

		//The width, height, area, and perimeter of rectangle1
		System.out.println("\n Rectangle 1");
		System.out.println("-------------");
		System.out.println("Width:     " + rectangle1.width);
		System.out.println("Height:    " + rectangle1.height);
		System.out.println("Area:      " + rectangle1.getArea());
		System.out.println("Perimeter: " + rectangle1.getPerimeter());

		//The width, height, area, and perimeter of rectangle2
		System.out.println("\n Rectangle 2");
		System.out.println("-------------");
		System.out.println("Width:     " + rectangle2.width);
		System.out.println("Height:    " + rectangle2.height);
		System.out.println("Area:      " + rectangle2.getArea());
		System.out.println("Perimeter: " + rectangle2.getPerimeter());
	}
}
