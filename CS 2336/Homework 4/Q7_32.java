/*
    Krithika Kannan
    CS 2336.501
    Homework 4 - Question 7.32
    10/4/20
*/

//Imports 
import java.util.Scanner; //for user input

/*
    This program partitions a list that the user enters.
*/
public class Q7_32 {
    public static void main(String args[]) 
    {
        //Asks for user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter list:");
        
        //Stores list into array
        int[] arr = new int[scan.nextInt()];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = scan.nextInt();
        }
       
        //calls partition method
        int[] partitionList = partition(arr);
        
        //prints array
        System.out.print("After the partition, the list is ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
  
    public static int[] partition(int[] arr) 
    {
        int pivot = arr[0];  //partition   
        int i = 1; //starting
        int j = arr.length -1; //last

        while (i < j)
        {
            if(arr[i] > pivot)
            {
                if(arr[j] <= pivot)
                {   //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j--;
                }
                else
                {
                    j--;
                    i--;
                }
            }
            i++;
        }
        //swap
        int temp = pivot;
        arr[0] = arr[i - 1];
        arr[i-1] = temp;
        
        return arr;
    }
}