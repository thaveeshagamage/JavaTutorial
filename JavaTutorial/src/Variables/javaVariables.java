package Variables;

import java.util.Scanner;

public class javaVariables {
	public static void main(String [] args) {
		//Variable declarations
		int a;
		int b;
		int Result;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number 1"); //Prompt to Scan number 1 
		a = scn.nextInt();//Scan number 1
		System.out.println("Enter Number 2"); //Prompt to Scan number 2 
		b = scn.nextInt(); //Scan number 2
		
		Result = a + b ; //Calculate Result
		
		System.out.println("The Result is " + Result); //Print Final Result 
		scn.close();
	}

}
