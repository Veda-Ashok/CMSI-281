/*
* This program implements the interface IntListInterface.java. The program deals with adding and removing elements from
* a list. It implements the insertValueAtIndex() method, and ensures to increase the size of the list if the additional elements are to
* exceed the lists capacity. 
*
* @Author Veda Ashok
* @Date 12 September 2018
*
*/

public class IntList implements IntListInterface  {
    private int[] theList;
    private int[] theNewList;
    private int   size;

    private static final int STARTING_SIZE = 19;    // defines starting size; don't worry, we'll deal


    /*
    * Constructor
    *
    */
    public IntList() {                        // doesn't HAVE to be declared public, but doesn't hurt
        theList = new int[STARTING_SIZE];
        size = 0;
    }

    /*
    *
    * Method getValueAtIndex to retrieve the value stored at a particular index in the list.
    *
    * @param index
    * @return value at index
    */
    public int getValueAtIndex( int index ) {
        if(index < size){
            return theList[index];
        }
        else{
            return theNewList[index];
        }
    }

    /*
    *
    * Method append add an element to the end of the list.
    *
    * @param valueToAdd
    * @return true
    *
    */
    public boolean append( int valueToAdd ) {
        if( size < theList.length ) {
            theList[size] = valueToAdd;
            size++;
        }
        else if(size > theList.length){
            theNewList = new int[ theList.length + STARTING_SIZE];
            for(int m = 0; m < size - 1; m++){
                theNewList[m] = theList[m];
            }
            theNewList[size] = valueToAdd;
            size++;
        }
        return true;
    }

    /*
    *
    * Method prepend add an element to the beginning of the list and shift all other elements ahead by one index.
    *
    * @param valueToAdd
    * @return true
    *
    */
    public boolean prepend(int valueToAdd){
        if( size < theList.length ) {
            theList[0] = valueToAdd;
            size++;
        }
        else if(size > theList.length){
             theNewList = new int[ STARTING_SIZE * 2];
            for(int m = 0; m < size - 1; m++){
                theNewList[m] = theList[m];
            }
            theNewList[0] = valueToAdd;
            for (int i = 1; i < size - 1; i++){
                theNewList[i] = theList[i - 1];
            }
            size++;
        }
        return true;   
    }

    /*
    *
    * Method insertValueAtIndex to call checkIndex() and insertValue();
    *
    * @param value, index
    * @return value
    *
    */
    public int insertValueAtIndex(int value, int index ) {
        checkIndex(index);
        insertValue(value, index);
        return value;
    }

    /*
    *
    * Method removeValueAtIndex to call checkIndex() and holeFiller();
    *
    * @param index
    * @return value
    *
    */
    public int removeValueAtIndex( int index )  {
        int value = theList[index];
        checkIndex(index);
        holeFiller(index);
        return value;
      }

    /*
    * Method checkIndex to call validate index value as positive, or to check if size is 0 (empty list)
    *
    * @param index
    * @throws IllegalArgumentException
    * @return void
    *
    */
    public void checkIndex(int index) throws IllegalArgumentException{
        if( size == 0 ) {
            throw new IllegalArgumentException( "The list is empty!" );  
        }
        else if( index < 0 ) {
            throw new IllegalArgumentException( "The index value must be positive!");
        } 
    }

    /*
    *
    * Method holeFiller to close holes in string after removing an element by shifting all elements proceeding 
    * removed value to the previous index and decreasing the size of list.
    *
    * @param index
    * @return void
    *
    */
    private void holeFiller( int index ) {
        size--;
        for( int i = index; i < size; i++ ) {
            theList[i] = theList[i+1];
        }
         
    }

    /*
    *
    * Method insertValue to insert a value at a given index in the list. If index is greater that list size,
    * additional space will be added to the list by creating a new copy of the list. At indecies in which no
    * value is specified, a 0 will be stored. If index is less than original list size, value will be stored at index
    * and all other elements of list proceeding inserted value will be shifted to the next index.
    *
    * @param value, index
    * @return void
    *
    */
    private void insertValue(int value, int index){ 
        if(index > theList.length){
            theNewList = new int[STARTING_SIZE * 2];
            for(int m = 0; m < theList.length - 1; m++){
                theNewList[m] = theList[m];
            }
            for(int m = theList.length; m <= index; m++){
                theNewList[m] = 0;
                if(m == index){
                    theNewList[m] = value;           
                    size++;
                }
               
            }
               
         
        }
        else if(index < theList.length){
            for (int i = index + 1; i < size - 1; i++){
                theList[i] = theList[i-1];
            }
            theList[index] = value;
            size ++;
               
        }         

    }

    /*
    *
    * Main method with test code.
    *
    * @param args
    * @return void
    *
    */
    public static void main( String[] args ) {
        IntList list = new IntList();
         list.append( 2 );
         list.append( 3 );
         list.append( 5 );
         list.append( 7 );
         System.out.println( list.getValueAtIndex( 3 ) );   // should return the value 7
         list.append( 11 );
         list.append( 13 );
         list.append( 17 );
         list.append( 19 );
         list.append( 50 );
         list.append( 24 );
         list.append( 8 );
         list.append( 12 );
         list.append( 99 );
         list.append( 1 );
         list.append( 6 );
         list.append( 4 );

         System.out.println( list.getValueAtIndex( 7 ) );      // should return the value 19
         System.out.println( list.removeValueAtIndex( 3 ) );   // should return the value 7
         System.out.println( list.getValueAtIndex( 3 ) );      // should return the value 11
         System.out.println( list.getValueAtIndex( 8) );       //should return the value 24

         System.out.println( list.getValueAtIndex( 12 ) );     //should return the value 1
         list.removeValueAtIndex(12);
         System.out.println( list.getValueAtIndex( 12 ) );     //should return the value 6

         System.out.println( list.getValueAtIndex( 7 ) );      //should retrun the value 50
         list.removeValueAtIndex(7);                          
         System.out.println( list.getValueAtIndex( 7 ) );      //should return the value 24

         System.out.println( list.getValueAtIndex(9));         //should return the value 12
         System.out.println( list.getValueAtIndex(10));        //should return the value 99
         list.insertValueAtIndex(4000, 9);
         System.out.println( list.getValueAtIndex(9));         ////should return the value 4000
         System.out.println( list.getValueAtIndex(10));        //should return the value 12

         System.out.println( list.getValueAtIndex(0));        //should return the value 2
         list.prepend(700);
         System.out.println( list.getValueAtIndex(0));        //should return the value 700

         list.insertValueAtIndex(2020, 24);
         System.out.println( list.getValueAtIndex(24));        //should return the value 2020
         System.out.println( list.getValueAtIndex(22));        //should return the value 0
         

         System.out.println( list.getValueAtIndex( 70 ) );     // just to see what happens



      }
   }
