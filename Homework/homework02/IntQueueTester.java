/*
* This program is the a tester for the IntQueue program
*
*
*@Author Veda Ashok
*@Date 26 September 2018
*
*/
      public class IntQueueTester{
      
         public static void main( String[] args ) {
            IntQueue testQueue = new IntQueue();
            testQueue.enQueue( 19 );
            testQueue.enQueue( 23 );
            testQueue.enQueue( 29 );
            testQueue.enQueue( 31 );
            testQueue.enQueue( 37 );
            testQueue.enQueue( 41 );
            testQueue.enQueue( 43 );
            testQueue.enQueue( 47 );
            testQueue.enQueue( 51 );
            testQueue.enQueue( 57 );
           

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("----------------------Test 1------------------------");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("Queue is: ");
            testQueue.display();
            System.out.println( "The first in the Queue: " + testQueue.peek() );      // 19
            System.out.println( "Removing first thing: " + testQueue.deQueue() );         // 19 removed
            System.out.println( "The first in the Queue: " + testQueue.peek() );      // 23
            System.out.println( "Removing first thing: "+ testQueue.deQueue() );         // 23 removed
            System.out.println( "The first in the Queue: "+ testQueue.peek() );      // 29
            System.out.println( "Removing first thing: " + testQueue.deQueue() );         // 29 removed
            System.out.println( "The first in the Queue: " + testQueue.peek() );      // 31
            System.out.println("Sum of first 2 in queue: " + (testQueue.deQueue() + testQueue.deQueue()) ); //68

            System.out.println( "The first of the Queue: " + testQueue.peek() );      // 41
           
            testQueue.display();


            IntQueue testQueueTwo = new IntQueue();
            testQueueTwo.enQueue( 20 );
            testQueueTwo.enQueue( 19 );
            testQueueTwo.enQueue( 18 );
            testQueueTwo.enQueue( 17 );
            testQueueTwo.enQueue( 16 );
            testQueueTwo.enQueue( 15 );
            testQueueTwo.enQueue( 14 );
            testQueueTwo.enQueue( 13 );
            testQueueTwo.enQueue( 12 );
            testQueueTwo.enQueue( 11 );
            testQueueTwo.enQueue( 10 );
            testQueueTwo.enQueue( 9 );
            testQueueTwo.enQueue( 8 );
            testQueueTwo.enQueue( 7 );
            testQueueTwo.enQueue( 6 );
            testQueueTwo.enQueue( 5 );
            testQueueTwo.enQueue( 4 );
            testQueueTwo.enQueue( 3 );
            testQueueTwo.enQueue( 2 );
            testQueueTwo.enQueue( 1 );

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("----------------------Test 2------------------------");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();


            
            testQueueTwo.display();

            System.out.println( "The first in the Queue: " + testQueueTwo.peek() );      // 20
            System.out.println( "Removing first thing: " + testQueueTwo.deQueue() );         // 20 removed
            System.out.println( "The first in the Queue: " + testQueueTwo.peek() );      // 19
            System.out.println( "Removing first thing: " + testQueueTwo.deQueue() );         // 19 removed
            System.out.println("Sum of first 2 in queue: " + (testQueueTwo.deQueue() + testQueueTwo.deQueue()) ); //35
            System.out.println( "The first in the Queue: " + testQueueTwo.peek() );      // 16
            System.out.println( "Removing first thing: "+ testQueueTwo.deQueue() );         // 16 removed
            System.out.println( "The first in the Queue: "+ testQueueTwo.peek() );      // 15
            System.out.println( "Removing first thing: " + testQueueTwo.deQueue() );         // 15 removed
            System.out.println( "The first in the Queue: " + testQueueTwo.peek() );      // 14
            System.out.println("Sum of first 2 in queue: " + (testQueueTwo.deQueue() + testQueueTwo.deQueue()) ); //27

            
            testQueueTwo.display();


            IntQueue testQueueThree = new IntQueue();
            testQueueThree.enQueue( 12 );
            testQueueThree.enQueue( 80 );
            testQueueThree.enQueue( 5 );
            testQueueThree.enQueue( 3003 );
            testQueueThree.enQueue( 77 );
            testQueueThree.enQueue( 92 );
            testQueueThree.enQueue( 44 );
            testQueueThree.enQueue( 38 );
            testQueueThree.enQueue( 9000 );
            testQueueThree.enQueue( 9 );
            testQueueThree.enQueue( 56 );
            testQueueThree.enQueue( 22 );
            testQueueThree.enQueue( 60 );

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("----------------------Test 3------------------------");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            
            testQueueThree.display();

            System.out.println( "The first in the Queue: " + testQueueThree.peek() );      // 12
            System.out.println( "Removing first thing: " + testQueueThree.deQueue() );         // 12 removed
            System.out.println( "The first in the Queue: " + testQueueThree.peek() );      // 80
            System.out.println( "Removing first thing: " + testQueueThree.deQueue() );         // 80 removed
            System.out.println("Sum of first 2 in queue: " + (testQueueThree.deQueue() + testQueueThree.deQueue()) ); //3008
            System.out.println( "The first in the Queue: " + testQueueThree.peek() );      // 77
            System.out.println( "Removing first thing: "+ testQueueThree.deQueue() );         // 77 removed
            System.out.println( "The first in the Queue: "+ testQueueThree.peek() );      // 92
            System.out.println( "Removing first thing: " + testQueueThree.deQueue() );         // 92 removed
            System.out.println( "The first in the Queue: " + testQueueThree.peek() );      // 44
            System.out.println("Sum of first 2 in queue: " + (testQueueThree.deQueue() + testQueueThree.deQueue()) ); //82
            System.out.println("Sum of first 2 in queue: " + (testQueueThree.deQueue() + testQueueThree.deQueue()) ); //9009
            System.out.println("Sum of first 2 in queue: " + (testQueueThree.deQueue() + testQueueThree.deQueue()) ); //78
            System.out.println( "The first in the Queue: " + testQueueThree.peek() );      // 60
            System.out.println( "Removing first thing: " + testQueueThree.deQueue() );         // 60 removed
            testQueueThree.peek();         //should be empty

            
            testQueueThree.display();    




         }
   }
