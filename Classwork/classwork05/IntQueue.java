/*
* This program is the IntStack program copied from the lesson and modified to represent a Queue instead of a Stack.
*
*@Author Veda Ashok
*@Date 26 September 2018
*
*/
public class IntQueue {

      IntLinkedList myQueue;

      /*
      * Constructor
      *
      */
      IntQueue() {
         myQueue = new IntLinkedList();         // constructor
      }

      /*
      * Method to add something to the queue
      *
      *
      *@param value to queue
      *@return void
      *
      */
      public void enQueue( int itemToQueue ) {
         myQueue.prepend( itemToQueue );
      }

      /*
      * Method to look at the net thing to be removed 
      *
      *@return int at end of queue
      *
      */
      public int peek() {
      
         return myQueue.getIteratorAt(myQueue.getQueueSize()).getCurrentInt();     // we use the iterator
         
      }

      /*
      * Method to remove last item in queue (item that was first in)
      *
      *@return int value of item removed
      *
      */
      public int deQueue() {
        
        return myQueue.removeAt(myQueue.getQueueSize());

        }
      
   }
