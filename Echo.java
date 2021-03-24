package Project02;

import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
	//PREPARE (Store - Declarations
		
	//INPUT
	Scanner kb;
	String input;
	String inout;
		//Instatntation
	//PROCESS
	kb=new Scanner(System.in);
	System.out.println("Enter yo Name");
	input=kb.nextLine();
	inout=kb.nextLine();
	//OUTPUT
	System.out.println(input+" "+inout);
	
	kb.close();
	
		
	}// ending bracket method main
	
}
