/*
* This program was copied from the lesson and modified from a queue to a deque by adding an insertLeft, insertRight, removeLeft, removeRight,
* isEmpty, and isFull methods
*
*@Author Veda Ashok
*@Author Sam Gibson
*@Date 17 October 2018
*
*/
public class Deque{
  private int maxSize;
  private long[] dequeArray;
  private int left;
  private int right;
  private int nItems;

  public Deque(int s){
    maxSize = s;
    dequeArray = new long[maxSize];
    left = 0;
    right = maxSize - 1;
    nItems = 0;
  }

  /*
  * insertLeft method that takes in a parameter for a value and inserts that value to the left of the deque
  *
  *@param int value to insert
  *@Author Veda Ashok
  *@Author Sam Gibson
  *
  */
  public void insertLeft(long j){
    if(this.isFull()){
      throw new ArrayIndexOutOfBoundsException("You Bozo! The Deque is Full");
    }
    if(left == 0){
      dequeArray[maxSize - 1] = j;
      left = maxSize - 1;
    }
    else{
      dequeArray[left - 1] = j;
      left -= 1;
    }
    nItems++;
  }


  /*
  * insertRight method that takes in a parameter for a value and inserts that value to the right of the deque
  *
  *@param int value to insert
  *@Author Veda Ashok
  *@Author Sam Gibson
  *
  */
  public void insertRight(long j){
    if(this.isFull()){
      throw new ArrayIndexOutOfBoundsException("You Bozo! The Deque is Full");
    }
    if(right == maxSize - 1){
      dequeArray[0] = j;
      right = 0;
    }
    else {
      dequeArray[right + 1] = j;
      right++;
    }
    nItems++;
  }

  /*
  * removeLeft method that removes the first value from the left of the deque
  *
  *@Author Veda Ashok
  *@Author Sam Gibson
  *
  */
  public long removeLeft(){
    if(this.isEmpty()){
      throw new ArrayIndexOutOfBoundsException("You Bozo! The Deque is Empty");
    }
    long temp = dequeArray[0];
    if(left == maxSize - 1){
      left = 0;
    }
    else {
      left++;
    }
    nItems--;
    return temp;
  }

  /*
  * removeRight method that removes the first value from the right of the deque
  *
  *@Author Veda Ashok
  *@Author Sam Gibson
  *
  */
  public long removeRight(){
    if(this.isEmpty()){
      throw new ArrayIndexOutOfBoundsException("You Bozo! The Deque is Empty");
    }
    long temp = dequeArray[nItems - 1];
    if(right == 0){
      right = maxSize - 1;
    }
    else {
      right--;
    }
    nItems--;
    return temp;
  }


  /*
  * isEmpty method that returns true if the deque is empty
  *
  *@Author Veda Ashok
  *@Author Sam Gibson
  *
  */
  public boolean isEmpty(){
    return nItems == 0;
  }

  /*
  * isFull method that returns true if the deque is full
  *
  *@Author Veda Ashok
  *@Author Sam Gibson
  *
  */
  public boolean isFull(){
    return nItems == maxSize;
  }

  
  /*
  * display method to display deque
  *
  *@Author Veda Ashok
  *@Author Sam Gibson
  *
  */
  public void display(){
    for(int i = 0; i < nItems; i++){
      if(left + i >= maxSize){
        System.out.print(dequeArray[left + i - maxSize] + " ");
      }
      else {
        System.out.print(dequeArray[left + i] + " ");
      }
    }
    System.out.println();
  }

  public static void main(String[] args){
    Deque test = new Deque(10);
    for(int i = 0; i < 5; i++){
      test.insertLeft(i);
    }
    for(int i = 5; i < 10; i++){
      test.insertRight(i);
    }
    test.display();
    //test.insertRight(12985);
    for(int i = 0; i < 3; i++){
      test.removeLeft();
    }
    test.display();
    for(int i = 0; i < 3; i++){
      test.removeRight();
    }
    test.display();
    test.insertLeft(10);
    test.insertRight(11);
    test.display();
    for(int i = 0; i < 3; i++){
      test.removeLeft();
    }
    test.display();

  /*  for(int i = 0; i <= 6; i++){
      test.removeRight();
    } */
  }
}
