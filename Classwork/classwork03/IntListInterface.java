/*
* This program is an interface outlining the methods used for IntList.java
*
* @Author Veda Ashok
* @Date 12 September 2018
*
*/
public interface IntListInterface {
      int getValueAtIndex( int index );
      boolean append( int valueToAdd );
      int insertValueAtIndex( int value, int index );
      int removeValueAtIndex( int index );
   }
