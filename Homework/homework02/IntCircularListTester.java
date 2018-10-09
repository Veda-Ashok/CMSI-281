/*
* This is a tester program that was copied from the lesson and modified for testing a cicular list and by adding more tests
*
*
*@Author Veda Ashok
*@Author Sam Gibson
*@Date 8 October 2018
*
*/
  public class IntCircularListTester {

      public static void main( String[] args ) {
         IntCircularList myList = new IntCircularList();
         myList.insert( 23 );
         myList.insert( 19 );
         myList.insert( 17 );
         myList.insert( 13 );
         myList.insert( 11 );
         myList.insert(  7 );
         myList.insert(  5 );
         myList.insert(  3 );
         myList.insert(  2 );
         IntCircularList.Iterator myCircIt = myList.getIterator();   //get it? MyCircIt. :)

         myList.display();
         myList.search(17);
         myList.search(23);
         myList.search(19);
         myList.search(7);
         myList.search(13);
         myList.search(2);
         myList.search(11);
         myList.search(3);
         myList.search(5);
         myList.search(400);

        
         myList.display();
         myList.remove(11);
         myList.display();
         myList.remove(2);
         myList.display();
         myList.remove(23);
         myList.display();
         myList.remove(40);
         myList.display();
         

         System.out.println();  
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();

         System.out.println("Test set #2: ");
         IntCircularList newList = new IntCircularList();
         newList.insert(15);
         newList.insert(14);
         newList.insert(13);
         newList.insert(12);
         newList.insert(11);
         newList.insert(10);
         newList.insert(9);
         newList.insert(8);
         newList.insert(7);
         newList.insert(6);
         newList.insert(5);
         newList.insert(4);
         newList.insert(3);
         newList.insert(2);
         newList.insert(1);
         newList.insert(0);
         newList.insert(16);

         IntCircularList.Iterator newIt = newList.getIterator();

         newList.display();
         newList.search(15);
         newList.search(14);
         newList.search(13);
         newList.search(12);
         newList.search(11);
         newList.search(10);
         newList.search(9);
         newList.search(8);
         newList.search(7);
         newList.search(6);
         newList.search(5);
         newList.search(4);
         newList.search(3);
         newList.search(2);
         newList.search(1);
         newList.search(0);
         newList.search(16);

        
         newList.display();
         newList.remove(11);
         newList.display();
         newList.remove(2);
         newList.display();
         newList.remove(15);
         newList.display();
         newList.remove(7000);
         newList.display();


         newList.insert(70);
         newList.insert(80);
         newList.insert(90);
         newList.insert(200);
         newList.insert(220);
         newList.insert(240);
         newList.insert(300);
         newList.insert(330);
         newList.insert(360);
         newList.insert(400);
         newList.insert(440);
         newList.display();

         

         System.out.println();  
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();

         

      }

         

   }

            
