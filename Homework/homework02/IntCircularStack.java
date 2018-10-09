/*
* This is a program for a stack implemented with a circular list
*
*
*@Author Veda Ashok
*@Author Sam Gibson
*@Date 8 October 2018
*
*/
public class IntCircularStack{
	
      IntCircularList myCircStack;

      IntCircularStack() {
         myCircStack = new IntCircularList();         // constructor
      }

      /*
      * Method to add a value to stack
      *
      *@param itemToPush
      *@Author Veda Ashok
      *@Author Sam Gibson
      *@Date 8 October 2018
      *
      */
      public void push( int itemToPush ) {
      	 
         myCircStack.insert( itemToPush );

      }

      /*
      * Method to return the next value to be removed without removing it
      *
      *@return int value to be remove
      *@Author Veda Ashok
      *@Author Sam Gibson
      *@Date 8 October 2018
      *
      */
      public int peek() {
      	IntCircularList.Iterator iter = myCircStack.getIterator();
      	 
      	if(myCircStack.getSize() == 0){
      		throw new NullPointerException("Stack is empty!");
         
      	}
      	else if(myCircStack.getSize() == 1){
      		return iter.getCurrentInt();
         
      	}
      	iter.next();

        return iter.getCurrentInt();     // we use the iterator
      }

      /*
      * Method to remove value from stack
      *
      *@return int value removed
      *@Author Veda Ashok
      *@Author Sam Gibson
      *@Date 8 October 2018
      *
      */
      public int pop() {
      	IntCircularList.Iterator iter = myCircStack.getIterator();
      	
      	if(myCircStack.getSize() == 0){
      		throw new NullPointerException("Stack is empty!");
         
      	}
      	else if(myCircStack.getSize() == 1){
      		int y  = iter.getCurrentInt();
      		return myCircStack.remove(y);
         
      	}
      	iter.next();
      	int y = iter.getCurrentInt();
      	return myCircStack.remove(y);
      }
      
      //main method
      public static void main( String[] args ) {
         IntCircularStack testCircStack = new IntCircularStack();
         testCircStack.push( 19 );
         testCircStack.push( 23 );
         testCircStack.push( 29 );
         testCircStack.push( 31 );
         testCircStack.push( 37 );
         testCircStack.push( 41 );
         testCircStack.push( 43 );
         testCircStack.push( 47 );
         testCircStack.push( 51 );
         testCircStack.push( 57 );
         System.out.println( "The top of the stack: " + testCircStack.peek() );      // 57
         System.out.println( "Removing top thing: " + testCircStack.pop() );         // 57 removed
         System.out.println( "The top of the stack: " + testCircStack.peek() );      // 51
         System.out.println( "Removing top thing: " + testCircStack.pop() );         // 51 removed
         System.out.println( "The top of the stack: " + testCircStack.peek() );      // 47
         System.out.println( "Removing top thing: " + testCircStack.pop() );         // 47 removed
         System.out.println( "The top of the stack: " + testCircStack.peek() );      // 43
         testCircStack.push( testCircStack.pop() + testCircStack.pop() );
         System.out.println( "The top of the stack: " + testCircStack.peek() );      // 84

         testCircStack.pop();
         System.out.println( "The top of the stack: " + testCircStack.peek() ); 
         testCircStack.pop();
         System.out.println( "The top of the stack: " + testCircStack.peek() ); 
         testCircStack.pop();
         System.out.println( "The top of the stack: " + testCircStack.peek() ); 
         testCircStack.pop();
         System.out.println( "The top of the stack: " + testCircStack.peek() ); 
         testCircStack.pop();
         System.out.println( "The top of the stack: " + testCircStack.peek() ); 
         testCircStack.pop();
         System.out.println( "The top of the stack: " + testCircStack.peek() ); 

           
         
      }


}
  


