/*
    Krithika Kannan
    CS 2336.501
    HW 12 - HashTableBuilder.java
    12/5/2020
*/


/*
    The HashTableBuilder class creates a hash table to store elements in. This class
    creates elements, inserts records, deletes keywords, finds keywords, and prints.
    90% of the code was given, I edited the delete method and added comments.
*/
class HashTableBuilder
{
    //Variables
    Element[] hashTable; //to store elements
    int tableSize; //to store the size of the hash table

    /* 
        Constructor of the class, which creates a hashTable
    */
    HashTableBuilder(int numKeyWords) 
    {
        //initializaing variables
        tableSize = nextPrime(numKeyWords * 2); //size of hashTable
        hashTable = new Element[tableSize];
    }


    /*
        Method creates an element
    */
    private Element createNewElement(String keyword, Record recordToAdd) 
    {
        return new Element(keyword, recordToAdd);
    }


    /*
        Helper function for insert(String keyword, Record recordToAdd)
    */
    void insert(String keyword, FileData fd) 
    {
        //Creates the record to add
        Record recordToAdd = new Record(fd.id, fd.title, fd.author, null);
        
        //Checks to find the keyword
        int index = find(keyword);
        
        if (index == -1) //if the keyword does not exist
        {
            //insert method is called
            insert(keyword, recordToAdd);
        }
        else //if the keyword exists
        {
            //record is added
            recordToAdd.next = hashTable[index].head;
            hashTable[index].head = recordToAdd;
        }
    }


    /*
        Adds a keyword to the hashTable
    */
    private void insert(String keyword, Record recordToAdd)
    {
        //Converts string keyword into int
        int key = convertStringToInt(keyword);

        //Finds index
        int index = key % tableSize;

        //Collision handler
        int probe = 1;

        //All collisions are printed
        while (hashTable[index] != null)
        {
            System.out.printf("%s conflicts with %s at index: %d\n", keyword, hashTable[index].keyword, index);
            index = getNextQuadProbIndex(key, probe++);
        }

        //Create new Element
        hashTable[index] = createNewElement(keyword, recordToAdd);
    }

    /*
        This function finds the keyword in the hashTable and returns the index
    */
    int find(String keyword)
    {
        //Converts string keyword into int
        int key = convertStringToInt(keyword);

        //Find the index
        int index = key % tableSize;

        //Collision handler
        int probe = 1;

        //Finds index
        while (hashTable[index] != null)
        {
            if (hashTable[index].keyword.compareTo(keyword) == 0)
            {
                return index;
            }

            index = getNextQuadProbIndex(key, probe++);
        }
        return -1;
    }


    /*
        Probes for the next index in the case of a collision
    */
    private int getNextQuadProbIndex(int key, int probe)
    {
        return ((key % tableSize) + (int) Math.pow(probe, 2)) % tableSize;
    }


    /*
        Converts the keyword to an integer
    */
    private int convertStringToInt(String keyword)
    {
        //Variables
        int sum = 0; //stores int value
        
        for (int i = 0; i < keyword.length(); i++)
        {
            //adds ASCII values of all characters
            sum += (int) keyword.charAt(i);
        }
        return sum;
    }
    

    /*
        Finds the next prime number after an int
    */
    private int nextPrime(int num)
    {
        num++; //increases num by 1
        for (int i = 2; i < num; i++)
        {
            if(num % i == 0) //checks to see if num is prime
            {
                num++;
                i = 2;
            }
            else //if it is not prime
            {
                continue; //skips
            } 
        }
        return num; //returns the next prime number
    }


    /*
        Prints all indexes and thier linkedLists in the HashTable
    */
    public void print()
    {
        int printWrap = 0;
        System.out.print("\n\n\n");
        
        for (int index = 0; index < tableSize; index++)
        {
            if (hashTable[index] != null && hashTable[index].keyword != "")
            {
                //Print index, keyword, and integer of the keyword
                System.out.printf("index [%d]: %s (E ---> int): %d\n", index, hashTable[index].keyword, convertStringToInt(hashTable[index].keyword));
                
                //Point rec to the current keyword
                Record rec = hashTable[index].head;

                System.out.print("\t\t");

                //Print records in linkedList
                while(rec != null)
                {
                    if (++printWrap % 3 == 0)
                    {
                        System.out.println();
                        System.out.print("\t\t");
                    }
                    System.out.printf("%d|%s|%s ---> ", rec.id, rec.author, rec.title);
                    rec = rec.next;
                }
                
                System.out.println("null\n");
                printWrap = 0;
            }
        }
   }
   
    /*
        Deletes a keyword from the hashTable
    */
    public int delete(String keyword)
    {
        //Index of keyword
        int index = find(keyword);

        if(index != -1) //If the keyword is found
        {
            //remove keyword from HashTable
            hashTable[index].head = null;
            hashTable[index] = new Element("", null);
        }

        //Return index delted keyword
        return index;
    }
}