import copiersupport.*;
import java.util.Scanner;
import java.io.IOException;

/*
* This program  prompts the user to enter a file name. The program then sends the file name to SourceFile.java. After
* receiving the file back from SourceFile.java as a String, this program sends the file name as well as the String
* to TargetFile.java and opens a copy of the original file.
*
* @Author Veda Ashok
* @Date 5 September 2018
*
*/


public class MyFileCopier{
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the source file name: " );
        String fileName = input.nextLine();
        SourceFile sf = new SourceFile(fileName);
        try{
            String fileContents = sf.getString();
            TargetFile tf = new TargetFile(fileName, fileContents);
            tf.openCopy();
        } 
        catch(IOException e){
        	System.out.println("ERROR: MyFileCopier");
        }
    }
}
