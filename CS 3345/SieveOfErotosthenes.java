/*
 * Krithika Kannan
 * SE 3345.005
 * Project 1: Sieve of Erotosthenes
 * 9/9/21
*/

/*imports*/
import java.util.Scanner; //used for getting user input

/*
 * This program computes all prime numbers less than or equal to a given integer N using the
 * algorithm “Sieve of Erotosthenes”.
 * An array of integers 2 to N is first created. Then, the smallest integer of the array is found (i),
 * marked as prime, and all of its remaining multiples such as 2i, 3i, ..., is crossed out.
 * When i is sqrt(𝑁), the algorithm terminates.
*/
public class SieveOfErotosthenes
{
    /*
     * This method finds all of the prime numbers less than or equal to a given integer N.
     * The method returns an array the size of the input number, where the true values indicte 
     * prime numbers.
    */
    public boolean[] findPrimes(int n)
    {
        //creates an array the size of the input number 
        boolean[] numArr = new boolean[n+1];
        
        //goes through each of the array elements
        for(int i = 0; i <= n; i++)
        {
            //sets each element to true
            numArr[i] = true; 
        }
        
        //loops through squares of numbers (4, 9, 16, ...) until the square num is larger than the input
        for(int j = 2; j * j <= n; j++)
        {
            //checks to see if the square num is prime
            if(numArr[j] == true)
            {
                //checks to see if the multiples of square num are also prime (num^2+num, num^2+2num, num^2+3num...) 
                for(int k = j * 2; k <= n; k += j)
                {
                    //sets element to false
                    numArr[k] = false;
                }
            }
        }
        
        //returns numArr array
        return numArr;
    }
    
    /*
     * Main method gets user input to calculate Sieve Of Erotosthenes.
    */
    public static void main(String args[]) 
    {
      //asks the user to enter a value to calculate the Sieve Of Erotosthenes
      System.out.println("Sieve of Erotosthenes program to calculate prime numbers up to the entered value.");
      System.out.println("Enter an integer greater than 1: ");
      
      //creates a scanner to read in the user input
      Scanner scan = new Scanner(System.in);
      int enteredNum = scan.nextInt();
      
      //checks to see if the entered number is an integer greater than 1
      if(enteredNum > 1)
      {
          //creates a new Sieve Of Erotosthenes object
          SieveOfErotosthenes primeNums = new SieveOfErotosthenes();
          //creates a new array with the return value of the findPrimes method
          boolean primeArr[] = primeNums.findPrimes(enteredNum);
          
          //prints prime nums
          System.out.print("Prime numbers: ");
          
          //goes through array and prints prime numbers
          for(int i = 2; i <= enteredNum; i++)
          { 
              //checks to see if prime
              if(primeArr[i] == true)
              {
                  //prints prime num
                  System.out.print(i + " ");
              }
          }
      }
      else
      {
          //prints if the user did not ender correct value
          System.out.println("Error: did not enter an integer greater than 1");
      }
    }
}