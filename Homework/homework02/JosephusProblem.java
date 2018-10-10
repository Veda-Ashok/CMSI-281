import java.util.Arrays;
/*
*This program simulates the Josephus Problem using a circular list
*
*@Author Veda Ashok
*@Author Sam Gibson
*@Date 9 October 2018
*
*/
public class JosephusProblem{
	public static void main(String [] args){
		System.out.println("--------------------Test 1----------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		josephus(10, 10, 4); //remaining should be 5

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("--------------------Test 2----------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		josephus(5, 3, 6); //remaining should be 2

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("--------------------Test 3----------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		josephus(7, 1, 3); //remaining should be 2

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("--------------------Test 4----------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		josephus(300, 4, 5); //remaining should be 117

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();


	}

    /*
    *Josephus method to take in parameters for the number of "people" in the circle, the number to start at, and how many to count
    *
    *
    *@param int numPeople, numStart, numCount
    *@return array result
    *@Author Veda Ashok
    *@Author Sam Gibson
    *@Date 9 October 2018
    *
    */
	public static int[] josephus(int numPeople, int numStart, int numCount){

	if(numStart > numPeople){
		int[] array = new int[1];
		System.out.println("That person doesnt exist!");
		return array;
	}
	if(numCount < 0 ){
		int[] array = new int[1];
		System.out.println("Count can't be negative!");
		return array;
			
	}

	if(numPeople < 0){
		int[] array = new int[1];
		System.out.println("There cannot be negative people!");
		return array;
	}

	if(numPeople == 0){
		int[] array = new int[1];
		System.out.println("There are no people!");
		return array;
	}
	if(numPeople == 1){
		System.out.println("Everyone lives!");
		int[] array = new int[1];
		return array;

	}

	int[] result = new int[numPeople-1];
	int removed = 0;
    IntCircularList myList = new IntCircularList();
      
    for(int x = numPeople; x > 0; x--){
        myList.insert(x);
      
    }
    IntCircularList.Iterator iter = myList.getIterator();
      
    for(int x = 1; x <= numStart; x++){
        myList.step();
        iter.next();
    }

    while(myList.getSize() > 1){
        for(int x = 0; x < numCount; x++){
      	    myList.step();
      	    iter.next();
        }
        
        int y = myList.remove(iter.getCurrentInt());

        removed++;
        result[removed-1] = y;
        
    }


    System.out.print("Last remaining is: " );
    myList.display();
    System.out.println();
    System.out.println();
    System.out.println("Those who died are: " + Arrays.toString(result));


    return result;

    }
}
