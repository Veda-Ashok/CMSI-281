//highArray.java
//demonstrates array class with high-level interface
//to run this program: C>java HighArrayApp
////////////////////////////////////////////////////////////

class HighArray{
    private long[] a;    //ref to array a
    private int nElems;  // number of data items

//-------------------------------------------------------
    public HighArray(int max){   //constructor
        a = new long[max];     //create the array
        nElems = 0;            // no items yet
    }
//-------------------------------------------------------

    public boolean find(long searchKey){
        int j;
        for(j = 0; j < nElems; j++){
             if(a[j] == searchKey){
             break;
        }
    }
        if(j == nElems){
            return false;
        }
        else{
            return true;
        }
    }

//--------------------------------------------------------

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }
//--------------------------------------------------------

    public boolean delete(long value){
        int j;
        for (j = 0; j < nElems; j++){
            if(value == a[j]){
            break;
            }
        }
        if(j == nElems){
            return false;
        }
        else{
            for(int k = j; k <nElems; k++){
                a[k] = a[k+1];
            }
            nElems--;
            return true;
        }
    }
//-----------------------------------------------------

    public void display(){
        for(int j = 0; j < nElems; j++){
            System.out.print(a[j] + "  ");
        }

        System.out.println(" ");		
    }
//-----------------------------------------------------


    /*
    * Method that gets maximum value from array
    *
    * @Author Veda Ashok
    * @Date 14 September 2018
    *
    */
    public long getMax(){
        int j = 0;
        long bigValue;

        if(a.length == 0){
            System.out.println("The array is empty!");
            return -1;
        }
        else{
            bigValue = a[j];
            for(j = 1; j < nElems; j++){
                if(bigValue < a[j]){
                    bigValue = a[j];
                }
            }
            return bigValue;
        }
    }

    /*
    * Method that removes all duplicates of a number in the array except for the first occurrence of number. 
    *
    * @Author Veda Ashok
    * @Date 14 September 2018
    *
    */
    public void noDups(){
        for(int j = 0; j < nElems - 1; j++){
            for(int x = j+1; x < nElems; x++){
                if(a[j] == a[x]){
                    for(int i = x; i < nElems; i++){
                        a[i] = a[i+1];
                    }	
                    x--;
                    nElems--;		
                }
            }
        }
    }
}
