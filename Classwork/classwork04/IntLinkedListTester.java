/*
* This is a tester program that was copied from the lesson and modified by adding more tests.
*
*
*@Date 19 September 2018
*
*/
  public class IntLinkedListTester {

      public static void main( String[] args ) {
         IntLinkedList myList = new IntLinkedList();
         myList.prepend( 23 );
         myList.prepend( 19 );
         myList.prepend( 17 );
         myList.prepend( 13 );
         myList.prepend( 11 );
         myList.prepend(  7 );
         myList.prepend(  5 );
         myList.prepend(  3 );
         myList.prepend(  2 );
         IntLinkedList.Iterator myIt = myList.getIteratorAt( 0 );
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 3
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 5
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
         myIt = myList.getIteratorAt( 3 );
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 11
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 13
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );  
         myList.insertAt(2, 5);
         myIt = myList.getIteratorAt(2);
         System.out.println("Node at 2 is: " + myIt.getCurrentInt());         // 5
         myList.insertAt(5, 3);
         myIt = myList.getIteratorAt(5);
         System.out.println("Node at 5 is: " + myIt.getCurrentInt());          //3
         myList.removeAt(7);
         myIt = myList.getIteratorAt(7);
         System.out.println("Node at 7 is: " + myIt.getCurrentInt());          //17

         System.out.println();  
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();

         System.out.println("Test set #2: ");
         IntLinkedList newList = new IntLinkedList();
         newList.prepend(15);
         newList.prepend(14);
         newList.prepend(13);
         newList.prepend(12);
         newList.prepend(11);
         newList.prepend(10);
         newList.prepend(9);
         newList.prepend(8);
         newList.prepend(7);
         newList.prepend(6);
         newList.prepend(5);
         newList.prepend(4);
         newList.prepend(3);
         newList.prepend(2);
         newList.prepend(1);
         newList.prepend(0);

         IntLinkedList.Iterator newIt = newList.getIteratorAt(0);

         System.out.println( "Current Node is: " + newIt.getCurrentInt() );    // 0
         newIt.next();
         System.out.println( "Current Node is: " + newIt.getCurrentInt() );    // 1
         newIt.next();
         System.out.println( "Current Node is: " + newIt.getCurrentInt() );    // 2
         newIt.next();
         System.out.println( "Current Node is: " + newIt.getCurrentInt() );    // 3
         newIt.next();
         System.out.println( "Current Node is: " + newIt.getCurrentInt() );    // 4
         newIt.next();
         System.out.println( "Current Node is: " + newIt.getCurrentInt() );    // 5
         newIt.next();
         System.out.println( "Current Node is: " + newIt.getCurrentInt() );    // 6
         newIt.next();
         System.out.println( "Current Node is: " + newIt.getCurrentInt() );    // 7
         newIt.next();
         System.out.println( "Current Node is: " + newIt.getCurrentInt() );    // 8
         newIt.next();
         System.out.println( "Current Node is: " + newIt.getCurrentInt() );    // 9
         newIt.next();
         System.out.println( "Current Node is: " + newIt.getCurrentInt() );    // 10
         newIt.next();
         System.out.println( "Current Node is: " + newIt.getCurrentInt() );    // 11
         newIt.next();
         System.out.println( "Current Node is: " + newIt.getCurrentInt() );    // 12
         newIt.next();
         System.out.println( "Current Node is: " + newIt.getCurrentInt() );    // 13
         newIt.next();
         System.out.println( "Current Node is: " + newIt.getCurrentInt() );    // 14
         newIt.next();
         System.out.println( "Current Node is: " + newIt.getCurrentInt() );    // 15


         newList.removeAt(7);
         newIt = newList.getIteratorAt(7);
         System.out.println("Node at 7 is: " + newIt.getCurrentInt());         // 8 
         newList.removeAt(8);
         newIt = newList.getIteratorAt(8);
         System.out.println("Node at 8 is: " + newIt.getCurrentInt());         // 10
         newList.removeAt(9);
         newIt = newList.getIteratorAt(9);
         System.out.println("Node at 9 is: " + newIt.getCurrentInt());         // 12
         newList.removeAt(10);
         newIt = newList.getIteratorAt(10);
         System.out.println("Node at 10 is: " + newIt.getCurrentInt());         // 14 

         newList.insertAt(0, 2);
         newIt = newList.getIteratorAt(0);
         System.out.println("Node at 0 is: " + newIt.getCurrentInt());         // 2
         newList.insertAt(2, 4);
         newIt = newList.getIteratorAt(2);
         System.out.println("Node at 2 is: " + newIt.getCurrentInt());         // 4
         newList.insertAt(4, 6);
         newIt = newList.getIteratorAt(4);
         System.out.println("Node at 4 is: " + newIt.getCurrentInt());         // 6
         newList.insertAt(6, 8);
         newIt = newList.getIteratorAt(6);
         System.out.println("Node at 6 is: " + newIt.getCurrentInt());         // 8




      }

         

   }

            
