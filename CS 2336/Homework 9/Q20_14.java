/*
    Krithika Kannan
    CS 2336.501
    Homework 9 - Q20_14
    11/8/20
*/

//Imports
import java.util.*;

/*
    This program evaluates postfix expressions.
*/
public class Q20_14
{
	public static void main(String[] args)
	{
		//Commandline arugement - checks if something was entered
		if (args.length != 1) 
		{
			System.out.println("Usage: Q20_14 \"Expressions\"");
			System.exit(1);
		}
		
		//Commandline arugement - checks entered expression is valid
		try 
		{
			System.out.println(evaluate(args[0]));
		}
		catch (Exception ex) 
		{
			System.out.println("Wrong expression: " + args[0]);
		}
	}

	//Evaluate expression
	public static int evaluate(String input) throws Exception 
	{
	    //split the input
		input = blanks(input);
		String[] expression = input.split(" ");

		//stack to store operations
		Stack<Integer> stack = new Stack<>();
		
		//looks at operator
		for (String process: expression)
		{
			if (process.length() == 0)
			{
				continue;
			}
			else if (process.charAt(0) == '+' || process.charAt(0) == '-'||
						process.charAt(0) == '/' || process.charAt(0) == '*')
			{
					processOperator(stack, process.charAt(0));
			}
			else if (Character.isDigit(process.charAt(0)))
			{
				stack.push(Integer.parseInt(process));
			}
			else
			{
				throw new Exception("Wrong input- ");
			}
		}

		//returns result
		return stack.pop();
	}

	//Processes the operator
	public static void processOperator(Stack<Integer> operand, char operator)
	{
		int operand1 = operand.pop();
		int operand2 = operand.pop();

		switch (operator) 
		{
			case '+': operand.push(operand2 + operand1);
			          break;
			case '-': operand.push(operand2 - operand1); 
			          break;
			case '/': operand.push(operand2 / operand1); 
			          break;
			case '*': operand.push(operand2 * operand1);
		}
	}

	//inserts blanks
	public static String blanks(String b)
	{
		String res = "";

		for (int i = 0; i < b.length(); i++)
		{
			if (b.charAt(i) == '+' || b.charAt(i) == '-' ||
				 b.charAt(i) == '/' || b.charAt(i) == '*')
			{
				res += " " + b.charAt(i) + " ";
			}
			else
			{
				res += b.charAt(i);
			}
		}
		return res;
	}
}