package copiersupport;
import java.io.FileReader;
import java.io.IOException;

/*
* This program receives a file name inputted by a user from MyFileCopier.java. It then reads the contents of the file using
* FileReader. As it reads the file, the program adds each element to an empty string, then closes the file.
*
* @Author Veda Ashok
* @Date 5 September 2018
*
*/

public class SourceFile{
    final int END_OF_FILE = -1;
    FileReader in = null;
    String fn = "";

    /*
    * Constructor
    *
    * @param myFn  (File name)
    */
    public SourceFile(String myFn){
        fn = myFn;
    }

    /*
    *
    * Method getString to read a text file and input the text file content into a string.
    *
    *
    * @return out  (string with text file content)
    *
    */
    public String getString()  throws IOException{
    String out = "";
        try{
            in = new FileReader(fn);
            int m = 0;
            while((m = in.read()) != -1){
            out += (char)m;
            }
        }
        catch(IOException e) {
            System.out.println("ERROR: SourceFile");
        }

        finally{
            if(in != null){
            in.close();
            }
		 
        }

    return out;

    }
}
