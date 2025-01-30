package tutorialExcercises;

import java.util.Scanner;

public class JavaTernaryOperator {
	public static void main(String[] args) {
		
		int ex1;
		int ex2;
		
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1");
		ex1= sc.nextInt();
		System.out.println("Enter Number 2");
		ex2= sc.nextInt();
		result = (ex1>ex2) ? ex1 :ex2;
		System.out.println("Largest Number is " + result);
		result = (ex1>ex2) ? ex1 + ex2: ex1-ex2;
		System.out.println("Result is " + result);
		sc.close();
	}
}
