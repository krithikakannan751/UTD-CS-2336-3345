/*
    Krithika Kannan
    CS 2336.501
    HW 8 - Q19.2
    10/30/2020
*/

//Imports
import java.util.ArrayList;//for ArrayList

/*
    This program defines a stack.
*/
public class GenericStack<E> extends ArrayList<E>
{

	//returns top of stack
	public E peek() 
	{
		return get(size() - 1);
	}

	//adds element to the stack
	public void push(E o)
	{
		add(o);
	}

	//remove and return element top of stack
	public E pop() 
	{
		E o = get(size() - 1);
		remove(size() - 1);
		return o;
	}

    //Override the string method in the ArrayList class
	@Override 
	public String toString() 
	{
		return "stack: " + super.toString();
	}
}
