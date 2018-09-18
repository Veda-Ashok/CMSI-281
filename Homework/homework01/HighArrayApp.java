/*
* This program is a test harness for HighArray.java. It is taken from the textbook and modified with more tests.
*
* @Author Veda Ashok
* @Date 14 September 2018
*
*/

class HighArrayApp{
	  public static void main(String[] args){
		int maxSize = 100;
		HighArray arr;
		arr = new HighArray(maxSize);
		int searchKey;

		//add elements to the array
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		arr.insert(48);
		arr.insert(99);
		arr.insert(3);
		arr.insert(67);
		arr.insert(6000);
		arr.insert(20);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		arr.insert(33);
		arr.insert(33);
		arr.insert(33);
		arr.insert(33);
		arr.insert(12);
		arr.insert(4);
		arr.insert(79);
		arr.insert(23);
		arr.insert(7);
		arr.insert(90);
		arr.insert(3);
		arr.insert(76);
		arr.insert(44);
		arr.insert(200);
		arr.insert(350);
		arr.insert(5);
		arr.insert(9);
		arr.insert(70);
		arr.insert(6);
		arr.insert(27);
		arr.insert(34);
		arr.insert(73);
		arr.insert(87);
		arr.insert(10);
		arr.insert(8);
		arr.insert(14);
		arr.insert(17);
		arr.insert(40);

		System.out.println("Array is:  ");
		arr.display();
		System.out.println();

    //test to see if 200 is found
		searchKey = 200;
		if(arr.find(searchKey)){
			System.out.println("Found " + searchKey);
		}
		else{
			System.out.println("Can't find " + searchKey);
		}
        
    //test to see if 6000 is found
		searchKey = 6000;
		if(arr.find(searchKey)){
			System.out.println("Found " + searchKey);
		}
		else{
			System.out.println("Can't find " + searchKey);
		}


		//test getMax
		System.out.println();
		System.out.println("The max value in the array is " + arr.getMax() + ".");  //should be 6000
		System.out.println();

    //delete from Array
		arr.delete(13);
		arr.delete(4);
		arr.delete(6000);
		arr.delete(12);
		arr.delete(33);

		System.out.println("Array after deleting 13, 4, 6000, 12, and 33: ");
    arr.display();
    System.out.println();


    //test to see if 35 is found
		searchKey = 35;
		if(arr.find(searchKey)){
			System.out.println("Found " + searchKey);
		}
		else{
			System.out.println("Can't find " + searchKey);
		}
        
    //test to see if 6000 is found after deleting it
		searchKey = 6000;
		if(arr.find(searchKey)){
			System.out.println("Found " + searchKey);
		}
		else{
			System.out.println("Can't find " + searchKey);
		}

    //test getMax after deleting max value
    System.out.println();
    System.out.println("The max value in the array is " + arr.getMax() + "."); //should be 350
		System.out.println();


    //test noDups
		arr.noDups();
		System.out.println("Array after noDups:  ");
		arr.display();
		System.out.println();
  
    //delete from array
		arr.delete(00);
		arr.delete(55);
		arr.delete(99);

    System.out.println("Array after deleting 0, 55, and 99");
		arr.display();
		System.out.println();


		//add duplicates to array
		arr.insert(77);
		arr.insert(44);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(66);
		arr.insert(3);
		arr.insert(67);
		arr.insert(20);
		arr.insert(33);
        
    System.out.println("Array after adding duplicates of the array to itself: ");
		arr.display();
		System.out.println();

		//test noDups after adding duplicates
		arr.noDups();
		System.out.println("Array after noDups: ");
		arr.display();    //should match display from before insertions
		System.out.println();
		
	}
}
