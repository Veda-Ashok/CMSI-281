import java.util.Scanner;
/*
* This program is a Hello World program which allows the user to customize the name the program addresses.
*
* @Author Veda Ashok
* @Date 29 August 2018
*
*/

public class SayHello{

        public static void main (String [] args){
		        Scanner myInput = new Scanner (System.in);
		        System.out.println("What is your name?");
		        String inputName = myInput.nextLine();
		        System.out.println("Hello, " + inputName);	

	      }

	
}
