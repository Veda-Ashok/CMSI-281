/*
*This program was copied from the lesson and modified by adding an insert and remove method. Modified for a queue.
*
*@Author Veda Ashok
*@Author Sam Gibson
*@Date 8 October 2018
*
*/

public class IntLinkedList {

    private Node head;
    private int  size;

    // the constructor
    IntLinkedList() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void prepend( int dataToAdd ) {
        Node currentHead = head;
        head = new Node( dataToAdd );
        head.next = currentHead;
        size++;
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

    public Iterator getIteratorAt( int index ) {
        if( (index > size) || (index < 0) ) {
            throw new IllegalArgumentException();
        }
        Iterator it = new Iterator();
        while( index > 0 ) {
            it.next();
            index--;
        }
        return it;
    }

    public class Iterator {
        private Node currentNode;

        Iterator() {
            currentNode = head;
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


    /*
    * Method to get the sise of the queue
    *
    *
    *@param index, value
    *@Author Veda Ashok
    *
    */
    public int getQueueSize(){
        Iterator t = new Iterator();
        int size = 0;
        while(t.hasNext()){
            size++;
            t.next();
        }
       
        return size;     

    }

       /*
        * Insert At method that takes in parameters for an index and a value and inserts a node with that value at that index
        *
        *
        *@param index, value
        *@Author Veda Ashok
        *
        */
        public void insertAt(int index, int value){
            Iterator iter = new Iterator();
            Node newNode = new Node(value);

        if(index == 0){
            prepend(value);
        }
         

        for(int i = 0; i < index - 1; i++){  
             iter.next();

        }
     
        newNode.next = iter.currentNode.next;
        iter.currentNode.next = newNode;
        size++;
    }

        /*
        * RemoveAt method that takes in a parameter for an index and removes the node at that index
        *
        *
        *@param index
        *@Author Veda Ashok
        *
        */
        public int removeAt(int index){
            Iterator iter = new Iterator();


            if(index == 0){
                int y = iter.getCurrentInt();
                this.head = iter.currentNode.next;
                size--;
                return y;
            }
         
            for(int i = 0; i < index - 1 ; i++){  

             iter.next();

            }


        int y = iter.currentNode.next.data;
        iter.currentNode.next = iter.currentNode.next.next;
        size--;   

         return y;

        }
   }
