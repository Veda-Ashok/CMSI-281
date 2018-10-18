/*
* This program was copied from the lesson and modified by assing a display method
*
*@Author Veda Ashok
*@Author Sam Gibson
*@Date 17 October 2018
*
*/
class Queue {
  private int maxSize;
  private long[] queArray;
  private int front;
  private int rear;
  private int nItems;
  public Queue(int s){
    maxSize = s;
    queArray = new long[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
  }


 /*
  * display method to display queue and handle wrapping at the end of the array 
  *
  *@Author Veda Ashok
  *@Author Sam Gibson
  *
  */
  public void display(){
    for(int i = 0; i < nItems; i++){
      if(front + i >= maxSize){
        System.out.print(queArray[front + i - maxSize] + " ");
      }
      else {
        System.out.print(queArray[front + i] + " ");
      }
    }
    System.out.println();
  }

  public void insert(long j) {
    if(rear == maxSize-1){
      rear = -1;
    }
    queArray[++rear] = j;
    nItems++;
  }

  public long remove(){
    long temp = queArray[front++]; // get value and incr front
    if(front == maxSize){
      front = 0;
    }
    nItems--; // one less item return temp;
    return temp;
  }
  public long peekFront(){
    return queArray[front];
  }

  public boolean isEmpty(){
    return (nItems==0);
  }
  public boolean isFull(){
    return (nItems==maxSize);
  }
  public int size() {
    return nItems;
  }

  public static void main(String[] args){
    Queue test = new Queue(10);
    for(int i = 0; i < 10; i++){
      test.insert(i);
    }
    test.display();
    for(int i = 0; i < 5; i++){
      test.remove();
    }
    test.display();
    test.insert(10);
    test.insert(11);
    test.display();
  }
}
