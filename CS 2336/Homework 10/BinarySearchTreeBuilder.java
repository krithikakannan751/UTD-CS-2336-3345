/*
    Krithika Kannan
    CS 2336.501
    HW 10/11 - BinarySearchTreeBuilder.java
    12/5/2020
*/

/*
    The BinarySearchTreeBuilder class checks to see if a kayword is in the BST,
    inserts a word into the BST, deletes a word in the BST, and prints the BST.
*/
public class BinarySearchTreeBuilder 
{
    //Instance variables
    BSTNode root; //root of BST

    /*
        Constructor
    */
    public BinarySearchTreeBuilder()
    {
        this.root = null; //sets root to null
    }

    /*
        Checks keyword in BST
    */
    public boolean contains(String keyword)
    {
        //Current node
        BSTNode cNode = root;
        
        //Go through bst until keyword is found
        while(cNode != null)
        {
            if(cNode.keyword.compareTo(keyword) > 0) //left side
            {
                cNode = cNode.left;
            }
            else if(cNode.keyword.compareTo(keyword) < 0) //Right side
            {
                cNode = cNode.right;
            }
            else //If keyword is found
            {
                return true;
            }
        }

        //If keyword is not found
        return false;
    }

    /*
        Inserts a record into the BST
    */
    boolean insert(String keyword, FileData fd)
    {
        //Create new record
        Record record = new Record(fd.id, fd.title, fd.author, null);
        
        //Checks to see if tree is empty
        if(this.root == null) //If tree is empty
        {
            //Add new record at root
            this.root = new BSTNode(keyword, record);
            return true;
        }
        else //if tree is not empty
        {
            BSTNode cRoot = this.root; //current
            BSTNode pRoot = null; //parent

            //Searches BST until the keyword is found
            while(cRoot != null)
            {
                if(cRoot.keyword.compareTo(keyword) > 0) //left
                {
                    pRoot = cRoot;
                    cRoot = cRoot.left;
                }
                else if(cRoot.keyword.compareTo(keyword) < 0) //right
                {
                    pRoot = cRoot;
                    cRoot = cRoot.right;
                }
                else //if keyword is found
                {
                    //add record to the LinkedList
                    record.next = cRoot.record;
                    cRoot.record = record;
                    return true;
                }
            }

            // If the BST does not have the keyword
            BSTNode newNode = new BSTNode(keyword, record); //Create new BST node
            
            //Check once again
            if(pRoot.keyword.compareTo(keyword) > 0) //left
            {
                pRoot.left = newNode;
            }
            else
            {
                pRoot.right = newNode; //Right
            }
            
            return true;
        }
    }

    /*
        Deletes based on keyword
    */    
    boolean delete(String keyword)
    {
        //Check keyword in BST
        if(!contains(keyword)) //if it does not contain the keyword
        {
            return false;
        }
        else //if it contains the keyword
        {
            BSTNode cNode = this.root; //current
            BSTNode pNode = null; //parent

            //Searches the BST until the keyword is found
            while(cNode.keyword.compareTo(keyword) != 0)
            {
                if(cNode.keyword.compareTo(keyword) > 0) //left
                {
                    pNode = cNode;
                    cNode = cNode.left;
                }

                else if(cNode.keyword.compareTo(keyword) < 0) //right
                {
                    pNode = cNode;
                    cNode = cNode.right;
                }
            }
            
            //Checks to see if left node has child
            if(cNode.left == null) //left node does not have child
            {
                if(pNode == null) //current is the root of BST
                {
                    //set new root to the right node of current
                   this.root = cNode.right; 
                }
                else //current is not the root of BST
                {
                    //connect parent node to right node of current node
                    if(pNode.keyword.compareTo(keyword) > 0)
                    {
                        pNode.left = cNode.right;
                    }
                    else
                    {
                        pNode.right = cNode.right;
                    }
                }
            }
            else //left node has child
            {
                BSTNode rightmost = cNode.left;
                BSTNode parentOfRightmost = cNode;

                while(rightmost.right != null)
                {
                    parentOfRightmost = rightmost;
                    rightmost = rightmost.right;
                }
                
                //Copy the rightmost node to the current node
                cNode.keyword = rightmost.keyword;
                cNode.record = rightmost.record;

                 //Connect the parent of rightmost to left child of the rightmost
                 if (parentOfRightmost.right == rightmost) 
                 {
                     parentOfRightmost.right = rightmost.left;
                 }
                 else 
                 {
                     parentOfRightmost.left = rightmost.left;
                 }
            }
            return true;
        }
    }

    /*
        Prints the header
    */
    public void print()
    {
        System.out.println("---------------Print BST Inorder---------------");

        //Print BST
        inorderPrint(this.root);
    }

    /*
        Prints BST inorder recursively
    */
    private void inorderPrint(BSTNode cNode)
    {
        if (cNode != null)
        {
            //Left side of the tree
            inorderPrint(cNode.left);

            //Current keyword
            System.out.printf("%s%n\t", cNode.keyword);

            //Print all records for the keyword
            Record currentRecord = cNode.record;
            while(currentRecord != null)
            {
                System.out.printf("|%d|%s|%s -> ", currentRecord.id, currentRecord.author, currentRecord.title);
                currentRecord = currentRecord.next;
            }

            //At the end of list
            System.out.println("null");

            //Right side of the tree
            inorderPrint(cNode.right);
        }
    }
}