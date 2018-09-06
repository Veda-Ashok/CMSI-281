package copiersupport;
import java.io.FileWriter;
import java.io.IOException;

/*
* This program receives a file name inputted by a user from MyFileCopier.java as well as a text file as a String created in SourceFile.java.
* The program takes in the file name and adds ".copy" to the end of the file name. It also takes in the string form of the text file and uses FileWriter to
* rewrite the original text in a new text file.
*
* @Author Veda Ashok
* @Date 5 September 2018
*
*/

public class TargetFile{
    String fn = "";
    String txt = "";

    /*
    *
    * Constructor
    *
    * @param myFn, myTxt  (file name, String of text file content)
    *
    */
    public TargetFile(String myFn, String myTxt){
        fn = myFn;
        txt = myTxt;
    }
    
    /*
    *
    * Method openCopy to write String contents into a new file.
    *
    * @throws IOException if there is an error in rewriting the file.
    *
    */
    public void openCopy() throws IOException{
        FileWriter output = null;
        try {
            output = new FileWriter(fn + ".copy");
            int m = 0;
            while(m < txt.length()){
                output.write((txt.charAt(m)));
                m++;
            }
        }
        catch(IOException e){
            System.out.println("ERROR: TargetFile");
        }
        finally{
            if(output != null){
                output.close();
            }
        }
    }
}
