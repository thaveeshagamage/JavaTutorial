package tutorialExcercises;

import java.util.Scanner;

public class JavaIfElse {
	public static void main(String[] args) {
		
		int Num1;
		int Num2;
		//int com;
		
		//take Number 1
		System.out.println("Enter Number 1");
		Scanner sc = new Scanner(System.in);
		Num1 = sc.nextInt();
		System.out.println("Enter Number 2");
		Num2 = sc.nextInt();
		
		if(Num1>Num2){
			System .out.println("Largest Number is " + Num1);
		}
		else if(Num1 == Num2) {
			System .out.println("Both numbers are equal");
		}
		else {
			System .out.println("Largest Number is " + Num2);
		
		}
		sc.close();
	
	}
	

}
