/*
* This program was copied from the lesson and modified by adding an insert, remove, and display method. Modified for a curcular list.
*
*@Author Veda Ashok
*@Author Sam Gibson
*@Date 8 October 2018
*
*/

public class IntCircularList {

    private Node current;
    private int  size;

    // the constructor
    IntCircularList() {
        current = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    

    private class Node {
        int data;            // remember this is an IntLinkedList
        Node next;           // here's the self-referential part

        // constructor
        Node( int d ) {
            data = d;
            next = null;
        }


    }

    public Iterator getIterator() {
        Iterator it = new Iterator();
        return it;
    }

    public class Iterator {
        private Node currentNode;

        Iterator() {
            currentNode = current;
        }

        public void next() {
            if( currentNode == null ) {
                return;
            } else {
                currentNode = currentNode.next;
            }
        }

        public boolean hasNext() {
            return ((currentNode != null) && (currentNode.next != null));
        }

        public int getCurrentInt() {
            if(currentNode == null){
                return -1;
            }
            return currentNode.data;
        }

    }

        public boolean search(int value){
        	Iterator iter = new Iterator();

        	for(int i = 0; i < size; i++){  
                if(iter.currentNode.data == value){         
                     System.out.println("Value Found!");
                     return true;  
                }

                iter.next();

            }

            System.out.println("Value not found.");
            return false;

        }

        public void step(){

        	current = current.next;
        }




       /*
        * Insert method that takes in parameters for  a value and inserts a node with that value into the circular list
        *
        *
        *@param value
        *@Author Veda Ashok
        *@Author Sam Gibson
        *
        */
        public void insert(int value){
            
            Node newNode = new Node(value);
            if(size == 0){
            	current = newNode;
            	size++;
            	return;
            }

            newNode.next = current.next;
            current.next = newNode;
            size++;

            if(size == 2){
              	newNode.next = current;

            }
      

    }

        /*
        * Remove method that takes in a parameter for a value and removes any nodes in the circular list that contain that value
        *
        *
        *@param index
        *@Author Veda Ashok
        *@Author Sam Gibson
        */
        public int remove(int value){
            Iterator iter = new Iterator();

   
            for(int i = 0; i < size; i++){  
                if(iter.currentNode.next.data == value){
                	if(iter.currentNode.next == current){
            		    current = iter.currentNode; 
            	    }
                	 int y = iter.currentNode.next.data;
                     iter.currentNode.next = iter.currentNode.next.next;
                     size--; 
                     return y;  
                }


                iter.next();
            }

            System.out.println("Value not found.");
            return -1;

        }

        /*
        * Display method to display the circular list
        *
        *
        *@param index
        *@Author Veda Ashok
        *@Author Sam Gibson
        */
        public void display(){
        	Iterator iter = new Iterator();
        	for(int i = 0; i < size; i++){  
        		
                System.out.print(iter.currentNode.data + " ");
                iter.next();
            }
            System.out.println();

        }

}
